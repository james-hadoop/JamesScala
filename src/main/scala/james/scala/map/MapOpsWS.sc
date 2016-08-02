package james.scala.map

object MapOpsWS {
    val map = Map("book" -> 10, "gun" -> 18, "ipad" -> 1000)
                                                  //> map  : scala.collection.immutable.Map[String,Int] = Map(book -> 10, gun -> 1
                                                  //| 8, ipad -> 1000)
    for ((k, v) <- map) yield (k, v * 0.9)        //> res0: scala.collection.immutable.Map[String,Double] = Map(book -> 9.0, gun -
                                                  //| > 16.2, ipad -> 900.0)

    val scores = scala.collection.mutable.Map("Scala" -> 7, "Hadoop" -> 8, "Spark" -> 10)
                                                  //> scores  : scala.collection.mutable.Map[String,Int] = Map(Hadoop -> 8, Spark 
                                                  //| -> 10, Scala -> 7)
    val hadoopScore = scores.getOrElse("Hadoop", 0)
                                                  //> hadoopScore  : Int = 8
    scores += ("R" -> 9)                          //> res1: james.scala.map.MapOpsWS.scores.type = Map(Hadoop -> 8, R -> 9, Spark 
                                                  //| -> 10, Scala -> 7)
    scores -= "Hadoop"                            //> res2: james.scala.map.MapOpsWS.scores.type = Map(R -> 9, Spark -> 10, Scala 
                                                  //| -> 7)

    val sortedScore = scala.collection.immutable.SortedMap("Scala" -> 7, "Hadoop" -> 8, "Spark" -> 10)
                                                  //> sortedScore  : scala.collection.immutable.SortedMap[String,Int] = Map(Hadoop
                                                  //|  -> 8, Scala -> 7, Spark -> 10)

    val tuple = (1, 2, 3.14, "Rocky", "Spark")    //> tuple  : (Int, Int, Double, String, String) = (1,2,3.14,Rocky,Spark)

    val third = tuple._3                          //> third  : Double = 3.14
    val (first, second, thirda, forth, fifth) = tuple
                                                  //> first  : Int = 1
                                                  //| second  : Int = 2
                                                  //| thirda  : Double = 3.14
                                                  //| forth  : String = Rocky
                                                  //| fifth  : String = Spark
    val (f, s, _, _, _) = tuple                   //> f  : Int = 1
                                                  //| s  : Int = 2
    "Rocky Spark".partition(_.isUpper)            //> res3: (String, String) = (RS,ocky park)
}