package james.scala.list

/**
  * Created by james on 16-4-17.
  */
object ListMap {
  def main(args: Array[String]): Unit = {
    println(List(1, 2, 3, 4, 5).map(_ + 1))
    println

    val data = List("Scala", "Hadoop", "Spark")
    println(data map (_.length))
    println(data map (_.toList.reverse.mkString))
    println(data.map(_.toList))
    println(data.flatMap(_.toList))
    println(List.range(1, 10) flatMap (i => List.range(1, i) map (j => (i, j))))
    println

    var sum = 0
    List(1, 2, 3, 4, 5) foreach (sum += _)
    println("sum=" + sum)
    println

    println(List(1, 2, 3, 4, 5) filter (_ % 2 == 0))
    println(data filter (_.length == 5))
  }
}
