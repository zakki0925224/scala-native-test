scalaVersion := "3.6.4"
name         := "scala-native-test"
organization := "io.github.zakki0925224"
version      := "1.0"

logLevel := Level.Info

enablePlugins(ScalaNativePlugin)

import scala.scalanative.build._

nativeConfig ~= { c =>
    c.withLTO(LTO.none)
    c.withMode(Mode.debug)
    c.withGC(GC.immix)
}
