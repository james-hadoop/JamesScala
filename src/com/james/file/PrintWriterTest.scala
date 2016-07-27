package com.james.file

import java.io.{File, PrintWriter}

/**
  * Created by james on 16-7-28.
  */
object PrintWriterTest extends App {
  val pw = new PrintWriter(new File("hello.txt"))
  pw.write("hello world")
  pw.write("\r\n")
  pw.write("hi hadoop")
  pw.close
}
