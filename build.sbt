val lOSC       = RootProject(uri("git://github.com/Sciss/ScalaOSC.git#v1.1.4"))
val lAudioFile = RootProject(uri("git://github.com/Sciss/ScalaAudioFile.git#v1.4.5"))
val lUGens     = RootProject(uri("git://github.com/Sciss/ScalaColliderUGens.git#v1.16.0"))
val lMain      = RootProject(uri("git://github.com/Sciss/ScalaCollider.git#v1.21.0"))

val apiDir = settingKey[String]("Sub-directory for API docs")

val root = (project in file("."))
  .settings(unidocSettings)
  .enablePlugins(ParadoxSitePlugin)
  .settings(ghpages.settings)
  .settings(
    name := "ParadoxTest",
    version := "0.1.0-SNAPSHOT",
    apiDir := "latest/api",
    addMappingsToSiteDir(mappings in (ScalaUnidoc, packageDoc), apiDir),
    git.remoteRepo := s"git@github.com:Sciss/${name.value}.git",
    git.gitCurrentBranch := "master",
    paradoxTheme := Some(builtinParadoxTheme("generic")),
    scalacOptions in (Compile, doc) ++= Seq("-skip-packages", "de.sciss.osc.impl")
  )
  .aggregate(lOSC, lAudioFile, lUGens, lMain)
