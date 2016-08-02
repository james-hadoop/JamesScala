package james.scala.pattern

/**
  * Created by james on 16-4-16.
  */
object Extractor {
  def main(args: Array[String]): Unit = {
    val pattern = "([0-9]+) ([a-z]+)".r
    "20160416 hadoop" match {
      case pattern(num, item) => println("num=" + num + " item=" + item)
    }
  }
}
