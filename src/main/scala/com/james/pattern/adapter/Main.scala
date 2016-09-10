package com.james.pattern.adapter

/**
  * Created by james on 16-9-10.
  */
object Main extends App {
    // transform Logger into  TLog
    implicit class LoggerToLogAdapter(logger: Logger) extends TLog {
        def info(message: String) {
            logger.log("INFO", message)
        }

        def warn(message: String) {
            logger.log("WARN", message)
        }

        def error(message: String) {
            logger.log("ERROR", message)
        }
    }

    val logger: TLog = new Logger
    logger.info("hello info")
}

trait TLog {
    def info(msg: String)

    def warn(msg: String)

    def error(msg: String)
}

class Logger {
    def log(level: String, msg: String): Unit = {
        println(level + ": " + msg)
    }
}
