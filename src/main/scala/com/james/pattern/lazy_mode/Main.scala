package com.james.pattern.lazy_mode

/**
  * Created by james on 16-9-10.
  */
object Main extends App {
    lazy val x = {
        print("(computing x) ")
        42
    }
    print("x = ")
    println(x)
}
