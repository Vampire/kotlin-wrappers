plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinBrowser)

    jsMainApi(npmv(libs.npm.tanstack.table.core))
}
