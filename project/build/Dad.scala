import sbt._

class Dad(info:ProjectInfo) extends ParentProject(info) {

 lazy val hello = project("hello", "hello", new Hello(_))
 lazy val world = project("world", "world", new World(_))
 lazy val web = project("web", "web", new Web(_), hello, world)
}
