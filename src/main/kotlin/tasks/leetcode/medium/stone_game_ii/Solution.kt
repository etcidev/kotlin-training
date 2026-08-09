package tasks.leetcode.medium.stone_game_ii

class Solution {
    fun stoneGameII(piles: IntArray): Int {
        val suffixSum = IntArray(piles.size + 1)
        for (index in piles.lastIndex downTo 0) {
            suffixSum[index] = piles[index] + suffixSum[index + 1]
        }

        val memo = Array(piles.size) { IntArray(piles.size + 1) { -1 } }

        fun maximumStones(startIndex: Int, currentM: Int): Int {
            val remainingPiles = piles.size - startIndex
            if (2 * currentM >= remainingPiles) {
                return suffixSum[startIndex]
            }

            if (memo[startIndex][currentM] != -1) {
                return memo[startIndex][currentM]
            }

            var bestResult = 0
            val maximumTakenPiles = minOf(2 * currentM, remainingPiles)

            for (takenPiles in 1..maximumTakenPiles) {
                val nextM = maxOf(currentM, takenPiles)
                val opponentResult = maximumStones(startIndex + takenPiles, nextM)
                val currentResult = suffixSum[startIndex] - opponentResult
                bestResult = maxOf(bestResult, currentResult)
            }

            memo[startIndex][currentM] = bestResult
            return bestResult
        }

        return maximumStones(startIndex = 0, currentM = 1)
    }
}
