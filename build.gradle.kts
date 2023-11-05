import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.9.0"
    id("org.zeroturnaround.gradle.jrebel") version "1.1.12" apply false
}

val jrebel: String by ext

tasks.wrapper {
    gradleVersion = "8.2.1"
}

allprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")

    group = "io.rsbox"
    version = "1.0.0"

    repositories {
        mavenLocal()
        mavenCentral()
        maven(url = "https://jitpack.io")
        maven(url = "https://repo.openrs2.org/repository/openrs2")
        maven(url = "https://repo.openrs2.org/repository/openrs2-snapshots")
        maven(url = "https://maven.fabricmc.net")
    }

    dependencies {
        implementation(kotlin("stdlib"))
        implementation(kotlin("reflect"))
        testImplementation(kotlin("test"))
    }

    tasks.test {
        useJUnitPlatform()
    }

    kotlin {
        jvmToolchain {
            languageVersion.set(JavaLanguageVersion.of(11))
        }
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xallow-any-scripts-in-source-roots")
        }
    }
}

if(jrebel == "true") {
    logger.info("Enabling JRebel for project environment.")
    allprojects {
        apply (plugin = "org.zeroturnaround.gradle.jrebel")
    }
}