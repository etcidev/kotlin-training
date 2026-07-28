# Remove Duplicates from Sorted Array (LeetCode Easy)

[View the problem on LeetCode](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)

## 📝 Description

Given an integer array sorted in non-decreasing order, remove duplicate values
in-place so that every unique value appears once.

Return the number of unique values. The first returned number of positions in
the array must contain those unique values in their original order.

### Examples

```text
Input:  nums = [1, 1, 2]
Output: 2, nums = [1, 2, _]

Input:  nums = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
Output: 5, nums = [0, 1, 2, 3, 4, _, _, _, _, _]
```

### Constraints

- The array contains between `1` and `30,000` elements.
- Every value is between `-100` and `100`.
- The array is sorted in non-decreasing order.

---

## 💡 Idea

Use two indexes:

- `readIndex` checks every value in the array
- `writeIndex` marks the position for the next unique value

Because the array is sorted, equal values are next to each other. A value is
new when it differs from the last unique value already written to the front of
the array.

---

## 🛠️ Implementation Details

The function signature required by LeetCode:

```kotlin
fun removeDuplicates(nums: IntArray): Int
```

The array always contains at least one value, so the first value is already
unique and `writeIndex` starts at `1`.

---

## ⏱️ Complexity

- Time: `O(n)`
- Space: `O(1)`

---

## 🧠 Notes

- The solution changes the original array.
- Values after the returned number of positions do not matter.
- No additional array or collection is required.

---

## ✅ Result

- Status: Accepted
- Test cases: 362 / 362
- Runtime: 1 ms
- Memory: 48.8 MB
