package james.scala.list

/**
  * Created by james on 16-4-17.
  */
object ListPartition {
  def main(args: Array[String]): Unit = {
    val data = List(1, 2, 3, 4, 5)
    println(data partition (_ % 2 == 0))
    println(data find (_ % 2 == 0))
    println(data find (_ <= 2))
    println(data takeWhile (_ < 4))
    println(data dropWhile (_ < 4))
    println(data span (_ < 4))
    println

    def hasTotallyZeroRow(m: List[List[Int]]) = m exists (row => row forall (_ == 0))
    val m = List(List(1, 0, 0), List(0, 1, 0), List(0, 0, 0))
    println(hasTotallyZeroRow(m))
  }
}
