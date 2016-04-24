package james.scala.structure

/**
  * Created by james on 16-4-24.
  */
class Structural {
  def open = {
    println("A class instance with open()")
  }
}

object StructuralType {
  def main(args: Array[String]): Unit = {
    init(new {
      def open = println("open()")
    })
    println

    type X = {def open: Unit}
    def init(res: X) = res.open
    println

    init(new {
      def open = println("Opened again")
    })
    println

    object A {
      def open = {
        println("A single object Opened")
      }
    }
    init(A)
    println

    val structural = new Structural
    init(structural)
  }

  def init(res: {def open(): Unit}): Unit = {
    res.open
  }
}
