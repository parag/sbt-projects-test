import sbt._
import de.element34.sbteclipsify._

protected class Web(info: ProjectInfo) extends DefaultWebProject(info) with Eclipsify {
  val jetty6 = "org.mortbay.jetty" % "jetty" % "6.1.14" % "test"
  val servlet = "javax.servlet" % "servlet-api" % "2.5" % "provided"

  override def jettyWebappPath  = webappPath

  // If you're using JRebel for Lift development, uncomment
  // this line
  override def scanDirectories = Nil
  
  override def libraryDependencies = Set(
    "org.mortbay.jetty" % "jetty" % "6.1.22" % "test->default",
    "junit" % "junit" % "4.5" % "test->default"
  ) ++ super.libraryDependencies
  override def jettyPort = 9090

}
