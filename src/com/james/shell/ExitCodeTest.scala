package com.james.shell

import scala.sys.process.Process

/**
  * Created by james on 16-7-28.
  */
object ExitCodeTest extends App {
  val exitCode = Process(Seq("ls", "-al")).!
  println(exitCode)
  println

  val stdout = Process("ls -al").!!
  println(stdout)
}
