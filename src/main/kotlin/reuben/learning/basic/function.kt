package reuben.learning.basic

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun printSum(a: Int, b: Int): Unit {
    val s = sum(a, b)
    println("sum of $a and $b is $s")
}