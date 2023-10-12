plugins {
    java
}

dependencies {
    implementation("org.bouncycastle:bcprov-jdk15on:1.52")
    implementation("org.json:json:20220320")
    implementation("com.formdev:flatlaf:_")
    implementation("com.formdev:flatlaf-intellij-themes:_")
}

tasks {
    register<JavaExec>("run client") {
        dependsOn(compileJava.get())
        group = "rsbox"
        mainClass.set("ClientLauncher")
        workingDir = rootProject.projectDir
        classpath = sourceSets["main"].runtimeClasspath
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}