package reuben.learning.basic

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class RectangleTest {

    @Test
    fun getPerimeter() {
        val rectangle = Rectangle(5.0, 2.0)
        assertEquals((5.0 + 2.0) * 2, rectangle.perimeter)
    }
}