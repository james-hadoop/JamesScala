package com.james.oop

import java.io.IOException
import javax.sound.sampled.{LineUnavailableException, UnsupportedAudioFileException}

/**
  * Created by james on 16-12-28.
  */
object MethodDemo extends App {
    var m = new MethodClass

    try {
        m.a
    } catch {
        case e: Exception => e.printStackTrace
    }

    try {
        m.b(1)
    } catch {
        case e: IOException => e.printStackTrace
        case e: LineUnavailableException => e.printStackTrace
        case e: UnsupportedAudioFileException => e.printStackTrace
    }

    try {
        m.b(2)
    } catch {
        case e: IOException => e.printStackTrace
        case e: LineUnavailableException => e.printStackTrace
        case e: UnsupportedAudioFileException => e.printStackTrace
    }

    try {
        m.b(3)
    } catch {
        case e: IOException => e.printStackTrace
        case e: LineUnavailableException => e.printStackTrace
        case e: UnsupportedAudioFileException => e.printStackTrace
    }

    try {
        m.c
    } catch {
        case e: Exception => e.printStackTrace
    }
    println

    m.hello.world.show
}

class MethodClass {
    var value: String = ""

    @throws(classOf[Exception])
    def a: Unit = {
        throw new Exception("Exception from a()")
    }

    @throws(classOf[IOException])
    @throws(classOf[LineUnavailableException])
    @throws(classOf[UnsupportedAudioFileException])
    def b(t: Int): Unit = {
        t match {
            case 1 => throw new IOException("IOException from b()")
            case 2 => throw new LineUnavailableException("LineUnavailableException from b()")
            case 3 => throw new UnsupportedAudioFileException("UnsupportedAudioFileException from b()")
        }
    }

    def c: Unit = {
        throw new Exception("Exception from c()")
    }

    def hello: this.type = {
        value += "hello"
        this
    }

    def world: this.type = {
        value += " world"
        this
    }

    def show: Unit = {
        println(value);
    }
}
