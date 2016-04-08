package james.scala.map

object MapOpsWS {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(103); 
    val map = Map("book" -> 10, "gun" -> 18, "ipad" -> 1000);System.out.println("""map  : scala.collection.immutable.Map[String,Int] = """ + $show(map ));$skip(43); val res$0 = 
    for ((k, v) <- map) yield (k, v * 0.9);System.out.println("""res0: scala.collection.immutable.Map[String,Double] = """ + $show(res$0));$skip(91); 

    val scores = scala.collection.mutable.Map("Scala" -> 7, "Hadoop" -> 8, "Spark" -> 10);System.out.println("""scores  : scala.collection.mutable.Map[String,Int] = """ + $show(scores ));$skip(52); 
    val hadoopScore = scores.getOrElse("Hadoop", 0);System.out.println("""hadoopScore  : Int = """ + $show(hadoopScore ));$skip(25); val res$1 = 
    scores += ("R" -> 9);System.out.println("""res1: james.scala.map.MapOpsWS.scores.type = """ + $show(res$1));$skip(23); val res$2 = 
    scores -= "Hadoop";System.out.println("""res2: james.scala.map.MapOpsWS.scores.type = """ + $show(res$2));$skip(104); 

    val sortedScore = scala.collection.immutable.SortedMap("Scala" -> 7, "Hadoop" -> 8, "Spark" -> 10);System.out.println("""sortedScore  : scala.collection.immutable.SortedMap[String,Int] = """ + $show(sortedScore ));$skip(48); 

    val tuple = (1, 2, 3.14, "Rocky", "Spark");System.out.println("""tuple  : (Int, Int, Double, String, String) = """ + $show(tuple ));$skip(26); 

    val third = tuple._3;System.out.println("""third  : Double = """ + $show(third ));$skip(54); 
    val (first, second, thirda, forth, fifth) = tuple;System.out.println("""first  : Int = """ + $show(first ));System.out.println("""second  : Int = """ + $show(second ));System.out.println("""thirda  : Double = """ + $show(thirda ));System.out.println("""forth  : String = """ + $show(forth ));System.out.println("""fifth  : String = """ + $show(fifth ));$skip(32); 
    val (f, s, _, _, _) = tuple;System.out.println("""f  : Int = """ + $show(f ));System.out.println("""s  : Int = """ + $show(s ));$skip(39); val res$3 = 
    "Rocky Spark".partition(_.isUpper);System.out.println("""res3: (String, String) = """ + $show(res$3))}
}
