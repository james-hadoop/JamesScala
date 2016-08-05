package com.james.db

import org.springframework.jdbc.core.support.JdbcDaoSupport


/**
  * Created by james on 16-8-2.
  */
class TestDao extends JdbcDaoSupport {
  def getNumUsers: Int = {
    val query = "select count(name) from student"
    return getJdbcTemplate.queryForObject(query,classOf[Int])
  }
}