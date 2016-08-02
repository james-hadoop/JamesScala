package james.scala.generic

/**
  * Created by james on 16-4-24.
  */
class P[+T](val first: T, val second: T) {
  //error
  //def replaceFirst(newFirst:T)=new P[T](newFirst:second)
  def replaceFirst[R >: T](newFirst: R) = new P[R](newFirst, second)
}

object VarianceOps {
  def main(args: Array[String]): Unit = {

  }
}
