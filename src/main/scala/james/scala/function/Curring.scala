package james.scala.function

object Curring {
    def main(args: Array[String]) {
        def multiple(x: Int, y: Int) = x * y
        def multipleOne(x: Int) = (y: Int) => x * y
        def multipleTwo(x: Int)(y: Int) = (x * y)
        println(multiple(6, 7))
        println(multipleOne(6))
        println(multipleOne(6)(7))
        println(multipleTwo(6)(7))
        println

        def curring(x: Int)(y: Int) = x * y

        val a = Array("Hello", "Spark")
        val b = Array("hello", "spark")
        println(a.corresponds(b)(_.equalsIgnoreCase(_)))
    }
}