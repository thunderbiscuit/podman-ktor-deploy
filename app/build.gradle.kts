plugins {
    kotlin("jvm") version "1.5.10"
    application
}

group = "me.thunderbiscuit"
version = "0.0.1"

application {
    mainClass.set("io.ktor.server.netty.EngineMain")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    // Ktor
    implementation("io.ktor:ktor-server-core:1.6.0")
    implementation("io.ktor:ktor-server-netty:1.6.0")
    implementation("ch.qos.logback:logback-classic:1.2.3")
}
