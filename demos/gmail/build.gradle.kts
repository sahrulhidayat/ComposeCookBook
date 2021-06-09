import com.guru.composecookbook.build.dependencies.*
plugins {
    /**
     * See [common-compose-module-configs-script-plugin.gradle.kts] file
     */
    id("common-compose-module-configs-script-plugin")
}

dependencies {
    implementation(project(":components:fab"))
    implementation(project(":data"))
    implementation(project(":theme"))

    addComposeOfficialDependencies()
    addCoreAndroidUiDependencies()
}
