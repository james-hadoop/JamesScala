package com.james.oop

/**
  * Created by james on 16-12-28.
  */
object Entity extends App {
    val a = new E1("E1")
    a.show

    println

    val b = new E2
    b.name = "E2"
    b.show

    println

    println(a.isInstanceOf[E1])
    println(a.isInstanceOf[E2])

    println

    a match {
        case e: E1 => println("match E1")
        case e: E2 => println("match E2")
    }
}

class E1(private var _name: String) {
    def name = _name

    def name_=(aName: String) {
        _name = aName
    }

    def show: Unit = {
        println(s"name=$name")
    }
}

class E2() {
    var name: String = _

    def show: Unit = {
        println(s"name=$name")
    }
}


