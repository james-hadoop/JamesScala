package james.scala.oop

/*
 * multi extends
 */
class Human {
    println("Human")
}

trait TTeacher extends Human {
    println("TTeacher")

    def teach
}

trait TPianoPlayer extends Human {
    println("TPianoPlayer")

    def playPiano {
        println("playing piano")
    }
}

class PianoTeacher extends Human with TTeacher with TPianoPlayer {
    println("PianoTeacher")

    override def teach {
        println("I am teaching students.")
    }
}

/*
 * AOP
 */
trait TAction {
    def doAction
}

trait TActionBeforeAfer extends TAction {
    abstract override def doAction {
        println("Before:")
        super.doAction
        println("After:")
    }
}

class Work extends TAction {
    override def doAction {
        println("Working...")
    }
}

/*
 * driver
 */
object MultiExtendsAndAop extends App {
    val t1 = new PianoTeacher
    println
    t1.playPiano
    t1.teach
    println

    val t2 = new Human with TTeacher with TPianoPlayer {
        def teach {
            println("I am training students.")
        }
    }
    t2.teach
    println

    val w = new Work with TActionBeforeAfer
    w.doAction
}