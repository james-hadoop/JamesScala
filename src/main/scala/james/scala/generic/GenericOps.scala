package james.scala.generic

import scala.reflect.ClassTag

/**
  * Created by james on 16-4-17.
  */
class Triple[F, S, T](val first: F, val second: S, val third: T)

object GenericOps {
  def main(args: Array[String]): Unit = {
    val triple = new Triple("Spark", 3, 3.14)
    val bigData = new Triple[String, String, Char]("Spark", "Hadoop", 'R')

    def getData[T](list: List[T]) = list(list.length / 2)
    println(getData(List("Spark", "Hadoop", "R")))
    val f = getData[Int] _
    println(f(List(1, 2, 3, 4, 5)))

    def buildArray[T: ClassTag](len: Int) = new Array[T](len)
    println(buildArray[Int](5).toList)
  }
}
