package tasks.leetcode.medium.stone_game_ii

import kotlin.test.Test
import kotlin.test.assertEquals

class StoneGameIITest {

    private val solution = Solution()

    @Test
    fun choosesBestMovesAcrossSeveralTurns() {
        val piles = intArrayOf(2, 7, 9, 4, 4)

        assertEquals(10, solution.stoneGameII(piles))
    }

    @Test
    fun savesLargeFinalPileForOptimalSequence() {
        val piles = intArrayOf(1, 2, 3, 4, 5, 100)

        assertEquals(104, solution.stoneGameII(piles))
    }

    @Test
    fun takesTheOnlyPile() {
        val piles = intArrayOf(8)

        assertEquals(8, solution.stoneGameII(piles))
    }

    @Test
    fun takesAllPilesWhenInitialLimitAllowsIt() {
        val piles = intArrayOf(5, 9)

        assertEquals(14, solution.stoneGameII(piles))
    }
}
