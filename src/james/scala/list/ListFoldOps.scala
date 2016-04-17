package james.scala.list

/**
  * Created by james on 16-4-17.
  */
object ListFoldOps {
  def main(args: Array[String]): Unit = {
    println((1 to 100).foldLeft(0)(_ + _))
    //println((0 /: (1 to 100) (_ + _))

    println((1 to 5).foldRight(100)(_ - _))
    //println((1 to 5):\100(_-_))
    println

    println(List(1, -3, 4, 2, 6) sortWith (_ < _))
    println(List(1, -3, 4, 2, 6) sortWith (_ > _))
  }
}
