// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    val kotlinVersion by extra("1.6.21")
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.0.4")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
    
    val rxjavaVersion by extra("2.1.14")
    val rxAndroidVersion by extra("2.0.2")
    val dagger2Version by extra("2.16")
    val retrofitVersion by extra("2.3.0")
    val lifecycleVersion by extra("1.1.1")
    val sizingVersion by extra("1.0.5")
    val calligraphyVersion by extra("2.3.0")
    
    extra.apply {
        set("libs", mapOf(
            "rxJava" to "io.reactivex.rxjava2:rxjava:$rxjavaVersion",
            "rxAndroid" to "io.reactivex.rxjava2:rxandroid:$rxAndroidVersion",
            "dagger2" to "com.google.dagger:dagger-android:$dagger2Version",
            "daggerSupport" to "com.google.dagger:dagger-android-support:$dagger2Version",
            "daggerAnnotationProcess" to "com.google.dagger:dagger-android-processor:$dagger2Version",
            "daggerCompiler" to "com.google.dagger:dagger-compiler:$dagger2Version",
            "retrofit" to "com.squareup.retrofit2:retrofit:$retrofitVersion",
            "retrofitRxAdapter" to "com.squareup.retrofit2:adapter-rxjava2:$retrofitVersion",
            "okhttp" to "com.squareup.okhttp3:okhttp:3.10.0",
            "gson" to "com.google.code.gson:gson:2.8.2",
            "gsonConverter" to "com.squareup.retrofit2:converter-gson:2.3.0",
            "subjectRelayRx" to "com.jakewharton.rxrelay2:rxrelay:2.0.0",
            "liveDataAndViewModel" to "android.arch.lifecycle:extensions:$lifecycleVersion",
            "viewSizing" to "com.intuit.sdp:sdp-android:$sizingVersion",
            "textSizing" to "com.intuit.ssp:ssp-android:$sizingVersion",
            "fonts" to "uk.co.chrisjenx:calligraphy:$calligraphyVersion"
        ))
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        maven { url = uri("https://jitpack.io") }
    }
}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}
