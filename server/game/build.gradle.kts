dependencies {
    implementation(project(":server:common"))
    implementation(project(":server:util"))
    implementation(project(":server:logger"))
    implementation(project(":server:script"))
    implementation(kotlin("scripting-common"))
    implementation(kotlin("script-runtime"))
    implementation("io.github.classgraph:classgraph:_")

    subprojects.forEach { subproject ->
        if(!subproject.buildFile.exists()) return@forEach
        implementation(subproject)
    }
}

subprojects {
    dependencies {
        compileOnly(project(":server:common"))
        compileOnly(project(":server:util"))
        implementation(project(":server:script"))
        compileOnly(project(":server:logger"))
        compileOnly(project(":server:engine"))
        compileOnly(project(":server:cache"))
        compileOnly(project(":server:config"))
        implementation(kotlin("scripting-common"))
        implementation(kotlin("script-runtime"))
        project(":server:game").dependencyProject.subprojects.forEach { subproject ->
            if(subproject.name == project.name) return@forEach
            compileOnly(subproject)
        }
    }
}