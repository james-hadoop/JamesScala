package james.scala.injection

/**
  * Created by james on 16-4-24.
  */
trait Logger {
  def log(msg: String)
}

trait Auth {
  auth: Logger =>
  def act(msg: String): Unit = {
    log(msg)
  }
}

object DI extends Auth with Logger {
  override def log(msg: String) = {
    println("log(): " + msg)
  }
}

object DependencyInjection {
  def main(args: Array[String]): Unit = {
    DI.act("I hope everything will be fine.")
  }
}
