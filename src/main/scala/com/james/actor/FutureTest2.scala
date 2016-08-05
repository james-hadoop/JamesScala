package com.james.actor

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{Future, future}
import scala.util.{Failure, Success}

object Futures2 extends App {
  implicit val baseTime = System.currentTimeMillis

  def longRunningComputation(i: Int): Future[Int] = future {
    sleep(100)
    i + 1
  }

  // this does not block
  longRunningComputation(11).onComplete {
    case Success(result) => println(s"result = $result")
    case Failure(e) => e.printStackTrace
  }
  // keep the jvm from shutting down
  sleep(1000)

  def sleep(time: Long) {
    Thread.sleep(time)
  }
}
