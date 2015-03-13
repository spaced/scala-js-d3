enablePlugins(ScalaJSPlugin)

name := "Scala.js d3"

normalizedName := "scalajs-d3"

version := "0.1-SNAPSHOT"

organization := "org.spaced.scalajs"

scalaVersion := "2.11.6"

crossScalaVersions := Seq("2.10.4", "2.11.6")

libraryDependencies +=
  "org.scala-js" %%% "scalajs-dom" % "0.8.0"

homepage := Some(url("https://github.com/spaced/scala-js-d3"))

licenses += ("BSD New", url("https://github.com/spaced/scala-js-d3/blob/master/LICENSE"))
