package com.james.pattern.empty_value

/**
  * Created by james on 16-9-10.
  */
object Main extends App {
    println(SoundSource.getSound)
}

trait Sound {
    def play
}

class Music extends Sound {
    def play(): Unit = {
        println("Music")
    }
}

object SoundSource {
    def getSound: Option[Sound] =
        if (true) Some(new Music) else None
}
