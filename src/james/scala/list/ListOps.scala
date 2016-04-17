package james.scala.list

/**
  * Created by james on 16-4-17.
  */
object ListOps {
  def main(args: Array[String]): Unit = {
    println(List(1, 2, 3) ::: List(4, 5, 6) ::: List(7, 8, 9))
    println(List(1, 2, 3).length)
    println

    val bigData = List("Hadoop", "Spark", "Kafka")
    println(bigData.last)
    println(bigData.init)
    println(bigData.reverse)
    println(bigData)
    println(bigData take 2)
    println(bigData drop 2)
    println(bigData splitAt 2)
    println(bigData apply 2)
    println(bigData(2))
    println

    val data = List('a', 'b', 'c', 'd', 'e', 'f')
    println(data.indices)
    println(data.indices zip data)
    println(data.zipWithIndex)
    println(data.toString)
    println(data.mkString("[", ",", "]"))
    println(data.mkString(" "))
    println(data.mkString)
    println

    val buffer = new StringBuilder
    data.addString(buffer, "(", ";;", ")")
    println(buffer)
    println

    val array = data.toArray
    println(array.toList)
    println

    val newArray = new Array[Char](10)
    data.copyToArray(newArray, 3)
    newArray.foreach(print)
    println

    val iterator = data.toIterator
    println(iterator.next)
    println(iterator.next)
  }
}
