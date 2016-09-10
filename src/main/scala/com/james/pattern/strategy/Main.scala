package com.james.pattern.strategy

/**
  * Created by james on 16-9-11.
  */
object Main extends App {
    type Strategy = (Int, Int) => Int

    val add: Strategy = _ + _
    val multiply: Strategy = _ * _

    class Context(compute: Strategy) {
        def use(a: Int, b: Int): Int = {
            compute(a, b)
        }
    }

    println((new Context(multiply)).use(2, 3))
}
