# Merge Two Sorted Lists (LeetCode Easy)

[View the problem on LeetCode](https://leetcode.com/problems/merge-two-sorted-lists/)

## 📝 Description

You are given the heads of two linked lists sorted in non-decreasing order.

Merge them into one sorted list by reconnecting the existing nodes and return
the head of the merged list.

### Examples

```text
Input:  list1 = [1, 2, 4], list2 = [1, 3, 4]
Output: [1, 1, 2, 3, 4, 4]

Input:  list1 = [], list2 = []
Output: []

Input:  list1 = [], list2 = [0]
Output: [0]
```

### Constraints

- The total number of nodes is between `0` and `50`.
- Each node value is between `-100` and `100`.
- Both input lists are sorted in non-decreasing order.

---

## 💡 Idea

Keep a pointer to the current node in each input list.

- compare the values of the two current nodes
- connect the smaller node to the result
- move forward in the list from which the node was taken
- when one list ends, connect the remaining part of the other list

A dummy node is used at the beginning of the result so that the first real
node does not require separate handling.

---

## 🛠️ Implementation Details

The function signature required by LeetCode:

```kotlin
fun mergeTwoLists(
    list1: ListNode?,
    list2: ListNode?
): ListNode?
```

The algorithm reconnects the existing nodes instead of creating a copy of
every value.

---

## ⏱️ Complexity

- Time: `O(n + m)`
- Space: `O(1)`

---

## 🧠 Notes

- `ListNode?` means that a node can be `null`.
- The dummy node is not included in the returned list.
- `firstNode ?: secondNode` selects the list that still has nodes remaining.

---

## ✅ Result

- Status: Accepted
- Test cases: 208 / 208
- Runtime: 0 ms
- Memory: 42.9 MB
