package james.scala.function

object PartialApplyFunction extends App {
    val data = List(1, 2, 3, 4, 5, 6)
    data.foreach { print _ }
    println
    data.foreach(x => print(x))
    println

    def sum(a: Int, b: Int, c: Int) = a + b + c
    println(sum(1, 2, 3))
    println

    val fp_a = sum _
    println(fp_a(1, 2, 3))
    println(fp_a.apply(1, 2, 3))
    println

    val fp_b = sum(1, _: Int, 3)
    println(fp_b(2))
    println(fp_b(10))
    println

    data.foreach(print _)
    println
    data.foreach(print)
}