fork := true

libraryDependencies ++= Seq(
  "org.apache.hbase"  %  "hbase"        % Version.Hbase          % "compile",
  "org.hbase"         % "asynchbase"    % "1.4.1"
    exclude("org.slf4j", "log4j-over-slf4j")
    exclude("org.slf4j", "jcl-over-slf4j"),
  "org.slf4j"         % "slf4j-log4j12" % "1.6.1",
  "org.scalatest"     %% "scalatest"    % Version.ScalaTest % "it",
  "org.apache.hadoop" %  "hadoop-common"  % Version.Hadoop           % "it"
    exclude("commons-daemon","commons-daemon")
    exclude("org.mortbay.jetty", "jsp-api-2.1")
    exclude("org.mortbay.jetty", "jsp-2.1")
    exclude("org.mortbay.jetty", "jetty-util")
    exclude("org.mortbay.jetty", "jetty")
    exclude("tomcat", "jasper-runtime")
    exclude("tomcat", "jasper-compiler")
    exclude("junit", "junit"),
  "org.apache.hadoop" %  "hadoop-common"  % Version.Hadoop           % "it" classifier "tests" 
    exclude("commons-daemon","commons-daemon")
    exclude("org.mortbay.jetty", "jsp-api-2.1")
    exclude("org.mortbay.jetty", "jsp-2.1")
    exclude("org.mortbay.jetty", "jetty-util")
    exclude("org.mortbay.jetty", "jetty")
    exclude("tomcat", "jasper-runtime")
    exclude("tomcat", "jasper-compiler")
    exclude("junit", "junit"),
  "org.apache.hadoop"    %  "hadoop-hdfs"   % Version.Hadoop % "it"
    exclude("commons-daemon","commons-daemon")
    exclude("org.mortbay.jetty", "jsp-api-2.1")
    exclude("org.mortbay.jetty", "jsp-2.1")
    exclude("org.mortbay.jetty", "jetty-util")
    exclude("org.mortbay.jetty", "jetty")
    exclude("tomcat", "jasper-runtime")
    exclude("tomcat", "jasper-compiler")
    exclude("junit", "junit"),
  "org.apache.hadoop" %  "hadoop-hdfs"  % Version.Hadoop           % "it" classifier "tests" exclude("commons-daemon","commons-daemon"),
  "org.apache.hbase"  %  "hbase"        % Version.Hbase          % "it" classifier "tests"
)

resolvers += "Cloudera Releases" at "https://repository.cloudera.com/artifactory/cloudera-repos"

OsgiKeys.importPackage := Seq(
  "scala*;version=\"[2.10.0,2.11.0)\"",
  "akka*;version=\"[2.1.1,2.2.0)\""
)
