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

val kotlinVersion: String by rootProject.extra
val rxjavaVersion: String by rootProject.extra
val rxAndroidVersion: String by rootProject.extra
val dagger2Version: String by rootProject.extra
val retrofitVersion: String by rootProject.extra
val lifecycleVersion: String by rootProject.extra
val sizingVersion: String by rootProject.extra
val calligraphyVersion: String by rootProject.extra

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlinVersion")
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
    kapt("com.github.bumptech.glide:compiler:4.8.0")
    
    // RxJava
    implementation("io.reactivex.rxjava2:rxjava:$rxjavaVersion")
    implementation("io.reactivex.rxjava2:rxandroid:$rxAndroidVersion")
    
    // Dagger2
    implementation("com.google.dagger:dagger-android:$dagger2Version")
    implementation("com.google.dagger:dagger-android-support:$dagger2Version")
    kapt("com.google.dagger:dagger-android-processor:$dagger2Version")
    kapt("com.google.dagger:dagger-compiler:$dagger2Version")
    
    // Retrofit
    implementation("com.squareup.retrofit2:retrofit:$retrofitVersion")
    implementation("com.squareup.retrofit2:adapter-rxjava2:$retrofitVersion")
    implementation("com.squareup.okhttp3:okhttp:4.9.2")
    implementation("com.google.code.gson:gson:2.8.9")
    implementation("com.squareup.retrofit2:converter-gson:2.3.0")
    
    // Other
    implementation("com.jakewharton.rxrelay2:rxrelay:2.0.0")
    implementation("android.arch.lifecycle:extensions:$lifecycleVersion")
    implementation("com.intuit.sdp:sdp-android:$sizingVersion")
    implementation("com.intuit.ssp:ssp-android:$sizingVersion")
    implementation("uk.co.chrisjenx:calligraphy:$calligraphyVersion")
}
