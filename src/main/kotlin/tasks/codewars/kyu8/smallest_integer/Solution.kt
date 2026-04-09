package tasks.codewars.kyu8.smallest_integer

/**
 * Returns the smallest integer from the given array.
 *
 * Assumes the array is not empty.
 */

fun findSmallestInt(numbers: IntArray): Int = numbers.minOrNull()!!

// Alternative solution
/*fun findSmallestInt(numbers: IntArray): Int {
    var minValue = numbers[0]
    for (n in numbers) {
        if (n < minValue) minValue = n
    }
    return minValue
}*/

