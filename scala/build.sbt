
lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.47deg",
      scalaVersion := "2.12.7",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "fp-fundamentals",
    libraryDependencies += "org.typelevel" %% "cats-core" % "1.5.0-RC1"
  )
