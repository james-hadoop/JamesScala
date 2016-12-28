package com.james.FunctionalProgramming

/**
  * Created by james on 16-12-29.
  */
object FunctionReturnFunction extends App {
    def saySomething(prefix: String) = (something: String) => {
        prefix + " " + something
    }

    def say = saySomething("hello")

    println(say(" world"))
}
