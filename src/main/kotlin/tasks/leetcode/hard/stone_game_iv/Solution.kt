package tasks.leetcode.hard.stone_game_iv

class Solution {
    fun winnerSquareGame(n: Int): Boolean {
        val canWin = BooleanArray(n + 1)

        for (stoneCount in 1..n) {
            var removedRoot = 1

            while (removedRoot * removedRoot <= stoneCount) {
                val remainingStones = stoneCount - removedRoot * removedRoot

                if (!canWin[remainingStones]) {
                    canWin[stoneCount] = true
                    break
                }

                removedRoot++
            }
        }

        return canWin[n]
    }
}
