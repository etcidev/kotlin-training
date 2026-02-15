from __future__ import annotations

import re
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1]
README = ROOT / "README.md"
TASKS = ROOT / "tasks"

LC_START = "<!-- PROGRESS:LEETCODE:START -->"
LC_END = "<!-- PROGRESS:LEETCODE:END -->"
CW_START = "<!-- PROGRESS:CODEWARS:START -->"
CW_END = "<!-- PROGRESS:CODEWARS:END -->"


def slug_to_title(slug: str) -> str:
    # "row-sum-of-odd-numbers" -> "Row Sum Of Odd Numbers"
    return " ".join(w.capitalize() for w in slug.split("-"))


def read_first_heading(task_md: Path) -> str | None:
    if not task_md.exists():
        return None
    for line in task_md.read_text(encoding="utf-8").splitlines():
        line = line.strip()
        if line.startswith("# "):
            return line[2:].strip()
    return None


def build_codewars_rows() -> list[str]:
    rows = []
    base = TASKS / "codewars"
    if not base.exists():
        return rows

    for kyu_dir in sorted(base.iterdir()):
        if not kyu_dir.is_dir():
            continue
        # expects: 8kyu, 7kyu, 6kyu...
        kyu = kyu_dir.name

        for task_dir in sorted(kyu_dir.iterdir()):
            if not task_dir.is_dir():
                continue
            slug = task_dir.name
            title = read_first_heading(task_dir / "Task.md") or slug_to_title(slug)
            topic = "-"  # можно потом улучшить (например, читать из Task.md)
            status = "✅"
            rows.append(f"| {kyu} | {title} | {topic} | {status} |")

    return rows


def build_leetcode_rows() -> list[str]:
    rows = []
    base = TASKS / "leetcode"
    if not base.exists():
        return rows

    for diff_dir in sorted(base.iterdir()):
        if not diff_dir.is_dir():
            continue
        difficulty = diff_dir.name  # easy/medium/hard

        for task_dir in sorted(diff_dir.iterdir()):
            if not task_dir.is_dir():
                continue

            # expects: 0001-two-sum
            name = task_dir.name
            m = re.match(r"^(\d+)-(.*)$", name)
            if m:
                number = m.group(1)
                slug = m.group(2)
            else:
                number = "-"
                slug = name

            title = read_first_heading(task_dir / "Task.md") or slug_to_title(slug)
            topic = "-"
            status = "✅"
            rows.append(f"| {number} | {title} | {difficulty} | {topic} | {status} |")

    return rows


def replace_block(text: str, start: str, end: str, new_block: str) -> str:
    pattern = re.compile(re.escape(start) + r".*?" + re.escape(end), re.DOTALL)
    replacement = start + "\n" + new_block.rstrip() + "\n" + end
    if not pattern.search(text):
        raise RuntimeError(f"Markers not found: {start} ... {end}")
    return pattern.sub(replacement, text, count=1)


def main() -> None:
    md = README.read_text(encoding="utf-8")

    # CodeWars table
    cw_rows = build_codewars_rows()
    if not cw_rows:
        cw_rows = ["| - | - | - | - |"]
    cw_table = "\n".join([
        "| Kyu | Title | Topic | Status |",
        "|-----|-------|-------|--------|",
        *cw_rows
    ])

    # LeetCode table
    lc_rows = build_leetcode_rows()
    if not lc_rows:
        lc_rows = ["| - | - | - | - | - |"]
    lc_table = "\n".join([
        "| # | Title | Difficulty | Topic | Status |",
        "|---|-------|------------|-------|--------|",
        *lc_rows
    ])

    md = replace_block(md, LC_START, LC_END, lc_table)
    md = replace_block(md, CW_START, CW_END, cw_table)

    README.write_text(md, encoding="utf-8")
    print("README.md updated")


if __name__ == "__main__":
    main()
