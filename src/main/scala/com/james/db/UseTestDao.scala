package com.james.db

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
  * Created by james on 16-8-2.
  */
object UseTestDao extends App {
    val ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    // get a testDao instance
    val testDao = ctx.getBean("testDao").asInstanceOf[TestDao]
    val numUsers = testDao.getNumUsers
    println("You have this many users: " + numUsers)
}
