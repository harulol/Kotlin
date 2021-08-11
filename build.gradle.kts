import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    kotlin("jvm") version "1.5.21"
    kotlin("plugin.serialization") version "1.5.21"
    java
    id("com.github.johnrengelman.shadow") version "7.0.0"
}

group = "dev.hawu.plugins"
version = "1.5.21"

repositories {
    mavenCentral()
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots")
    maven("https://oss.sonatype.org/content/repositories/snapshots")
}

val shade by configurations.creating {
    configurations.getByName("implementation").extendsFrom(this)
}

dependencies {
    shade(kotlin("stdlib"))
    shade("org.jetbrains:annotations:21.0.1")
    shade("org.jetbrains.kotlin:kotlin-reflect:1.5.21")
    implementation("org.bukkit:bukkit:1.8-R0.1-SNAPSHOT")
    implementation("net.md-5:bungeecord-api:1.8-SNAPSHOT")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

tasks.getByName<ShadowJar>("shadowJar") {
    archiveBaseName.set("Kotlin")
    
    configurations = listOf(shade)
    dependencies {
        include(dependency(dependencies.kotlin("stdlib")))
        include(dependency("org.jetbrains:annotations:.*"))
        include(dependency("org.jetbrains.kotlin:kotlin-reflect:.*"))
    }
}

tasks.getByName<Jar>("jar") {
    archiveBaseName.set("Kotlin")

    ant.withGroovyBuilder {
        "replace"(
            "file" to "src/main/resources/plugin.yml",
            "token" to "@VERSION@",
            "value" to project.version.toString(),
        )

        "replace"(
            "file" to "src/main/resources/bungee.yml",
            "token" to "@VERSION@",
            "value" to project.version.toString(),
        )
    }

    doLast {
        ant.withGroovyBuilder {
            "replace"(
                "file" to "src/main/resources/plugin.yml",
                "token" to project.version.toString(),
                "value" to "@VERSION@",
            )

            "replace"(
                "file" to "src/main/resources/bungee.yml",
                "token" to project.version.toString(),
                "value" to "@VERSION@",
            )
        }
    }
}