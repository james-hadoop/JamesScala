package com.james.FunctionalProgramming

/**
  * Created by james on 16-12-28.
  */
object CallBackDemo extends App {
    def sayHello = () => {
        println("hello")
    }

    def execute(callback: () => Unit) = {
        println("do something...")
        callback()
    }

    execute(sayHello)
    println

    def sayHello2: (Int => Unit) = (times) => {
        println(s"hello $times")
    }

    def execute2(callback: Int => Unit, times: Int) = {
        println("do something...")
        (0 to times).foreach(sayHello2)
    }

    execute2(sayHello2, 3)
}
