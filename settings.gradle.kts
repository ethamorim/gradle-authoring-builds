rootProject.name = "gradle-authoring-builds"
include("app")
include("lib")
includeBuild("gradle/license-plugin")

println("SETTINGS FILE: This is executed during the initialization phase")
