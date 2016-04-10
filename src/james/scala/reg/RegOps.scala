package james.scala.reg

object RegOps {
    def main(args: Array[String]) {
        val regex = """([0-9]+)([a-z]+)""".r
        val numPattern = "[0-9]+".r
        val numberPattern = """\s+[0-9]+\s+""".r

        for (matchString <- numPattern.findAllIn("11111 Scala,22222,Spark")) {
            println(matchString)
        }
        println

        println(numberPattern.findFirstIn("99ss java,33333 hadoop"))
        println

        val numitemPattern = """([0-9]+) ([a-z]+)""".r
        val numitemPattern(num,item)="33 hadoop"

        val line = "22 spark"
        line match {
            case numitemPattern(num, blog) => println(num + "\t" + blog)
            case _ => println("Oops...")
        }
    }
}