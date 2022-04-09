plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdk = Constants.compileSdk
    buildToolsVersion = "30.0.3"

    defaultConfig {
        applicationId = Constants.packageName
        minSdk = Constants.minSdk
        targetSdk = Constants.targetSdk
        versionCode = Constants.versionCode
        versionName = Constants.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = Versions.javaVersion
        targetCompatibility = Versions.javaVersion
    }

    kotlinOptions {
        jvmTarget = Versions.jvmVersion
    }

    buildFeatures {
        dataBinding = true
        viewBinding = true
    }
}

dependencies {
    implementation(project(":core-ui"))
    implementation(project(":data"))
    implementation(project(":domain"))

    KotlinDependencies.run {
        implementation(kotlin)
        implementation(coroutines)
    }

    AndroidXDependencies.run {
        implementation(coreKtx)
        implementation(appCompat)
        implementation(constraintLayout)
        implementation(activity)
        implementation(fragment)
        implementation(lifeCycleKtx)
        implementation(lifecycleJava8)
        implementation(legacy)
        implementation(security)
    }

    // Material Design
    implementation(MaterialDesignDependencies.materialDesign)

    TestDependencies.run {
        testImplementation(jUnit)
        androidTestImplementation(androidTest)
        androidTestImplementation(espresso)
    }

    ThirdPartyDependencies.run {
        implementation(retrofit)
        implementation(retrofitJsonConverter)
    }
}