package com.james.file

import java.io.{FileInputStream, FileOutputStream, IOException}

/**
  * Created by james on 16-7-28.
  */
object FileCopyTest extends App {
  var in = None: Option[FileInputStream]
  var out = None: Option[FileOutputStream]

  try {
    in = Some(new FileInputStream("hello.txt"))
    out = Some(new FileOutputStream("hello.copy "))

    var c = 0
    while ( {
      c = in.get.read;
      c != -1
    }) {
      out.get.write(c)
    }
  } catch {
    case e: IOException => e.printStackTrace
  } finally {
    println("entered finally...")
    if (in.isDefined) in.get.close
    if (out.isDefined) out.get.close
  }
}
