plugins {
    `karakum-conventions`
}

dependencies {
    jsMainImplementation(libs.karakum)
//    jsMainImplementation(projects.kotlinJs)
//    jsMainImplementation(projects.kotlinNode)
//    jsMainImplementation(projects.kotlinTypescript)

    jsMainImplementation(devNpm(libs.npm.types.node))
}
