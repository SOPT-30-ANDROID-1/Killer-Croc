plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
    kotlin("plugin.serialization") version Versions.kotlinVersion
    id("kotlin-parcelize")

}

android {
    compileSdk = Constants.compileSdk

    defaultConfig {
        minSdk = Constants.minSdk
        targetSdk = Constants.targetSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    compileOptions {
        sourceCompatibility = Versions.javaVersion
        targetCompatibility = Versions.javaVersion
    }
    kotlinOptions {
        jvmTarget = Versions.jvmVersion
    }
}

dependencies {
    implementation(project(":domain"))
    AndroidXDependencies.run {
        implementation(hilt)
    }
    KotlinDependencies.run {
        implementation(kotlin)
        implementation(jsonSerialization)
        implementation(coroutines)
    }
    ThirdPartyDependencies.run {
        implementation(retrofit)
        implementation(retrofitJsonConverter)
        implementation(timber)
    }
    TestDependencies.run {
        testImplementation(jUnit)
        androidTestImplementation(androidTest)
        androidTestImplementation(espresso)
    }
}