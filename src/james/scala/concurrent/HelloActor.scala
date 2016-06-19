package concurrent

/**
  * Created by james on 16-6-19.
  */
class HelloActor extends Actor {
  def receive = {
    case "hello" => println("hello back at you")
      caes_=> println ("huh?")
  }
}

object Main extends App {
  val system = ActorSystem("HelloSystem")

  val hellloActor = system.actorOf(Props[HelloActor], name = "helloActor")

  helloActor ! "hello"
  helloActor ! "buenos dias"

  system.shutdown
}
