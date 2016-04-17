package james.scala.pattern

/**
  * Created by james on 16-4-16.
  */
abstract class Item

case class Book(description: String, price: Double) extends Item

case class Bundle(description: String, price: Double, items: Item*) extends Item

object NestedMatching {
  def main(args: Array[String]): Unit = {
    def caseclass_nested(item: Item) = item match {
      case Bundle(_, _, art@Book(_, _), rest@_*) => println(art.description + ": " + art.price)
      case Bundle(_, _, Book(description, _), _*) => println("First: " + description)
      case _ => println("Oops...")
    }

    caseclass_nested(Bundle("1111 Special's", 30.0,
      Book("Scala for the Spark Developer", 69.95),
      Bundle("Hadoop", 40.0,
        Book("Hive", 50.0),
        Book("HBase", 60.0))
    ))

    caseclass_nested(Bundle("1212 Special's", 35.0, Book("Spark for the Impatient", 39.95)))
  }
}
