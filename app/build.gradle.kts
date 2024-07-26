plugins {
    id("application")
}

group = "com.ethamorim"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

application {
    mainClass = "com.ethamorim.tutorial.Main"
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}