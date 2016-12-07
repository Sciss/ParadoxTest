val root = (project in file("."))
  .enablePlugins(ParadoxPlugin, ParadoxSitePlugin)
  .settings(ghpages.settings)
  .settings(
    name := "ParadoxTest",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := "2.11.8",
    git.remoteRepo := s"git@github.com:Sciss/${name.value}.git",
    git.gitCurrentBranch := "master",
    paradoxTheme := Some(builtinParadoxTheme("generic")),
    paradoxProperties in Paradox ++= Map(
      "foo" -> "bar",
      "extref.download.base_url" -> s"https://github.com/Sciss/ScalaColliderSwing/releases/download/v${version.value}/scalacolliderswing-${version.value}-%s.zip"
    )
  )
