resolvers += "jgit-repo" at "http://download.eclipse.org/jgit/maven"

addSbtPlugin("com.typesafe.sbt" % "sbt-site"    % "1.2.0-RC1")
addSbtPlugin("com.typesafe.sbt" % "sbt-ghpages" % "0.5.4")
// addSbtPlugin("com.eed3si9n"     % "sbt-unidoc"  % "0.3.3")
addSbtPlugin("com.lightbend.paradox" % "sbt-paradox" % "0.2.7")
