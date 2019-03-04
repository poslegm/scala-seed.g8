ThisBuild / scalaVersion     := "2.12.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.github.poslegm"

lazy val root = (project in file("."))
  .settings(
    name := "$name$",
    libraryDependencies += "io.monix" %% "minitest" % "2.3.2" % "test",
    testFrameworks += new TestFramework("minitest.runner.Framework"),
    scalacOptions ++= Seq(
      "-unchecked",
      "-deprecation",
      "-feature",
      "-language:higherKinds",
      "-Xfatal-warnings",
      "-Ywarn-unused",
      "-Ywarn-dead-code",
      "-Ypartial-unification"
    ),
    libraryDependencies ++= Seq(
      compilerPlugin("com.olegpy"     %% "better-monadic-for" % "0.3.0-M4"),
      compilerPlugin("org.spire-math" %% "kind-projector"     % "0.9.9")
    )
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
