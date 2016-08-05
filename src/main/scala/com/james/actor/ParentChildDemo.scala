package com.james.actor

import akka.actor._

/**
  * Created by james on 16-8-2.
  */
case class CreateChild(name: String)

case class Name(name: String)

class Child extends Actor {
  var name = "No name"

  override def postStop {
    println(s"D'oh! They killed me ($name): ${self.path}")
  }

  def receive = {
    case Name(name) => this.name = name
    case _ => println(s"Child $name got message")
  }
}

class Parent1 extends Actor {
  def receive = {
    case CreateChild(name) =>
      // Parent creates a new Child here
      println(s"Parent about to create Child ($name) ...")
      val child = context.actorOf(Props[Child], name = s"$name")
      child ! Name(name)
    case _ => println(s"Parent got some other message.")
  }
}

object ParentChildDemo extends App {
  val actorSystem = ActorSystem("ParentChildTest")
  val parent = actorSystem.actorOf(Props[Parent1], name = "Parent")
  // send messages to Parent to create to child actors
  parent ! CreateChild("Jonathan")
  parent ! CreateChild("Jordan")
  Thread.sleep(500)
  // lookup Jonathan, then kill it
  println("Sending Jonathan a PoisonPill ...")
  val jonathan = actorSystem.actorSelection("/user/Parent/Jonathan")
  jonathan ! PoisonPill
  println("jonathan was killed")
  Thread.sleep(5000)
  actorSystem.shutdown
}
