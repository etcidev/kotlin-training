package tasks.codewars.kyu8.invert_values

/**
 * Returns an array where each number is replaced
 * with its additive inverse.
 *
 * Example:
 * [1, -2, 3] -> [-1, 2, -3]
 */
fun invert(arr: IntArray): IntArray = arr.map { -it }.toIntArray()