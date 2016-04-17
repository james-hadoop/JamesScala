package james.scala.list

/**
  * Created by james on 16-4-17.
  */
object ListObj {
  def main(args: Array[String]): Unit = {
    println(List.apply(1, 2, 3))
    println(List.make(1, 5))
    println(List.range(1, 5))
    println(List(9, 1, -3))
    println

    val zipped = "abcde".toList zip List(1, 2, 3, 4, 5)
    println(zipped)
    println(zipped.unzip)
    println

    println(List(List('a', 'b'), List('c'), List('d', 'e')).flatten)
    println(List.concat(List(), List('b'), List('c')))
    println

    println(List.map2(List(10, 20), List(10, 10)) (_ * _))
  }
}
