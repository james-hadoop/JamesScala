package james.scala.array

import scala.collection.mutable.ArrayBuffer

object ArrayOpsWS {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(129); 
        val nums = new Array[Int](10);System.out.println("""nums  : Array[Int] = """ + $show(nums ));$skip(38); 
        val a = new Array[String](10);System.out.println("""a  : Array[String] = """ + $show(a ));$skip(40); 
        val s = Array("Hello", "World");System.out.println("""s  : Array[String] = """ + $show(s ));$skip(25); 
        s(0) = "Goodbye";$skip(36); 

        val b = ArrayBuffer[Int]();System.out.println("""b  : scala.collection.mutable.ArrayBuffer[Int] = """ + $show(b ));$skip(15); val res$0 = 
        b += 1;System.out.println("""res0: james.scala.array.ArrayOpsWS.b.type = """ + $show(res$0));$skip(26); val res$1 = 
        b += (1, 2, 3, 5);System.out.println("""res1: james.scala.array.ArrayOpsWS.b.type = """ + $show(res$1));$skip(31); val res$2 = 
        b ++= Array(8, 13, 21);System.out.println("""res2: james.scala.array.ArrayOpsWS.b.type = """ + $show(res$2));$skip(21); 
        b.trimEnd(5);$skip(23); 
        b.insert(2, 6);$skip(29); 
        b.insert(2, 7, 8, 9);$skip(20); val res$3 = 
        b.remove(2);System.out.println("""res3: Int = """ + $show(res$3));$skip(23); 
        b.remove(2, 3);$skip(18); val res$4 = 
        b.toArray;System.out.println("""res4: Array[Int] = """ + $show(res$4));$skip(76); 

        for (i <- 0 until b.length) {
            println(i + ": " + b(i))
        };$skip(26); 
        println;$skip(39); 

        val c = Array(2, 3, 5, 7, 11);System.out.println("""c  : Array[Int] = """ + $show(c ));$skip(52); 
        val result = for (elem <- c) yield 2 * elem;System.out.println("""result  : Array[Int] = """ + $show(result ));$skip(40); val res$5 = 
        c.filter(_ % 2 == 0).map(2 * _);System.out.println("""res5: Array[Int] = """ + $show(res$5));$skip(31); val res$6 = 

        Array(1, 7, 2, 9).sum;System.out.println("""res6: Int = """ + $show(res$6));$skip(63); val res$7 = 

        ArrayBuffer("Mary", "had", "a", "little", "lamb").max;System.out.println("""res7: String = """ + $show(res$7));$skip(41); 

        val d = ArrayBuffer(1, 7, 2, 9);System.out.println("""d  : scala.collection.mutable.ArrayBuffer[Int] = """ + $show(d ));$skip(31); 
        val bSorted = d.sorted;System.out.println("""bSorted  : scala.collection.mutable.ArrayBuffer[Int] = """ + $show(bSorted ));$skip(35); 

        val e = Array(1, 7, 2, 9);System.out.println("""e  : Array[Int] = """ + $show(e ));$skip(40); 
        scala.util.Sorting.quickSort(e);$skip(28); val res$8 = 
        e.mkString(" and ");System.out.println("""res8: String = """ + $show(res$8));$skip(34); val res$9 = 
        e.mkString("<", ",", ">");System.out.println("""res9: String = """ + $show(res$9));$skip(48); 

        val matrix = Array.ofDim[Double](3, 4);System.out.println("""matrix  : Array[Array[Double]] = """ + $show(matrix ));$skip(26); 
        matrix(2)(1) = 42;$skip(15); val res$10 = 
        matrix;System.out.println("""res10: Array[Array[Double]] = """ + $show(res$10));$skip(49); 
        val triangle = new Array[Array[Int]](10);System.out.println("""triangle  : Array[Array[Int]] = """ + $show(triangle ));$skip(93); 
        for (i <- 0 until triangle.length) {
            triangle(i) = new Array[Int](i + 1)
        };$skip(27); val res$11 = 
        triangle;System.out.println("""res11: Array[Array[Int]] = """ + $show(res$11))}
}
