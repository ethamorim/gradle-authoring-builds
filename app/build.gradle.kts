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
    implementation(project(":lib"))
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

println("BUILD SCRIPT: This is executed during the configuration phase")

tasks.register("task1") {
    println("REGISTER TASK1: This is executed during the configuration phase")
}

tasks.register("task2") {
    println("REGISTER TASK2: This is executed during the configuration phase")
}

tasks.named("task1") {
    println("NAMED TASK1: This is executed during the configuration phase")
    doFirst {
        println("NAMED TASK1 - doFirst: This is executed during the execution phase")
    }
    doLast {
        println("NAMED TASK1 - doLast: This is executed during the execution phase")
    }
}