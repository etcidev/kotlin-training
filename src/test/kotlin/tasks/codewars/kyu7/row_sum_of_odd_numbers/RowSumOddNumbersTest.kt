package tasks.codewars.kyu7.row_sum_of_odd_numbers

import kotlin.test.Test
import kotlin.test.assertEquals

class RowSumOddNumbersTest {

    @Test
    fun basicCases() {
        assertEquals(1, rowSumOddNumbers(1))
        assertEquals(8, rowSumOddNumbers(2))
        assertEquals(27, rowSumOddNumbers(3))
        assertEquals(64, rowSumOddNumbers(4))
        assertEquals(125, rowSumOddNumbers(5))
    }
}
