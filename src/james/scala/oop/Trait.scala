package james.scala.oop

class UseTrait {

}

trait Logger {
    // need implemented
    def log(msg: String)

    // implemented
    //def log(msg: String) {}
}

class ConcreLogger extends Logger {
    override def log(msg: String) = println("ConcreLogger: " + msg)

    def concreteLog {
        log("concreteLog()")
    }
}

trait TraitLogger extends Logger with Cloneable {
    override def log(msg: String) {
        println("TraitLogger: " + msg)
    }
}

trait TraitLoggered {
    def loged(msg: String) {
        println("TraitLoggered: " + msg)
    }
}

trait ConsoleLogger extends TraitLogger {
    override def log(msg: String) {
        println("ConsoleLogger: " + msg)
    }
}

class Test extends ConsoleLogger {
    def test {
        log("test()")
    }
}

abstract class Account {
    def save
}

class MyAccount extends Account with ConsoleLogger {
    def save {
        log("11")
    }
}

object Trait extends App{
    val logger = new ConcreLogger with TraitLogger
    logger.log("Extends from ConcreLogger")
    logger.concreteLog
    println
    
    val test = new Test
    test.test
    println
    
    val account=new MyAccount with TraitLogger
    account.save
}