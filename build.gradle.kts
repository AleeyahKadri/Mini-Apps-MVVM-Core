// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    val kotlinVersion by extra("1.2.71")
    val rxjavaVersion by extra("2.1.14")
    val rxAndroidVersion by extra("2.0.2")
    val dagger2Version by extra("2.16")
    val retrofitVersion by extra("2.3.0")
    val lifecycleVersion by extra("1.1.1")
    val sizingVersion by extra("1.0.5")
    val calligraphyVersion by extra("2.3.0")
    
    repositories {
        google()
        jcenter()
    }
    
    dependencies {
        classpath("com.android.tools.build:gradle:3.2.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
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
