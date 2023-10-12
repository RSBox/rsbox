dependencies {
    implementation(project(":server:common"))
    implementation(project(":server:logger"))
    implementation(project(":server:util"))
    implementation(project(":server:config"))
    api("org.openrs2:openrs2-cache:_")
}