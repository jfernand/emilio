import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    application
    kotlin("jvm") version "1.6.21"
    id("org.openjfx.javafxplugin") version "0.0.10"
}

group = "es.casaroja"
version = "1.0-SNAPSHOT"

javafx {
    version = "18.0.2"
    modules("javafx.controls", "javafx.fxml", "javafx.web")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.apache.lucene:lucene-core:9.2.0")
    implementation("io.insert-koin:koin-core-jvm:3.2.0")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

gradle.taskGraph.whenReady {
    allTasks
        .filter { it.hasProperty("duplicatesStrategy") } // Because it's some weird decorated wrapper that I can't cast.
        .forEach {
            it.setProperty("duplicatesStrategy", "EXCLUDE")
        }
}

application {
//    mainModule.set(moduleName)
     mainClass.set("es.casaroja.emilio.Launcher")
}

java {
    modularity.inferModulePath.set(true)
}

tasks.withType<KotlinCompile>{
    targetCompatibility = "11"
}
