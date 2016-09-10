package com.james.db


import java.sql.{Connection, DriverManager}

/**
  * Created by james on 16-8-2.
  */
object JdbcTest extends App {
    val url = "jdbc:mysql://localhost:3306/james"
    val driver = "com.mysql.jdbc.Driver"
    val username = "root"
    val password = "root"
    var connection: Connection = _

    try {
        Class.forName(driver)
        connection = DriverManager.getConnection(url, username, password)

        val sql="SELECT * FROM student"

        val statement = connection.prepareStatement(sql)
        val rs = statement.executeQuery()
        while (rs.next) {
            val id = rs.getInt("id")
            val name = rs.getString("name")
            val age = rs.getInt("age")
            val gpa = rs.getFloat("gpa")
            println("id=%d, name = %s, age = %d, gpa=%f".format(id, name, age, gpa))
        }
    } catch {
        case e: Exception => e.printStackTrace
    }
    connection.close
}
