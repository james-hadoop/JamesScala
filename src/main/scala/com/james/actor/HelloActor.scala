package com.james.actor

import akka.actor.{Actor, ActorSystem, Props}

/**
  * Created by james on 16-7-28.
  */
class HelloActor extends Actor {
  def receive = {
    case "hello" => println("hello back at you")
    case _ => println("huh?")
  }
}

object Main extends App {
  val system = ActorSystem("HelloSystem")

  val helloActor = system.actorOf(Props[HelloActor], name = "helloactor")

  helloActor ! "hello"
  helloActor ! "buenos dias"

  system.shutdown
}

