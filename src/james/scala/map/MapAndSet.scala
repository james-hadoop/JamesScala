package james.scala.map

import scala.collection.immutable.TreeMap
import scala.collection.mutable

/**
  * Created by james on 16-4-17.
  */
object MapAndSet {
  def main(args: Array[String]): Unit = {
    val data = mutable.Set.empty[Int]
    data ++= List(1, 2, 3)
    data += 4
    data --= List(2, 3)
    println(data)
    data += 1
    println(data)
    data.clear
    println(data)
    println

    val map = mutable.Map.empty[String, String]
    map("Java") = "Hadoop"
    map("Scala") = "Spark"
    println(map)
    println(map("Scala"))
    println

    val treeSet = mutable.TreeSet(9, 3, 1, 8, 0, 2, 7, 4, 6, 9)
    println(treeSet)
    val treeSetForChar = mutable.TreeSet("Spark", "Scala", "Hadoop")
    println(treeSetForChar)
    println

    val treeMap = TreeMap("Scala" -> "Spark", "Java" -> "Hadoop")
    println(treeMap)
  }
}
