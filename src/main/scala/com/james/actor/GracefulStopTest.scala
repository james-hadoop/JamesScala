package com.james.actor

import akka.actor._
import akka.pattern.gracefulStop

import scala.concurrent.duration._
import scala.concurrent.{Await, Future}
import scala.language.postfixOps

class TestActor1 extends Actor {
  def receive = {
    case _ => println("TestActor got message")
  }

  override def postStop {
    println("TestActor: postStop")
  }
}

/**
  * Created by james on 16-8-2.
  */
object GracefulStopTest extends App {
  val system = ActorSystem("GracefulStopTest")
  val testActor = system.actorOf(Props[TestActor1], name = "TestActor")
  // try to stop the actor gracefully
  try {
    val stopped: Future[Boolean] = gracefulStop(testActor, 2 seconds)
    Await.result(stopped, 3 seconds)
    println("testActor was stopped")
  } catch {
    case e: Exception => e.printStackTrace
  } finally {
    system.shutdown
  }
}
