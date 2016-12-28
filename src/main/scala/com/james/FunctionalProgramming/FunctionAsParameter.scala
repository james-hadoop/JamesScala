package com.james.FunctionalProgramming

/**
  * Created by james on 16-12-28.
  */
object FunctionAsParameter extends App {
    def double = (i: Int) => {
        i * 2
    }

    var i = 2
    println(s"i=$i double(i)=" + double(i))
    println

    def add1 = (x: Int, y: Int) => {
        x + y
    }

    def add2: (Int, Int) => Int = (x, y) => {
        x + y
    }

    var x = 1
    var y = 2

    println("add1()=" + add1(x, y))
    println("add2()=" + add2(x, y))
}
