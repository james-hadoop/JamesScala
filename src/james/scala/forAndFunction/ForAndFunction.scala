package james.scala.forAndFunction

import scala.io.Source

object ForAndFunction {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 2; j <- 1 to 3) print(i * 10 + j + "  ")
    println("\n")

    for (i <- 1 to 2; j <- 1 to 3 if i != j) print(i * 10 + j + "  ")
    println("\n")

    def addA(x: Int) = x + 100
    val add = (x: Int) => x + 100
    println("addA(2)=" + addA(2))
    println("add(2)=" + add(2))
    println

    def fac(n: Int): Int = if (n <= 0) 1 else n * fac(n - 1)
    println("fac(10)=" + fac(10));
    println

    def combine(content: String, left: String = "[", right: String = "]") = left + content + right
    println("combine(James learns scala.): " + combine("James learns scala."))
    println

    def connected(args: Int*) = {
      var result = 0;

      for (arg <- args) {
        result += arg
      }

      result
    }
    println("connected(1,2,3,4,5): " + connected(1, 2, 3, 4, 5))
    println

    lazy val file = Source.fromFile("FileNotExist.txt")
    // alert error if called
    for (line <- file.getLines()) println(line)
  }
}