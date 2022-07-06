package reuben.learning.basic

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class StringTemplateTest {

    @Test
    fun stringTemplates() {
        var a = 1
        val s1 = "a is $a"
        assertEquals("a is 1", s1)
        a = 2
        val s2 = "${s1.replace("is", "was")}, but now is $a"
        assertEquals("a was 1, but now is 2", s2)
    }
}