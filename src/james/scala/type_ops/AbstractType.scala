package james.scala.type_ops

import scala.io.{BufferedSource, Source}

/**
  * Created by james on 16-4-24.
  */
trait Reader {
  type In
  type Contents

  def read(in: In): Contents
}

class FileReader extends Reader {
  type In = String
  type Contents = BufferedSource

  def read(name: In) = Source.fromFile(name)
}

object AbstractType {
  def main(args: Array[String]): Unit = {
    val fileReader = new FileReader
    val content = fileReader.read("/home/james/workspace4scala/data/AbstractType.txt")

    for (line <- content.getLines) {
      println(line)
    }
  }
}
