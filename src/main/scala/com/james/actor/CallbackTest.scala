package com.james.actor

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Failure, Random, Success}

/**
  * Created by james on 16-8-2.
  */
object CallbackTest extends App {
  println("starting calculation ...")
  val f = Future {
    sleep(Random.nextInt(500))
    42
  }
  println("before onComplete")
  f.onComplete {
    case Success(value) => println(s"Got the callback, meaning = $value")
    case Failure(e) => e.printStackTrace
  }
  // do the rest of your work
  println("A ...")
  sleep(100)
  println("B ...")
  sleep(100)
  println("C ...")
  sleep(100)
  println("D ...")
  sleep(100)
  println("E ...")
  sleep(100)
  println("F ...")
  sleep(100)

  def sleep(time: Long) {
    Thread.sleep(time)
  }
}