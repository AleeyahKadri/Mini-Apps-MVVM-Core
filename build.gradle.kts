import org.gradle.api.tasks.Delete

// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    extra["kotlin_version"] = "1.2.71"

    repositories {
        google()
        jcenter()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:3.2.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${extra["kotlin_version"]}")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }

    extra["rxjava_version"] = "2.1.14"
    extra["rxAndroid_version"] = "2.0.2"
    extra["dagger2_version"] = "2.16"
    extra["retrofit_version"] = "2.3.0"
    extra["lifecycle_version"] = "1.1.1"
    extra["sizing_version"] = "1.0.5"
    extra["calligraphy_version"] = "2.3.0"

    extra["libs"] = mapOf(
        "rxJava" to "io.reactivex.rxjava2:rxjava:${extra["rxjava_version"]}",
        "rxAndroid" to "io.reactivex.rxjava2:rxandroid:${extra["rxAndroid_version"]}",
        "dagger2" to "com.google.dagger:dagger-android:${extra["dagger2_version"]}",
        "daggerSupport" to "com.google.dagger:dagger-android-support:${extra["dagger2_version"]}",
        "daggerAnnotationProcess" to "com.google.dagger:dagger-android-processor:${extra["dagger2_version"]}",
        "daggerCompiler" to "com.google.dagger:dagger-compiler:${extra["dagger2_version"]}",
        "retrofit" to "com.squareup.retrofit2:retrofit:${extra["retrofit_version"]}",
        "retrofitRxAdapter" to "com.squareup.retrofit2:adapter-rxjava2:${extra["retrofit_version"]}",
        "okhttp" to "com.squareup.okhttp3:okhttp:3.10.0",
        "gson" to "com.google.code.gson:gson:2.8.2",
        "gsonConverter" to "com.squareup.retrofit2:converter-gson:2.3.0",
        "subjectRelayRx" to "com.jakewharton.rxrelay2:rxrelay:2.0.0",
        "liveDataAndViewModel" to "android.arch.lifecycle:extensions:${extra["lifecycle_version"]}",
        "viewSizing" to "com.intuit.sdp:sdp-android:${extra["sizing_version"]}",
        "textSizing" to "com.intuit.ssp:ssp-android:${extra["sizing_version"]}",
        "fonts" to "uk.co.chrisjenx:calligraphy:${extra["calligraphy_version"]}"
    )
}

allprojects {
    repositories {
        google()
        jcenter()
        maven(url = "https://jitpack.io")
    }
}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}
