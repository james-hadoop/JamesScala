package com.james.actor

import akka.actor.{Actor, ActorSystem, PoisonPill, Props, Terminated}

class Kenny extends Actor {
  def receive = {
    case _ => println("Kenny received a message")
  }
}

class Parent extends Actor {
  // start Kenny as a child, then keep an eye on it
  val kenny = context.actorOf(Props[Kenny], name = "Kenny")
  context.watch(kenny)

  def receive = {
    case Terminated(kenny) => println("OMG, they killed Kenny")
    case _ => println("Parent received a message")
  }
}

object DeathWatchTest extends App {
  // create the ActorSystem instance
  val system = ActorSystem("DeathWatchTest")
  // create the Parent that will create Kenny
  val parent = system.actorOf(Props[Parent], name = "Parent")
  // lookup kenny, then kill it
  val kenny = system.actorSelection("/user/Parent/Kenny")
  kenny ! PoisonPill
  Thread.sleep(5000)
  println("calling system.shutdown")
  system.shutdown
}
