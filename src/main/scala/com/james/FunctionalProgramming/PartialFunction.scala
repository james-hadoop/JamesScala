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
}
