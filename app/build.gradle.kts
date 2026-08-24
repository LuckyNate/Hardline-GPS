plugins {
    id("com.android.application")
}

val ciBuildNumber = System.getenv("GITHUB_RUN_NUMBER")?.toIntOrNull()

android {
    namespace = "com.prankdom.hardlinegps"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.prankdom.hardlinegps"
        minSdk = 33
        targetSdk = 36
        versionCode = ciBuildNumber ?: 1
        versionName = if (ciBuildNumber != null) "0.1.$ciBuildNumber" else "0.1.0"
    }
}

dependencies {
    implementation("androidx.webkit:webkit:1.17.0")
    implementation("androidx.core:core-ktx:1.17.0")
}
