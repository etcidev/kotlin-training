package tasks.leetcode.easy.remove_duplicates_from_sorted_array

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class RemoveDuplicatesFromSortedArrayTest {

    private val solution = Solution()

    @Test
    fun removesDuplicatesFromShortArray() {
        val numbers = intArrayOf(1, 1, 2)

        val uniqueCount = solution.removeDuplicates(numbers)

        assertEquals(2, uniqueCount)
        assertContentEquals(intArrayOf(1, 2), numbers.copyOf(uniqueCount))
    }

    @Test
    fun removesSeveralDuplicateGroups() {
        val numbers = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)

        val uniqueCount = solution.removeDuplicates(numbers)

        assertEquals(5, uniqueCount)
        assertContentEquals(intArrayOf(0, 1, 2, 3, 4), numbers.copyOf(uniqueCount))
    }

    @Test
    fun keepsArrayWithoutDuplicates() {
        val numbers = intArrayOf(-3, -1, 0, 2, 5)

        val uniqueCount = solution.removeDuplicates(numbers)

        assertEquals(5, uniqueCount)
        assertContentEquals(intArrayOf(-3, -1, 0, 2, 5), numbers.copyOf(uniqueCount))
    }

    @Test
    fun leavesOneValueWhenAllValuesAreEqual() {
        val numbers = intArrayOf(7, 7, 7, 7)

        val uniqueCount = solution.removeDuplicates(numbers)

        assertEquals(1, uniqueCount)
        assertContentEquals(intArrayOf(7), numbers.copyOf(uniqueCount))
    }
}
