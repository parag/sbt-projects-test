import sbt._
import de.element34.sbteclipsify._

protected class Hello(info: ProjectInfo) extends DefaultProject(info) with Eclipsify
