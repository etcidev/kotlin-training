package tasks.leetcode.easy.merge_two_sorted_lists

import kotlin.test.Test
import kotlin.test.assertContentEquals

class MergeTwoSortedListsTest {

    private val solution = Solution()

    @Test
    fun mergesTwoNonEmptySortedLists() {
        val result = solution.mergeTwoLists(nodeListOf(1, 2, 4), nodeListOf(1, 3, 4))

        assertContentEquals(listOf(1, 1, 2, 3, 4, 4), result.toList())
    }

    @Test
    fun mergesTwoEmptyLists() {
        val result = solution.mergeTwoLists(null, null)

        assertContentEquals(emptyList(), result.toList())
    }

    @Test
    fun returnsNonEmptyListWhenOtherListIsEmpty() {
        val result = solution.mergeTwoLists(null, nodeListOf(0))

        assertContentEquals(listOf(0), result.toList())
    }

    @Test
    fun supportsNegativeValuesAndDuplicates() {
        val result = solution.mergeTwoLists(nodeListOf(-3, -1, 2), nodeListOf(-2, -1, 4))

        assertContentEquals(listOf(-3, -2, -1, -1, 2, 4), result.toList())
    }

    private fun nodeListOf(vararg values: Int): ListNode? {
        val dummy = ListNode(0)
        var tail = dummy
        for (value in values) {
            tail.next = ListNode(value)
            tail = tail.next!!
        }
        return dummy.next
    }

    private fun ListNode?.toList(): List<Int> {
        val values = mutableListOf<Int>()
        var current = this
        while (current != null) {
            values += current.`val`
            current = current.next
        }
        return values
    }
}
