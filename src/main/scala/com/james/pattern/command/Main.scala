package com.james.pattern.command

/**
  * Created by james on 16-9-11.
  */
object Main extends App {
    Invoker.invoke(println("foo"))
    Invoker.invoke {
        println("bar 1")
        println("bar 2")
    }

    Invoker.execute
}

object Invoker {
    private var history: Seq[() => Unit] = Seq.empty

    def invoke(command: => Unit) {
        history :+= command _
    }

    def execute = {
        for (elem <- history) {
            elem.apply()
        }
    }
}
