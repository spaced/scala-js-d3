scalaJSSettings

name := "Scala.js d3"

normalizedName := "scalajs-d3"

version := "0.1-SNAPSHOT"

//organization := "org.scala-lang.modules.scalajs"
organization := "org.spaced.modules.scalajs"

scalaVersion := "2.11.1"

crossScalaVersions := Seq("2.10.4", "2.11.1")

libraryDependencies +=
  "org.scala-lang.modules.scalajs" %%% "scalajs-dom" % "0.5"

homepage := Some(url("http://scala-js.org/"))

//licenses += ("BSD New", url("https://github.com/scala-js/scala-js/blob/master/LICENSE"))
