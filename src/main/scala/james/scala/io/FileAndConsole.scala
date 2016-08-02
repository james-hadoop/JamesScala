package james.scala.io

import scala.io.Source
import java.io.PrintWriter
import java.io.File

object FileAndConsole {
    def main(args: Array[String]) {
        val file = Source.fromFile("data/sample1.txt")
        for (line <- file.getLines) {
            println(line)
        }
        file.close
        println

        val webFile = Source.fromURL("http://spark.apache.org/")
        webFile.foreach { print }
        webFile.close
        println

        val writer = new PrintWriter(new File("data/writer1.txt"))
        for (i <- 1 to 10) {
            writer.println(i)
        }
        writer.close()
        println

        println("Please enter your input:")
        val input = Console.readLine()
        println("Your input is: " + input)
    }
}