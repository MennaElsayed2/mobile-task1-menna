plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    // يجب أن يتطابق هذا مع الـ package name الذي تستخدمه
    namespace = "com.example.profileapp"
    compileSdk = 34 // يمكنك استخدام 33 أو 34

    defaultConfig {
        applicationId = "com.example.profileapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    // هذا السطر مهم لتفعيل ViewBinding الذي استخدمناه
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")

}