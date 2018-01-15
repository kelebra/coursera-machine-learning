organization := "com.example"
scalaVersion := "2.12.3"
version := "0.1.0-SNAPSHOT"
name := "machine-learning"

libraryDependencies ++= Seq(
  "org.scalanlp" %% "breeze" % "0.13.2",

  "org.scalanlp" %% "breeze-viz" % "0.13.2",

  "org.scalatest" %% "scalatest" % "3.0.3" % Test
)