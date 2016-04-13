package james.scala.function

import java.math._

object HighOrderFunction {
    def main(args: Array[String]) {
        println("*" * 5)
        println

        (1 to 9).map("*" * _).foreach { println _ }
        println

        (1 to 9).filter(_ % 2 == 0).foreach(println)
        println

        "Spark is the most exciting thing happening in big data today".split(" ").sortWith(_.length < _.length).foreach(println)
        println

        val triple = (x: Double) => 3 * x
        Array(3.14, 1.42, 2.0).map((x: Double) => 3 * x).foreach(print)
        println
        Array(3.14, 1.42, 2.0).map { (x: Double) => 3 * x }.foreach(print)
        println
        Array(3.14, 1.42, 2.0).map(triple).foreach(print)
        println
        println

        def double = (x: Double) => x * 2
        def high_order_function(f: (Double) => Double) = f(0.25)
        println(high_order_function(double))
        println

        def mulBy(factor: Double) = (x: Double) => factor * x
        val quintuple = mulBy(5)
        println(quintuple(20))
        println

        println(high_order_function((x: Double) => 3 * x))
        println(high_order_function((x) => 3 * x))
        println(high_order_function(x => 3 * x))
        println(high_order_function(3 * _))
        println

        val fun2 = 3 * (_: Double)
        val fun3: (Double) => Double = 3 * _
    }
}