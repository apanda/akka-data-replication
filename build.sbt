import generate.protobuf._

val akkaVersion = "2.3.9"

val project = Project(
  id = "akka-data-replication",
  base = file("."),
  settings = Project.defaultSettings ++ Protobuf.settings ++ Seq(
    organization := "com.github.patriknw",
    name := "akka-data-replication",
    licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0")),
    version := "0.11-SNAPSHOT",
    scalaVersion := "2.11.5",
    crossScalaVersions := Seq("2.10.4", "2.11.5"),
    // compile options
    scalacOptions in compile ++= Seq("-encoding", "UTF-8","-deprecation", "-feature", "-unchecked", "-Xlog-reflective-calls", "-Xlint"),
    javacOptions in compile ++= Seq("-encoding", "UTF-8", "-Xlint:unchecked", "-Xlint:deprecation"),
    javacOptions in doc ++= Seq("-encoding", "UTF-8"),
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-cluster" % akkaVersion,
      "com.typesafe.akka" %% "akka-multi-node-testkit" % akkaVersion % "test",
      "org.scalatest" %% "scalatest" % "2.1.3" % "test",
      "org.scala-lang.modules" %% "scala-xml" % "1.0.1" % "test")))
