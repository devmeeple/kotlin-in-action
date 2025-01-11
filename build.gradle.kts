plugins {
    kotlin("jvm") version "2.0.21"
}

object Versions {
    const val ASSERTJ = "3.27.2" // AssertJ
    const val KOTEST = "5.9.1" // Kotest
    const val MOCKK = "1.13.16"
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))

    // JUnit 5 + AssertJ Core
    testImplementation("org.assertj:assertj-core:${Versions.ASSERTJ}")

    // Kotest
    testImplementation("io.kotest:kotest-runner-junit5:${Versions.KOTEST}") // Test Framework
    testImplementation("io.kotest:kotest-assertions-core:${Versions.KOTEST}") // Assertions

    // Mockk
    testImplementation("io.mockk:mockk:${Versions.MOCKK}")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}
