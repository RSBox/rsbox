repositories {
    maven(url ="https://jitpack.io")
}

dependencies {
    implementation(project(":server:logger"))
    implementation(project(":server:common"))
    implementation(project(":server:util"))
    implementation(project(":server:config"))
    implementation(project(":server:cache"))
    implementation(project(":server:engine"))
    implementation(project(":server:script"))
    implementation(project(":server:game"))
    implementation("me.tongfei:progressbar:_")
    implementation("dev.reimer:progressbar-ktx:_")
}

tasks {
    register<JavaExec>("run server") {
        dependsOn(compileKotlin)
        group = "rsbox"
        mainClass.set("io.rsbox.server.ServerLauncher")
        workingDir = rootProject.projectDir
        classpath = sourceSets["main"].runtimeClasspath
    }

    register<JavaExec>("setup server") {
        dependsOn(compileKotlin)
        group = "rsbox"
        mainClass.set("io.rsbox.server.SetupLauncher")
        workingDir = rootProject.projectDir
        classpath = sourceSets["main"].runtimeClasspath
    }
}