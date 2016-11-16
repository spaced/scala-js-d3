enablePlugins(ScalaJSPlugin)

name := "Scala.js d3"

normalizedName := "scalajs-d3"

organization := "org.singlespaced"

scalaVersion := "2.12.0"

scalacOptions ++= Seq("-deprecation", "-feature")

crossScalaVersions := Seq("2.10.6", "2.11.8", "2.12.0")

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.1"

resolvers += Resolver.jcenterRepo

jsDependencies += "org.webjars" % "d3js" % "3.5.17" / "3.5.17/d3.min.js"
jsDependencies += RuntimeDOM

// uTest settings
libraryDependencies += "com.lihaoyi" %%% "utest" % "0.4.4" % "test"
testFrameworks += new TestFramework("utest.runner.Framework")

homepage := Some(url("https://github.com/spaced/scala-js-d3"))
licenses += ("BSD New", url("https://github.com/spaced/scala-js-d3/blob/master/LICENSE"))

scmInfo := Some(ScmInfo(
  url("https://github.com/spaced/scala-js-d3"),
  "scm:git:git@github.com:spaced/scala-js-d3.git",
  Some("scm:git:git@github.com:spaced/scala-js-d3.git")))


pomExtra := (
    <developers>
      <developer>
        <id>spaced</id>
        <name>Adi Stadelmann</name>
        <url>http://singlespaced.org</url>
      </developer>
    </developers>)

publishMavenStyle := true

releasePublishArtifactsAction := PgpKeys.publishSigned.value

useGpg := true

//bintray.Keys.repository := "maven"
