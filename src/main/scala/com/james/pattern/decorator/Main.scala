package com.james.pattern.decorator

/**
  * Created by james on 16-9-10.
  */
object Main extends App {
    (new OrdinaryDo("Thing") with TDecoratorDo).doSomething
}

trait TDo {
    def doSomething
}

class OrdinaryDo(thing: String) extends TDo {
    override def doSomething: Unit = {
        println("ordinary doSomething(): " + thing)
    }
}

trait TDecoratorDo extends TDo {
    // abstract is necessary
    abstract override def doSomething: Unit = {
        super.doSomething
        println("decorator doSomething()")
    }
}
