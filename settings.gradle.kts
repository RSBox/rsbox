import java.nio.file.Files

plugins {
    id("de.fayard.refreshVersions") version "0.50.2"
}

rootProject.name = "rsbox"

include(":toolbox:cache-type-generator")

include(":client")

include(":server")
include(":server:logger")
include(":server:common")
include(":server:util")
include(":server:config")
include(":server:cache")
include(":server:engine")
include(":server:script")

include(":server:game")
includeAll(project(":server:game"))

fun includeAll(project: ProjectDescriptor) {
    val projectPath = project.projectDir.toPath()

    Files.walk(projectPath).forEach {
        if(!Files.isDirectory(it)) {
            return@forEach
        }
        if(!Files.exists(it.resolve("build.gradle.kts"))) {
            return@forEach
        }
        val relativePath = projectPath.relativize(it)
        val projectName = relativePath.toString().replace(File.separator, ":")
        include("server:${project.name}:$projectName")
    }
}
