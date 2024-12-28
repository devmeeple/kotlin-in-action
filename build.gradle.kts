plugins {
    kotlin("jvm") version "2.0.21"
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("org.assertj:assertj-core:3.26.3")

    // Kotest
    testImplementation("io.kotest:kotest-runner-junit5:5.9.1") // Test Framework
    testImplementation("io.kotest:kotest-assertions-core:5.9.1") // Assertions

}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}
