package com.james.pattern.value_object

/**
  * Created by james on 16-9-10.
  */
object Main extends App {
    type Point = (Int, Int)
    // Tuple2[Int, Int]
    val point: Point = (1, 2)
    println(point)
    println

    val point2 = Point(1, 2)
    println(point2)
    println
}

case class Point(x: Int, y: Int)
