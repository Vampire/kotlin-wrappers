import org.jetbrains.kotlin.gradle.targets.js.dsl.ExperimentalMainFunctionArgumentsDsl
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsExec

plugins {
    id("kotlin-conventions")
}

kotlin.js {
    binaries.executable()
    @OptIn(ExperimentalMainFunctionArgumentsDsl::class)
    passAsArgumentToMainFunction("process.argv.slice(2)")
}

val jsNodeProductionRun by tasks.existing(NodeJsExec::class) {
    val destinationDirectory = layout.buildDirectory.dir("generated/sources/karakum/jsMain")
    outputs.dir(destinationDirectory).withPropertyName("destinationDirectory")
    argumentProviders.add(object : CommandLineArgumentProvider {
        override fun asArguments() = listOf(
            layout.buildDirectory.dir("generated/sources/karakum/jsMain").get().asFile.absolutePath
        )
    })
}

val generatedSources = configurations.consumable("generatedSources")
artifacts {
    add(generatedSources.name, jsNodeProductionRun)
}
