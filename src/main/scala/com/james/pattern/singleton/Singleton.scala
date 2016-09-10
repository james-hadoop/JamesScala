package com.james.pattern.singleton

/**
  * Created by james on 16-9-10.
  */
object Singleton extends Runnable {
    var mark = 1

    override def run(): Unit = {
        println("mark=" + mark)
    }
}

object Main extends App{
    Singleton.run()
    Singleton.run()
    println

    Singleton.mark=2
    Singleton.run()
    Singleton.run()

    println
    Singleton.mark=3
    Singleton.run()
    Singleton.run()
}
