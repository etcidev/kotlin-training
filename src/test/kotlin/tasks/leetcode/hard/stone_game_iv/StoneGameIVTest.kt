package tasks.leetcode.hard.stone_game_iv

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class StoneGameIVTest {

    private val solution = Solution()

    @Test
    fun winsByRemovingTheOnlyStone() {
        assertTrue(solution.winnerSquareGame(1))
    }

    @Test
    fun losesWhenEveryMoveGivesOpponentAWinningState() {
        assertFalse(solution.winnerSquareGame(2))
    }

    @Test
    fun winsByRemovingAllStonesFromPerfectSquare() {
        assertTrue(solution.winnerSquareGame(4))
    }

    @Test
    fun recognizesLosingStateAfterSeveralPossibleMoves() {
        assertFalse(solution.winnerSquareGame(7))
    }

    @Test
    fun handlesMaximumAllowedInput() {
        assertTrue(solution.winnerSquareGame(100_000))
    }
}
