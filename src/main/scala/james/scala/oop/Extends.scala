package james.scala.oop

class Person1(val name: String, var age: Int) {
    println("The primary constructor of Person")

    val school = "ECNU"

    def sleep = "8 hours"

    override def toString = "I am a Person"
}

class Worker(name: String, age: Int, val salary: Long) extends Person1(name, age) {
    println("This is subClass of Person, primary constructor of Worker")

    override val school = "Spark"

    override def toString = "I am a Worker " + super.sleep
}

object Extends {
    def main(args: Array[String]) {
        val w = new Worker("worker", 5, 100000)

        println("School: " + w.school)
        println("Salary: " + w.salary)
        println(w.toString())
    }
}