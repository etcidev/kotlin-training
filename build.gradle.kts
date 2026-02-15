plugins {
    kotlin("jvm") version "2.3.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

sourceSets {
    main {
        kotlin.srcDirs("src/main/kotlin", "tasks")
    }
    test {
        kotlin.srcDirs("src/test/kotlin")
    }
}


kotlin {
    jvmToolchain(17)
}

tasks.test {
    useJUnitPlatform()
}