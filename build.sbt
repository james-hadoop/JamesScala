name := "JamesScala"

version := "1.0"

scalaVersion := "2.10.6"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.2.5",
  "mysql" % "mysql-connector-java" % "5.1.+",
  "commons-dbcp" % "commons-dbcp" % "1.4",
  "org.springframework" % "spring-core" % "4.2.+",
  "org.springframework" % "spring-beans" % "4.2.+",
  "org.springframework" % "spring-jdbc" % "4.2.+",
  "org.springframework" % "spring-tx" % "4.2.+"
)
    