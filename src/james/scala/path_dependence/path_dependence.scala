package james.scala.path_dependence

/**
  * Created by james on 16-4-24.
  */
class Outer {
  private val x = 10

  class Inner {
    val y = x + 10
  }

}

object path_dependence {
  def main(args: Array[String]): Unit = {
    val outer = new Outer
    val inner1 = new outer.Inner
    val inner2: outer.Inner = new outer.Inner

    val o1 = new Outer
    val o2 = new Outer
    // error
    //val i:o2.Inner=new o1.Inner
    val i: Outer#Inner = new o1.Inner
    println(i.y)
  }
}
