package com.james.file

import java.io.{FileNotFoundException, IOException}

import scala.io.Source

/**
  * Created by james on 16-7-28.
  */
object FileReaderTest extends App {
  val filename = "hello.txt"

  try {
    for (line <- Source.fromFile(filename).getLines) {
      println(line);
    }
  } catch {
    case e: FileNotFoundException => println("Couldn't find that file.")
    case e: IOException => println("Got an IOException!")
  }
}
