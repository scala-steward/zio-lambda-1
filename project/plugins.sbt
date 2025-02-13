addSbtPlugin("org.scalameta"             % "sbt-scalafmt"        % "2.5.2")
addSbtPlugin("pl.project13.scala"        % "sbt-jmh"             % "0.4.7")
addSbtPlugin("com.eed3si9n"              % "sbt-buildinfo"       % "0.11.0")
addSbtPlugin("org.scoverage"             % "sbt-scoverage"       % "2.0.11")
addSbtPlugin("org.scalameta"             % "sbt-mdoc"            % "2.6.4")
addSbtPlugin("ch.epfl.scala"             % "sbt-bloop"           % "1.5.15")
addSbtPlugin("com.eed3si9n"              % "sbt-unidoc"          % "0.4.3")
addSbtPlugin("com.github.sbt"            % "sbt-ci-release"      % "1.5.12")
addSbtPlugin("com.eed3si9n"              % "sbt-assembly"        % "0.14.6")
addSbtPlugin("com.github.sbt"            % "sbt-native-packager" % "1.9.16")
addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat"        % "0.4.4")
addSbtPlugin("dev.zio"                   % "zio-sbt-website"     % "0.3.9")

resolvers += Resolver.sonatypeRepo("public")
