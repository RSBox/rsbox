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
        implementation(project(":server:common"))
        implementation(project(":server:util"))
        implementation(project(":server:script"))
        implementation(project(":server:logger"))
        implementation(project(":server:engine"))
        implementation(project(":server:cache"))
        implementation(project(":server:config"))
        implementation(kotlin("scripting-common"))
        implementation(kotlin("script-runtime"))
    }
}