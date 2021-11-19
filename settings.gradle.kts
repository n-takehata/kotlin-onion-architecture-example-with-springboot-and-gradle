pluginManagement {
    repositories {
        mavenCentral()

        maven("https://plugins.gradle.org/m2/")
    }
}
rootProject.name = "kotlin-onion-architecture-example-with-springboot-and-gradle"

include(":presentation")
include(":infrastructure")
include(":application")
include(":domain")
