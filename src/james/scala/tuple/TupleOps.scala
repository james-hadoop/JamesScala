package james.scala.tuple

import scala.io.Source

object TupleOps {
    def main(args: Array[String]) {
        val triple = (100, "scala", "spark")
        println(triple._1)
        println(triple._2)
        println

        val array = Array(1, 2, 3)
        for (i <- 0 until array.length) {
            print(array(i) + " ")
        }
        println
        
        for(elem <-array){
            print(elem + " ")
        }
        println("\n")
        
        val ages=Map("Rocky" ->27,"Spark"->5)
        for((k,v)<-ages){
            println("k="+k+"  v="+v)
        }
        println
        
        val file=Source.fromFile("data/TupleOps.txt")
        for(line<-file.getLines){
            println(line)
        }
        println
        
        val html=Source.fromURL("http://spark.apache.org")
                for(line<-html.getLines){
            println(line)
        }
        println
    }
}