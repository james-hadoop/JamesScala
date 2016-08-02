package james.scala.oop

class ApplyTest {
    def apply() = println("I am into Spark so much!")

    def haveATry {
        println("Have a try on apply!")
    }
}

object ApplyTest {
    def apply() = {
        println("I am into Scala so much!")
        new ApplyTest
    }
}

object ApplyOpt {
    def main(args: Array[String]) {
        val array = Array(1, 2, 3, 4)
        // object apply
        val o = ApplyTest()
        o.apply
        o.haveATry
        println

        val c = new ApplyTest
        c.haveATry
        // class apply
        println(c())
    }
}