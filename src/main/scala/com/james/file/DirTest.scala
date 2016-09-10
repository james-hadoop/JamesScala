package com.james.file

import java.io.File

/**
  * Created by james on 16-7-28.
  */
object DirTest extends App {
    val files = getListOfFiles("/home/james/resource")
    println(files)

    def getListOfFiles(dir: String): List[File] = {
        val d = new File(dir)
        if (d.exists && d.isDirectory) {
            d.listFiles.filter(_.isFile).toList
        } else {
            List[File]()
        }
    }
}
