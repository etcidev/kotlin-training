# Stone Game II (LeetCode Medium)

[View the problem on LeetCode](https://leetcode.com/problems/stone-game-ii/)

## 📝 Description

Alice and Bob alternately take piles from the beginning of a row, with Alice
moving first. On each turn, a player takes between `1` and `2 * M` piles. After
taking `X` piles, `M` becomes the larger of its current value and `X`.

Both players choose their moves optimally. Find the greatest number of stones
Alice can collect.

### Examples

```text
Input:  piles = [2, 7, 9, 4, 4]
Output: 10

Input:  piles = [1, 2, 3, 4, 5, 100]
Output: 104
```

### Constraints

- The array contains between `1` and `100` piles.
- Each pile contains between `1` and `10,000` stones.

---

## 💡 Idea

Describe a game state with two values: the index of the first remaining pile
and the current value of `M`.

For every allowed number of piles, calculate the best result the opponent can
get from the next state. The current player receives all remaining stones
except that opponent result. Try every legal move and keep the largest value.

A suffix-sum array provides the number of remaining stones in constant time,
and memoization prevents the same game state from being solved repeatedly.

---

## 🛠️ Implementation Details

The function signature required by LeetCode:

```kotlin
fun stoneGameII(piles: IntArray): Int
```

If `2 * M` is at least the number of remaining piles, the current player can
take every pile immediately. Otherwise, an ordinary loop checks each legal
choice and recursively evaluates the next state.

---

## ⏱️ Complexity

- Time: `O(n³)` because there are `O(n²)` states and up to `O(n)` moves per state
- Space: `O(n²)` for memoization, plus `O(n)` recursion depth and suffix sums

---

## 🧠 Notes

- Each memoized value is the best score for the player whose turn begins at
  that state, so the same method works for both Alice and Bob.
- Subtracting the opponent's score from the remaining sum avoids storing both
  players' totals.
- The suffix sum also makes the take-all base case direct and easy to verify.

---

## ✅ Result

- Status: Accepted
- Test cases: 92 / 92
- Runtime: 14 ms
- Memory: 46 MB
