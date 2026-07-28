package tasks.leetcode.easy.remove_duplicates_from_sorted_array

class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var writeIndex = 1

        for (readIndex in 1 until nums.size) {
            val currentNumber = nums[readIndex]
            val previousUniqueNumber = nums[writeIndex - 1]

            if (currentNumber != previousUniqueNumber) {
                nums[writeIndex] = currentNumber
                writeIndex++
            }
        }

        return writeIndex
    }
}
