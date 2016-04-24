package james.scala.generic

/**
  * Created by james on 16-4-24.
  */
class Pair_NonPerfect[T <: Comparable[T]](val first: T, val second: T) {
  def bigger = if (first.compareTo(second) > 0) first else second
}

class Pair_Better[T <% Comparable[T]](val first: T, val second: T) {
  def bigger = if (first.compareTo(second) > 0) first else second
}

class Pair_MuchBetter[T <% Ordered[T]](val first: T, val second: T) {
  def bigger = if (first > second) first else second
}

class Pair_Lower_Bound[T](val first: T, val second: T) {
  def replaceFirst[R >: T](newFirst: R) = new Pair_Lower_Bound[R](newFirst, second)
}

class Pair_Ordering[T: Ordering](val first: T, val second: T) {
  def bigger(implicit ordered: Ordering[T]) = {
    if (ordered.compare(first, second) > 0) first else second
  }
}

class M_A[T]

class M_B[T]


object Bounds {
  def main(args: Array[String]): Unit = {
    val pair = new Pair_NonPerfect("Spark", "Hadoop")
    println(pair.bigger)
    println

    val pair1 = new Pair_Better(3, 5)
    println(pair1.bigger)
    println

    val pair2 = new Pair_MuchBetter("Spark", "Hadoop")
    println(pair2.bigger)
    println

    val pair3 = new Pair_Ordering(3, 5)
    println(pair3.bigger)
    println

    implicit val a = new M_A[Int]
    implicit val b = new M_B[Int]
    def foo[T: M_A : M_B](i: T) = println("OK")
    foo(2)
    println
  }
}