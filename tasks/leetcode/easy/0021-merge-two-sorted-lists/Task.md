# 21. Merge Two Sorted Lists

[LeetCode problem](https://leetcode.com/problems/merge-two-sorted-lists/)

**Difficulty:** Easy  
**Topics:** Linked List, Recursion  
**Language:** Kotlin

## Description

You are given the heads of two linked lists sorted in non-decreasing order.
Merge them into one sorted list by reconnecting the existing nodes and return
the head of the merged list.

## Условие на русском

Даны головы двух односвязных списков, отсортированных по неубыванию.
Объедините их в один отсортированный список, переиспользуя существующие узлы,
и верните голову получившегося списка.

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

## Approach

Create a temporary dummy node and keep a pointer to the tail of the merged
list. Compare the current nodes of both lists and append the node with the
smaller value. When one list is exhausted, attach the remainder of the other
list. The dummy node removes the need to handle the first result node as a
special case.

## Решение

Создаём фиктивный начальный узел и храним указатель на конец результирующего
списка. На каждом шаге сравниваем текущие узлы двух списков и присоединяем узел
с меньшим значением. Когда один список заканчивается, присоединяем оставшуюся
часть второго списка. Фиктивный узел позволяет не обрабатывать первый элемент
отдельно.

## Complexity

- Time: `O(n + m)`
- Extra space: `O(1)`

## Result

- Status: Accepted
- Test cases: 208 / 208
- Runtime: 0 ms
- Memory: 42.9 MB
