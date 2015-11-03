enablePlugins(ScalaJSPlugin)

name := "Scala.js d3"

normalizedName := "scalajs-d3"

version := "0.1-SNAPSHOT"

organization := "org.singlespaced"

scalaVersion := "2.11.7"

scalacOptions ++= Seq("-deprecation", "-feature")

crossScalaVersions := Seq("2.10.5", "2.11.7")


libraryDependencies +=
  "org.scala-js" %%% "scalajs-dom" % "0.8.1"

jsDependencies += "org.webjars" % "d3js" % "3.5.6" / "d3.min.js"

homepage := Some(url("https://github.com/spaced/scala-js-d3"))

licenses += ("BSD New", url("https://github.com/spaced/scala-js-d3/blob/master/LICENSE"))

scmInfo := Some(ScmInfo(
  url("https://github.com/spaced/scala-js-d3"),
  "scm:git:git@github.com:spaced/scala-js-d3.git",
  Some("scm:git:git@github.com:spaced/scala-js-d3.git")))

publishMavenStyle := true

