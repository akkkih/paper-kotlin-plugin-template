plugins {
    kotlin("jvm") version "1.9.0"
    id("com.github.johnrengelman.shadow") version "8.1.1"
    id("xyz.jpenilla.run-paper") version "2.2.0"
}

group = "com.example"
version = "1.0"

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
    maven("https://repo.flyte.gg/releases")
    maven("https://jitpack.io")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.20.4-R0.1-SNAPSHOT")
    implementation("com.github.Revxrsal.Lamp:common:3.1.8")
    implementation("com.github.Revxrsal.Lamp:bukkit:3.1.8")
    implementation("com.github.Revxrsal.Lamp:brigadier:3.1.8")
    implementation("gg.flyte:twilight:1.0.33")
}

kotlin {
    jvmToolchain(17)
}

tasks.runServer { minecraftVersion("1.20.4") }