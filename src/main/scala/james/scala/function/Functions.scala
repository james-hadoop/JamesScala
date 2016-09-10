package james.scala.function

import scala.io.Source

object Functions {
    def main(args: Array[String]) {
        val width = args(0).toInt
        for (arg <- args.drop(1)) {
            processData(arg, width)
            println

            var increase = (x: Int) => x + 1
            increase(10)
            increase = (x: Int) => x + 9999

            val someNumbers = List(-11, -10, -5, 0, 5, 10)
            someNumbers.foreach((x: Int) => print(x + " "))
            println

            someNumbers.filter((x: Int) => x > 0)
            someNumbers.filter(x => x % 2 == 0).foreach((x: Int) => print(x + " "))
            println
            someNumbers.filter(_ > 0)

            val f = (_: Int) + (_: Int)
            println(f(5, 10))
        }
    }

    // define inner function in an outer function
    def processData(filename: String, width: Int) {
        def processLine(line: String) {
            if (line.length > width) {
                println(filename + ": " + line)
            }
        }

        val source = Source.fromFile(filename)
        for (line <- source.getLines) {
            processLine(line)
        }
    }
}