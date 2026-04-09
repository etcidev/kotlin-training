package tasks.codewars.kyu8.reversed_sequence

import kotlin.test.Test
import kotlin.test.assertEquals

class ReversedSequenceTest {

    @Test
    fun basicCases() {
        assertEquals(listOf(5,4,3,2,1), reverseSeq(5))
        assertEquals(listOf(3,2,1), reverseSeq(3))
        assertEquals(listOf(1), reverseSeq(1))
    }
}
