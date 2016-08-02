package james.scala.pattern

/**
  * Created by james on 16-4-16.
  */
abstract class Person

case class Student(age: Int) extends Person

case class Worker(age: Int, salary: Double) extends Person

case object Shared extends Person

object CaseClass {
  def main(args: Array[String]): Unit = {
    def caseOps(person: Person) = person match {
      case Student(age) => println("Student: age=" + age)
      case Worker(_, salary) => println("Worker: salary=" + salary)
      case Shared => println("No property")
    }

    caseOps(Student(18))
    caseOps(Shared)

    val worker = Worker(26, 10000.0)
    val worker1 = worker.copy(salary = 10.1)
    val worker2 = worker.copy(salary = 20.2)

    caseOps(worker)
    caseOps(worker1)
    caseOps(worker2)
  }
}
