package tasks.codewars.kyu8.smallest_integer

import kotlin.test.Test
import kotlin.test.assertEquals

class SmallestIntegerTest {

    @Test
    fun basicCases() {
        assertEquals(2, findSmallestInt(intArrayOf(34, 15, 88, 2)))
        assertEquals(-345, findSmallestInt(intArrayOf(34, -345, -1, 100)))
        assertEquals(1, findSmallestInt(intArrayOf(1)))
        assertEquals(0, findSmallestInt(intArrayOf(5, 3, 0, 9)))
        assertEquals(-10, findSmallestInt(intArrayOf(-10, -3, -5, -1)))
        assertEquals(7, findSmallestInt(intArrayOf(7, 7, 7, 7)))
    }
}