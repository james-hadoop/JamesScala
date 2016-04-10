package james.scala.oop

class AbstractClass {
    var id: Int = _
}

abstract class SuperTeacher(val name: String) {
    var id: Int
    var age: Int
    def teach
}

class TeacherForMaths(name: String) extends SuperTeacher(name) {
    override var id = name.hashCode()
    override var age = 29

    override def teach {
        println("Teaching maths!")
    }
}

object AbstractClass {
    def main(args: Array[String]) {
        val teacher = new TeacherForMaths("Maths")
        teacher.teach
        println("teacher id=" + teacher.id)
        println("teacher name=" + teacher.name)
        println
    }
}