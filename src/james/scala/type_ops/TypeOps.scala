package james.scala.type_ops

/**
  * Created by james on 16-4-24.
  */
object TypeOps {
  def main(args: Array[String]) {

    // A=:=B  //表示A类型等同于B类型
    // A<:<B  //表示A类型是B类型的子类型
    def rocky[T](i: T)(implicit ev: T <:< java.io.Serializable): Unit = {
      println("Life is short, you need spark!")
    }

    rocky("Spark")

    // erro
    //rocky(3)
  }
}
