package reuben.learning.basic

open class Shape

class Rectangle(height: Double, length: Double) : Shape() {
    val perimeter = (height + length) * 2
}