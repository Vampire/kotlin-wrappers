plugins {
    `kotlin-library-conventions`
    alias(libs.plugins.karakum)
}

val generatedSourcesDependency = configurations.dependencyScope("generatedSourcesDependency")
val generatedSources = configurations.resolvable("generatedSources") {
    extendsFrom(generatedSourcesDependency.get())
}

dependencies {
    generatedSourcesDependency(project(path = projects.kotlinNode.karakum.path, configuration = "generatedSources"))

    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinWeb)

    jsMainImplementation(libs.coroutines.core)

    jsMainApi(devNpm(libs.npm.types.node))

    jsTestImplementation(libs.kotlin.test)
    jsTestImplementation(libs.coroutines.test)
}

kotlin {
    js {
        compilations {
            val main by existing {
                defaultSourceSet {
                    kotlin.srcDir(generatedSources)
                }
            }
        }
    }
}
