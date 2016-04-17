package james.scala.pattern

/**
  * Created by james on 16-4-17.
  */
object OptionOps {
  def main(args: Array[String]): Unit = {
    val scores = Map("Alice" -> 99, "Spark" -> 100)

    scores.get("Alice") match {
      case Some(score) => println(score)
      case None => println("No score")
    }
  }
}
