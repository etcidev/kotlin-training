# Row Sum of Odd Numbers (CodeWars 7kyu)

## 📝 Description

Given the triangle of consecutive odd numbers:
```
               1
            3     5
         7     9    11
      13    15    17    19
   21    23    25    27    29
               ...
```

Calculate the sum of the numbers in the nth row of this triangle (starting at index 1).

### Examples

1 → 1  
2 → 3 + 5 = 8

## 💡 Idea

The sum of the numbers in the nth row equals: `n³`

### Why is the sum equal to `n³`?
1. The nth row contains exactly n consecutive odd numbers.
2. The first number of the nth row equals:

   n² − (n − 1)

3. The row consists of n consecutive odd numbers, so their sum equals:

   n × (average of first and last number)

4. The last number of the row equals:

   n² + (n − 1)

5. The average of first and last number is:

   ( (n² − (n − 1)) + (n² + (n − 1)) ) / 2  
   = 2n² / 2  
   = n²

6. Therefore, the sum of the row equals:

   n × n² = `n³`

## ⏱ Complexity

- Time: O(1)
- Space: O(1)

## 🧠 Notes

Instead of constructing the triangle explicitly, we use the mathematical property that the sum of the nth row equals n³.




