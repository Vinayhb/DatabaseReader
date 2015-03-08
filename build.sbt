name := """webServerProject"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  javaWs,
   "com.datastax.cassandra" % "cassandra-driver-core" % "2.1.1",
  "com.datastax.cassandra" % "cassandra-driver-mapping" % "2.1.1"
)


fork in run := true