val jdkver =  if (System.getProperty("java.version").startsWith("1.7")) "-jdk7" else ""

name		:= s"agentv-commander$jdkver"

version		:= "0.5.3-SNAPSHOT"

organization 	:= "com.prismtech"

homepage :=  Some(new java.net.URL("http://prismtech.com"))

scalaVersion 	:= "2.11.8"

val dpfix = jdkver + "_2.11"

resolvers += "Vortex Snapshot Repo" at "https://dl.dropboxusercontent.com/u/19238968/devel/mvn-repo/vortex"

resolvers += "nuvo.io maven repo" at "http://nuvo-io.github.com/mvn-repo/snapshots"

resolvers += "PrismTech Snapshot Repo"at "http://prismtech.github.io/mvn-repo/snapshots"

resolvers += "Local Repo"at  "file://"+Path.userHome.absolutePath+"/.ivy2/local"

libraryDependencies += "com.prismtech" % s"agentv-prelude$dpfix" % "0.5.3-SNAPSHOT"

libraryDependencies += "com.prismtech" % s"agentv-microsvc$dpfix" % "0.5.3-SNAPSHOT"

libraryDependencies += "com.prismtech" % s"agentv-core-types$dpfix" % "0.5.3-SNAPSHOT"

libraryDependencies += "com.prismtech.cafe" % "cafe" % "2.2.1-SNAPSHOT"

libraryDependencies += "io.nuvo" % s"moliere$dpfix" % "0.12.2-SNAPSHOT"

libraryDependencies += "io.nuvo" % s"nuvo-core$dpfix" % "0.3.2-SNAPSHOT"

libraryDependencies += "ch.qos.logback" % "logback-core" % "1.1.1"

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.1.1"

libraryDependencies += "com.intellij" % "forms_rt" % "7.0.3"

autoCompilerPlugins := true

scalacOptions ++= Seq(
    "-optimise",
    "-unchecked",
    "-language:postfixOps"
  )

publishTo := Some(Resolver.file("file",  new File(Path.userHome.absolutePath+"/hacking/labs/techo/mvn-repo/snapshots" )) )




