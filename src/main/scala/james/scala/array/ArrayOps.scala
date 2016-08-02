package james.scala.array

import scala.collection.mutable.ArrayBuffer

object ArrayOps {
    def main(args: Array[String]) {
        val nums = new Array[Int](10) //> nums  : Array[Int] = Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
        val a = new Array[String](10) //> a  : Array[String] = Array(null, null, null, null, null, null, null, null, n
        //| ull, null)
        val s = Array("Hello", "World") //> s  : Array[String] = Array(Hello, World)
        s(0) = "Goodbye"

        val b = ArrayBuffer[Int]() //> b  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer()
        b += 1 //> res0: james.scala.array.ArrayOpsWS.b.type = ArrayBuffer(1)
        b += (1, 2, 3, 5) //> res1: james.scala.array.ArrayOpsWS.b.type = ArrayBuffer(1, 1, 2, 3, 5)
        b ++= Array(8, 13, 21) //> res2: james.scala.array.ArrayOpsWS.b.type = ArrayBuffer(1, 1, 2, 3, 5, 8, 13
        //| , 21)
        b.trimEnd(5)
        b.insert(2, 6)
        b.insert(2, 7, 8, 9)
        b.remove(2) //> res3: Int = 7
        b.remove(2, 3)
        b.toArray //> res4: Array[Int] = Array(1, 1, 2)

        for (i <- 0 until b.length) {
            println(i + ": " + b(i)) //> 0: 1
            //| 1: 1
            //| 2: 2
        }
        println //> 

        val c = Array(2, 3, 5, 7, 11) //> c  : Array[Int] = Array(2, 3, 5, 7, 11)
        val result = for (elem <- c) yield 2 * elem
        //> result  : Array[Int] = Array(4, 6, 10, 14, 22)
        c.filter(_ % 2 == 0).map(2 * _) //> res5: Array[Int] = Array(4)

        Array(1, 7, 2, 9).sum //> res6: Int = 19

        ArrayBuffer("Mary", "had", "a", "little", "lamb").max
        //> res7: String = little

        val d = ArrayBuffer(1, 7, 2, 9) //> d  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 7, 2, 9)
        val bSorted = d.sorted //> bSorted  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 7, 
        //| 9)

        val e = Array(1, 7, 2, 9) //> e  : Array[Int] = Array(1, 7, 2, 9)
        scala.util.Sorting.quickSort(e)
        e.mkString(" and ") //> res8: String = 1 and 2 and 7 and 9
        e.mkString("<", ",", ">") //> res9: String = <1,2,7,9>

        val matrix = Array.ofDim[Double](3, 4) //> matrix  : Array[Array[Double]] = Array(Array(0.0, 0.0, 0.0, 0.0), Array(0.0
        //| , 0.0, 0.0, 0.0), Array(0.0, 0.0, 0.0, 0.0))
        matrix(2)(1) = 42
        //matrix //> res10: Array[Array[Double]] = Array(Array(0.0, 0.0, 0.0, 0.0), Array(0.0, 0
        //| .0, 0.0, 0.0), Array(0.0, 42.0, 0.0, 0.0))
        val triangle = new Array[Array[Int]](10) //> triangle  : Array[Array[Int]] = Array(null, null, null, null, null, null, n
        for (i <- 0 until triangle.length) {
            triangle(i) = new Array[Int](i + 1)
        }
        //triangle
    }
}