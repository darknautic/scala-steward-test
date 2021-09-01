ThisBuild / organization := "com.example"
ThisBuild / scalaVersion := "3.0.2"

lazy val root = (project in file(".")).settings(
  name := "scala-steward-test",
  libraryDependencies ++= Seq(
    // "core" module - IO, IOApp, schedulers
    // This pulls in the kernel and std modules automatically.
    "org.typelevel" %% "cats-effect" % "3.2.2",
    // concurrency abstractions and primitives (Concurrent, Sync, Async etc.)
    "org.typelevel" %% "cats-effect-kernel" % "3.2.2",
    // standard "effect" library (Queues, Console, Random etc.)
    "org.typelevel" %% "cats-effect-std" % "3.2.2",
    "org.typelevel" %% "cats-effect-testing-specs2" % "1.2.0" % Test,
    "org.typelevel" %% "munit-cats-effect-3" % "1.0.5" % Test
  )
)
