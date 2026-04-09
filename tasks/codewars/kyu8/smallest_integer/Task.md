# Smallest Integer (CodeWars 8kyu)

## 📝 Description

Given an array of integers, return the smallest integer.

The array is guaranteed to be non-empty.

### Examples

[34, 15, 88, 2] → 2  
[34, -345, -1, 100] → -345  
[1] → 1

---

## 💡 Idea

To find the smallest number, we need to compare elements in the array.

- take the array
- find the minimum value
- return it

---

## 🛠 Implementation Details

The function signature required by CodeWars:

```kotlin
fun findSmallestInt(numbers: IntArray): Int
```

---

## ⏱ Complexity

Time: O(n)  
Space: O(1)

## 🧠 Notes

The array is guaranteed to be non-empty, so using `!!` is safe.