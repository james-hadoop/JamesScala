package james.scala.oop

class Person {
    private var age = 0
    def increment() { age += 1 }
    def current = age
}

class Student {
    var age = 0
}

class Student2 {
    private[this] var privateAge = 0

    def age = privateAge

    def age_(age: Int) {
        this.privateAge = age
    }

    // alert error because of "private[this]"
    //def isYounger(other: Student2) = privateAge < other.privateAge
}

object HelloOOp {
    def main(args: Array[String]) {
        val person = new Person()
        person.increment
        person.increment
        println(person.current)
        println

        val student = new Student
        student.age = 10
        println(student.age)
        println

        val student2 = new Student2
        student2.age_(8)
        println(student2.age)
    }
}