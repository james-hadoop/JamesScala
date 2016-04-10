package james.scala.oop

class Teacher {
    var name: String = _
    private var age = 27
    private[this] val gender = "male"

    def this(name: String) {
        this
        this.name = name
    }

    def sayHello {
        println("name=" + name + "  age=" + age)
    }
}

class Teacher2(val name: String, val age: Int) {
    println("This is the primary constructor!")
    var gender: String = _
    println(gender)

    def this(name: String, age: Int, gender: String) {
        this(name, age)
        this.gender = gender
    }
}

object ConstructorOps {
    def main(args: Array[String]) {
        val t = new Teacher
        t.name = "Spark"
        t.name = "";
        t.sayHello

        val t2 = new Teacher2("Spark", 5, "male")
        println(": " + t2.age)
    }
}