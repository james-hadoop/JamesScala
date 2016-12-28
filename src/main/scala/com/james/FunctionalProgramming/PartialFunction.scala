package com.james.FunctionalProgramming

/**
  * Created by james on 16-12-29.
  */
object PartialFunction extends App {
    def sum(x: Int, y: Int, z: Int): Int = {
        x + y + z
    }

    val f = sum(1, 2, _: Int)

    println(f(3))

    val divide = new PartialFunction[Int, Int] {
        def apply(x: Int) = 42 / x

        def isDefinedAt(x: Int) = x != 0
    }

    println(divide.isDefinedAt(1))
    println(divide(7))
    println

    val convertLowNumToString = new PartialFunction[Int, String] {
        val nums = Array("one", "two", "three", "four", "five")

        def apply(i: Int) = nums(i - 1)

        def isDefinedAt(i: Int) = i > 0 && i < 6
    }
    println(convertLowNumToString(3))
}
