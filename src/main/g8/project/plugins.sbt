resolvers += Resolver.url("scalasbt snapshots", new URL("http://repo.scala-sbt.org/scalasbt/sbt-plugin-snapshots"))(Resolver.ivyStylePatterns)

addSbtPlugin("org.scala-android" % "sbt-android" % "1.7.6")

addSbtPlugin("org.roboscala" % "sbt-robovm" % "1.12.0")
