package reuben.learning.basic

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class FunctionKtTest {

    @Test
    fun sumTest() {
        val sum = sum(1, 3)
        assertEquals(4, sum)
    }

    @Test
    fun printSumTest() {
        printSum(1, 3)
    }
}