# Invert Values (CodeWars 8kyu)

## 📝 Description

Given an array of integers, return a new array where each number is replaced with its additive inverse.

Each positive number becomes negative, and each negative number becomes positive.

### Examples

[1, 2, 3, 4, 5] → [-1, -2, -3, -4, -5]  
[1, -2, 3, -4, 5] → [-1, 2, -3, 4, -5]  
[] → []  
[0] → [0]

---

## 💡 Idea

The additive inverse of a number is obtained by multiplying it by `-1`.

For each element in the input array:
- take the value
- multiply it by `-1`
- store the result in a new array

In Kotlin, we can transform arrays using `map` and convert the result back to `IntArray`.

---

## 🛠 Implementation Details

The function signature required by CodeWars:

```kotlin
fun invert(arr: IntArray): IntArray
We return a new IntArray instead of modifying the original array.

