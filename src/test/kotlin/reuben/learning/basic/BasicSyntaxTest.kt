package reuben.learning.basic

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BasicSyntaxTest {
    @Test
    fun conditionalExpression() {
        val a = 10
        val b = 5
        val max = if (a > b) a else b
        assertEquals(a, max)
    }

    @Test
    fun forLoop() {

    }

    @Test
    fun whileLoop() {

    }
}