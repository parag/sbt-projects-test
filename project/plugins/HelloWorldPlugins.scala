import sbt._

class MySbtProjectPlugins(info: ProjectInfo) extends PluginDefinition(info) {
 lazy val eclipse = "de.element34" % "sbt-eclipsify" % "0.5.3"
 //lazy val proguard = "org.scala-tools.sbt" % "sbt-proguard-plugin" % "0.0.2"
}
