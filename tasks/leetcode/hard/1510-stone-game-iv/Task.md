# Stone Game IV (LeetCode Hard)

[View the problem on LeetCode](https://leetcode.com/problems/stone-game-iv/)

## 📝 Description

Alice and Bob alternate turns removing stones from one pile, and Alice moves
first. Each move must remove a positive perfect-square number of stones. A
player who has no valid move loses.

Given the initial number of stones, determine whether Alice can force a win
when both players choose their moves optimally.

### Examples

```text
Input:  n = 1
Output: true

Input:  n = 2
Output: false

Input:  n = 4
Output: true
```

### Constraints

- `1 <= n <= 100,000`
- A move removes `1, 4, 9, 16, ...` stones without exceeding the pile.

---

## 💡 Idea

Build the answer from smaller piles to larger piles.

For every `stoneCount`, try each square number that can be removed. The current
position is winning if at least one move leaves a losing position for the
opponent. If every possible move leaves a winning position, the current
position is losing.

The empty pile is the starting base case: it is losing because no move is
possible.

---

## 🛠️ Implementation Details

The function signature required by LeetCode:

```kotlin
fun winnerSquareGame(n: Int): Boolean
```

`canWin[stoneCount]` records whether the player whose turn starts with that
many stones can force a win. For each state, `removedRoot` generates square
moves as `removedRoot * removedRoot`. The loop stops as soon as it finds a move
to a losing state.

---

## ⏱️ Complexity

- Time: `O(n * sqrt(n))`
- Space: `O(n)`

---

## 🧠 Notes

- A perfect-square pile is immediately winning because all stones can be
  removed in one move.
- The table describes the player whose turn it is, so it works equally for
  Alice's and Bob's turns.
- No recursive call stack is needed.

---

## ✅ Result

- Status: Accepted
- Test cases: 72 / 72
- Runtime: 14 ms
- Memory: 40.4 MB
