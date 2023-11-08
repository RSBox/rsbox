import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    idea
    kotlin("plugin.serialization") version "1.9.0"
}

dependencies {
    implementation(project(":server:common"))
    implementation(project(":server:logger"))
    implementation(project(":server:util"))
    implementation(project(":server:config"))
    implementation(project(":server:cache"))
    implementation("io.netty:netty-all:_")
    implementation("com.google.guava:guava:_")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:_")
    implementation("io.github.classgraph:classgraph:_")
    implementation("com.github.rsbox:pathfinder:598abc0357")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:_")
}

tasks.withType(KotlinCompile::class).all {
    kotlinOptions.freeCompilerArgs = listOf("-Xcontext-receivers")
}