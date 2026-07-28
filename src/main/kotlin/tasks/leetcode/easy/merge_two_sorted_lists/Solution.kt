package tasks.leetcode.easy.merge_two_sorted_lists

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val dummy = ListNode(0)
        var tail = dummy
        var left = list1
        var right = list2

        while (left != null && right != null) {
            if (left.`val` <= right.`val`) {
                tail.next = left
                left = left.next
            } else {
                tail.next = right
                right = right.next
            }
            tail = tail.next!!
        }

        tail.next = left ?: right
        return dummy.next
    }
}
