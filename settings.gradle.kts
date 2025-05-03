pluginManagement {
    repositories{
        gradlePluginPortal()
        mavenCentral()
        mavenLocal()
        maven {
            name = "MinecraftForge"
            setUrl("https://maven.minecraftforge.net/")
        }
        maven {
            name = "parchmentmc"
            setUrl("https://maven.parchmentmc.org")
        }
    }

    plugins {
        kotlin("jvm") version "2.1.10"
        kotlin("plugin.serialization") version "2.1.10"
        id("net.minecraftforge.gradle") version "[6.0.16,6.2)"
        id("org.parchmentmc.librarian.forgegradle") version "1.+"
    }
}

rootProject.name = "dragonloot-forge"

include("forge-1.20.1")