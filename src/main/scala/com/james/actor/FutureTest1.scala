package com.james.actor

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.concurrent.{Await, Future}

/**
  * Created by james on 16-8-2.
  */
object FutureTest1 extends App {
  // used by 'time' method
  implicit val baseTime = System.currentTimeMillis
  // 2 - create a Future
  val f = Future {
    sleep(500)
    1 + 1
  }
  // 3 - this is blocking (blocking is bad)
  val result = Await.result(f, 1 second)
  println(result)

  sleep(1000)

  def sleep(time: Long) {
    Thread.sleep(time)
  }
}
