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
        val items = listOf("dog", "cat")
        for (item in items) {
            println(item)
        }
        var result: String = ""
        for (item in items) {
            result += item
        }
        assertEquals("dogcat", result)
    }

    @Test
    fun forLoopIndices() {
        val items = listOf("dog", "cat")
        for (index in items.indices) {
            println("$index : ${items[index]}")
        }
    }

    @Test
    fun whileLoop() {

    }

    @Test
    fun collection() {
        val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
        val startsWithA = fruits.filter { it.startsWith("a") }
        assertEquals(listOf("avocado", "apple"), startsWithA)
        val sorted = startsWithA.sortedBy { it }
        assertEquals(listOf("apple", "avocado"), sorted)
        val uppercases = sorted.map { it.uppercase() }
        assertEquals(listOf("APPLE", "AVOCADO"), uppercases)

        val collection = fruits.filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.uppercase() }
        assertEquals(uppercases, collection)
    }

    @Test
    fun collectionMap() {
        val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
        val ints = fruits.map { it.length }
        assertEquals(listOf(6, 7, 5, 9), ints)
    }
}