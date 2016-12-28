package com.james.oop

/**
  * Created by james on 16-12-28.
  */
object CaseClass extends App {
    var a = A("a", 18)
    a.show
    println(a.name)
    println(a.age)
    println

    var b = B("b", 20)
    b.show
    println(b.name)
    println(b.age)
    b.age = 18
    println(b.age)

    println

    val c = C1("C1")
    c match {
        case C1("C1") => println("match C1(\"C1\")")
        case C1("C2") => println("match C1(\"C2\")")
    }

    println

    def caseOps(c: C) = c match {
        case C1(name) => println("match C1(name))")
        case C2(name) => println("match C2(name))")
    }

    caseOps(c)
}

case class A(val name: String, val age: Int) {
    def show(): Unit = {
        println("name=" + name + " age=" + age)
    }
}

case class B(var name: String, var age: Int) {
    def show(): Unit = {
        println("name=" + name + " age=" + age)
    }
}

trait C

case class C1(name: String = "C1") extends C {
}

case class C2(name: String = "C2") extends C {
}