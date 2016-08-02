package james.scala.pattern

/**
  * Created by james on 16-4-16.
  */
object TypeMatching {
  def main(args: Array[String]): Unit = {
    def match_type(t: Any) = t match {
      case p: Int => println("Integer")
      case p: String => println("String")
      case m: Map[_, _] => println("Map")
      case _ => println("Unknown Type")
    }

    match_type(2)
    match_type(Map("Scala" -> "Spark"))
    println

    def match_array(arr: Any) = arr match {
      case Array(0) => println("Array: " + 0)
      case Array(x, y) => println("Array: " + x + " " + y)
      case Array(0, _*) => println("Array: " + "0...")
      case _ => println("No Matching")
    }

    match_array(Array(0))
    match_array(Array(0, 1))
    match_array(Array(0, 1, 2, 3, 4))
    println

    def match_list(lst: Any) = lst match {
      case 0 :: Nil => println("List: " + "0")
      case x :: y :: Nil => println("List: " + x + " " + y)
      case 0 :: tail => println("List: " + "0...")
      case _ => println("No Matching")
    }

    match_list(List(0))
    match_list(List(0, 1))
    match_list(List(0, 1, 2, 3, 4))
    println

    def match_tuple(tuple: Any) = tuple match {
      case (0, _) => println("Tuple: " + 0)
      case (x, 0) => println("Tuple: " + x)
      case _ => println("No Matching")
    }

    match_tuple((0, "scala"))
    match_tuple((2, 0))
    match_tuple((0, 1, 2, 3, 4))
  }
}
