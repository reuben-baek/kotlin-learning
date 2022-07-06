package reuben.learning.basic

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class VariableKtTest {

    @Test
    fun incrementXTest() {
        assertEquals(5, x)
        incrementX()
        assertEquals(6, x)
    }
}