plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
}

android {
    compileSdkVersion(28)
    defaultConfig {
        applicationId = "com.binarycase.saudiassociation"
        minSdkVersion(17)
        targetSdkVersion(28)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
        multiDexEnabled = true
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
    
    dataBinding {
        isEnabled = true
    }
    
    compileOptions {
        targetCompatibility = JavaVersion.VERSION_1_8
        sourceCompatibility = JavaVersion.VERSION_1_8
    }
}

val libs = rootProject.extra["libs"] as Map<*, *>

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:${rootProject.extra["kotlinVersion"]}")
    implementation("com.android.support:appcompat-v7:27.1.1")
    implementation("com.android.support.constraint:constraint-layout:1.1.3")
    testImplementation("junit:junit:4.12")
    androidTestImplementation("com.android.support.test:runner:1.0.2")
    androidTestImplementation("com.android.support.test.espresso:espresso-core:3.0.2")
    implementation("com.squareup.okhttp3:logging-interceptor:3.9.1")
    implementation("com.github.Tripl3Dev:PrettyStateView:2.1.1")
    implementation("com.github.Tripl3Dev:PrettyListView:1.0.0")
    implementation("tk.zielony:carbon:0.15.2")
    implementation("de.hdodenhof:circleimageview:2.2.0")
    implementation("com.squareup.picasso:picasso:2.71828")
    implementation("com.blankj:utilcode:1.19.0")
    implementation("com.github.bumptech.glide:glide:4.8.0")
    annotationProcessor("com.github.bumptech.glide:compiler:4.8.0")
    implementation(libs["rxAndroid"] as String)
    implementation(libs["retrofit"] as String)
    implementation(libs["retrofitRxAdapter"] as String)
    implementation(libs["okhttp"] as String)
    implementation(libs["gson"] as String)
    implementation(libs["gsonConverter"] as String)
    implementation(libs["rxJava"] as String)
    implementation(libs["rxAndroid"] as String)
    implementation(libs["dagger2"] as String)
    implementation(libs["daggerSupport"] as String)
    kapt(libs["daggerAnnotationProcess"] as String)
    kapt(libs["daggerCompiler"] as String)
    implementation(libs["liveDataAndViewModel"] as String)
    implementation(libs["viewSizing"] as String)
    implementation(libs["textSizing"] as String)
    implementation(libs["fonts"] as String)
}
