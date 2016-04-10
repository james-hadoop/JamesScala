package james.scala.oop

class University {
    val id = University.newStudentNo
    private var number = 0

    def aClass(number: Int) {
        this.number += number
    }
}

object University {
    private var studentNo = 0

    def newStudentNo = {
        studentNo += 1
        studentNo
    }
}

object ObjectOpt {
    def main(args: Array[String]) {
        println(University.newStudentNo)
        println(University.newStudentNo)
        println

        val array = Array(1, 2, 3, 4)
    }
}