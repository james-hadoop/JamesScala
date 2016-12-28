package com.james.oop

/**
  * Created by james on 16-12-28.
  */
object driver extends App {
    var o1 = CompanionObject()
    o1.show

    var o2 = CompanionObject("value")
    o2.show
}

class CompanionObject(var value: String) {
    def this() {
        this("")
    }

    def show(): Unit = {
        println(s"value=$value")
    }
}

object CompanionObject {
    def apply(): CompanionObject = {
        new CompanionObject
    }

    def apply(value: String): CompanionObject = {
        new CompanionObject(value)
    }
}
