name := "frees-publish"

lazy val macroAnnotationSettings = Seq(
  addCompilerPlugin("org.scalameta" %% "paradise" % "3.0.0-M10" cross CrossVersion.full),
  scalacOptions := Seq("-Xplugin-require:macroparadise"),
  scalacOptions in(Compile, console) ~= (_ filterNot (_ contains "paradise"))
)

organization := "io.scalac"
scalaVersion := "2.12.4"
version := "1.0.0"

lazy val root = (project in file("."))
  .settings(
    macroAnnotationSettings,
    libraryDependencies += "io.frees" %% "frees-core" % "0.4.2"
  )
