object KotlinDependencies {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlinVersion}"
    const val coroutines =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesAndroidVersion}"
    const val jsonSerialization =
        "org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.kotlinSerializationJsonVersion}"
    const val dateTime = "org.jetbrains.kotlinx:kotlinx-datetime:${Versions.kotlinDateTimeVersion}"
}

object AndroidXDependencies {
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtxVersion}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompatVersion}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayoutVersion}"
    const val startup = "androidx.startup:startup-runtime:${Versions.appStartUpVersion}"
    const val hilt = "com.google.dagger:hilt-android:${Versions.hiltVersion}"
    const val activity = "androidx.activity:activity-ktx:${Versions.activityKtxVersion}"
    const val fragment = "androidx.fragment:fragment-ktx:${Versions.fragmentKtxVersion}"
    const val legacy = "androidx.legacy:legacy-support-v4:${Versions.legacySupportVersion}"
    const val security = "androidx.security:security-crypto:${Versions.securityVersion}"
    const val lifeCycleKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleVersion}"
    const val lifeCycleLiveDataKtx =
        "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycleVersion}"
    const val lifecycleJava8 =
        "androidx.lifecycle:lifecycle-common-java8:${Versions.lifecycleVersion}"
    const val splashScreen = "androidx.core:core-splashscreen:${Versions.splashVersion}"
    const val pagingRuntime = "androidx.paging:paging-runtime:${Versions.pagingVersion}"
    const val coroutines =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesAndroidVersion}"
}

object TestDependencies {
    const val jUnit = "junit:junit:${Versions.junitVersion}"
    const val androidTest = "androidx.test.ext:junit:${Versions.androidTestVersion}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espressoVersion}"
}

object MaterialDesignDependencies {
    const val materialDesign =
        "com.google.android.material:material:${Versions.materialDesignVersion}"
}

object KaptDependencies {
    const val hiltAndroidCompiler = "com.google.dagger:hilt-compiler:${Versions.hiltVersion}"
    const val hiltCompiler = "com.google.dagger:hilt-compiler:${Versions.hiltVersion}"
}

object ThirdPartyDependencies {
    const val coil = "io.coil-kt:coil:${Versions.coilVersion}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofitVersion}"
    const val retrofitJsonConverter =
        "com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:${Versions.kotlinSerializationConverterVersion}"
    const val okHttpBom = "com.squareup.okhttp3:okhttp-bom:${Versions.okHttpVersion}"
    const val okHttp = "com.squareup.okhttp3:okhttp"
    const val okHttpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor"
    const val timber = "com.jakewharton.timber:timber:${Versions.timberVersion}"
    const val flipper = "com.facebook.flipper:flipper:${Versions.flipperVersion}"
    const val soloader = "com.facebook.soloader:soloader:${Versions.soloaderVersion}"
    const val flipperNetwork =
        "com.facebook.flipper:flipper-network-plugin:${Versions.flipperVersion}"
    const val flipperLeakCanary =
        "com.facebook.flipper:flipper-leakcanary2-plugin:${Versions.flipperVersion}"
    const val leakCanary =
        "com.squareup.leakcanary:leakcanary-android:${Versions.leakCanaryVersion}"
    const val ossLicense =
        "com.google.android.gms:play-services-oss-licenses:${Versions.ossVersion}"
    const val hiltCore = "com.google.dagger:hilt-core:${Versions.hiltVersion}"
}

object ClassPathPlugins {
    const val hilt = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hiltVersion}"
    const val oss = "com.google.android.gms:oss-licenses-plugin:${Versions.ossPluginVersion}"
}

val Compose = listOf(
    "androidx.activity:activity-compose:${Versions.activityKtxVersion}",
    "androidx.compose.material:material:${Versions.composeVersion}",
    "androidx.compose.animation:animation:${Versions.composeVersion}",
    "androidx.compose.ui:ui:${Versions.composeVersion}",
    "androidx.compose.ui:ui-tooling-preview:${Versions.composeVersion}",
    "androidx.compose.foundation:foundation:${Versions.composeVersion}",
    "androidx.compose.material:material-icons-core:${Versions.composeVersion}",
    "androidx.compose.material:material-icons-extended:${Versions.composeVersion}",
    "androidx.constraintlayout:constraintlayout-compose:1.0.0",
    "androidx.lifecycle:lifecycle-viewmodel-compose:1.0.0-alpha07",
    "androidx.hilt:hilt-navigation-compose:1.0.0",
    "androidx.paging:paging-compose:1.0.0-alpha14",
    "io.coil-kt:coil-compose:1.4.0",
)

val ComposeDebug = listOf(
    "androidx.compose.ui:ui-tooling:${Versions.composeVersion}"
)