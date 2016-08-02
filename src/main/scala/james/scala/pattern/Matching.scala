package james.scala.pattern

object Matching {
  def main(args: Array[String]) {
    val data = 2
    data match {
      case 1 => println("First")
      case 2 => println("Second")
      case _ => println("No matching")
    }
    println

    val result = data match {
      case i if i == 1 => "The First"
      case number if number == 2 => "The Second"
      case _ => "No Matching"
    }
    println(result)
    println

    "Spark !" foreach { c => println {
      c match {
        case ' ' => "space"
        case ch => "Char: " + ch
      }
    }
    }
  }
}