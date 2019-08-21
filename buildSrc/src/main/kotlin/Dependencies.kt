// Versions for Dependencies AND Build Plugins
const val KOTLIN_VERSION = "1.3.41"
const val ANDROIDX_NAVIGATION_VERSION = "2.0.0"
const val PLAYSERVICE_LICENSE_VERSION = "0.9.1"

object Deps {
    // Android (https://android.googlesource.com/platform/frameworks/support/+/refs/heads/androidx-master-dev/buildSrc/src/main/kotlin/androidx/build/dependencies/Dependencies.kt)
    const val ANDROIDX_ANNOTATIONS = "androidx.annotation:annotation:1.1.0"
    const val ANDROIDX_APPCOMPAT = "androidx.appcompat:appcompat:1.1.0-rc01"
    const val ANDROIDX_RECYCLERVIEW = "androidx.recyclerview:recyclerview:1.1.0-beta03"
    const val ANDROIDX_PREFERENCE = "androidx.preference:preference-ktx:1.1.0-rc01"
    const val ANDROIDX_CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:2.0.0-beta2"
    const val ANDROIDX_CORE = "androidx.core:core-ktx:1.1.0-rc03"

    private const val LIFECYCLE_VERSION = "2.1.0-rc01"
    const val ARCH_LIFECYCLE_EXT = "androidx.lifecycle:lifecycle-extensions:$LIFECYCLE_VERSION"
    const val ARCH_LIFECYCLE_RUNTIME = "androidx.lifecycle:lifecycle-runtime:$LIFECYCLE_VERSION"
    const val ARCH_LIFECYCLE_VIEWMODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:$LIFECYCLE_VERSION"
    const val ARCH_LIFECYCLE_COMMON = "androidx.lifecycle:lifecycle-common-java8:$LIFECYCLE_VERSION"

    const val ARCH_NAVIGATION_FRAGMENT = "androidx.navigation:navigation-fragment-ktx:$ANDROIDX_NAVIGATION_VERSION"
    const val ARCH_NAVIGATION_UI = "androidx.navigation:navigation-ui-ktx:$ANDROIDX_NAVIGATION_VERSION"

    private const val WORKMANAGER_VERSION = "2.2.0"
    const val ARCH_WORK_RUNTIME = "androidx.work:work-runtime-ktx:$WORKMANAGER_VERSION"
    const val ARCH_WORK_GCM = "androidx.work:work-gcm:$WORKMANAGER_VERSION" // Remove with min SDK 23

    const val ANDROID_MATERIAL = "com.google.android.material:material:1.1.0-alpha09" // https://github.com/material-components/material-components-android/releases

    // Play Services
    const val PLAYSERVICE_CORE = "com.google.android.play:core:1.6.1"
    const val PLAYSERVICE_LICENSES = "com.google.android.gms:play-services-oss-licenses:$PLAYSERVICE_LICENSE_VERSION"

    // Firebase
    const val FIREBASE_CORE = "com.google.firebase:firebase-core:17.1.0"
    const val FIREBASE_PERF = "com.google.firebase:firebase-perf:16.2.3"
    const val FIREBASE_CONFIG = "com.google.firebase:firebase-config:17.0.0"
    const val CRASHLYTICS = "com.crashlytics.sdk.android:crashlytics:2.10.1"

    // Code
    const val KOTLIN_STD_LIB = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$KOTLIN_VERSION"
    const val KOTLIN_SERIALIZATION = "org.jetbrains.kotlinx:kotlinx-serialization-runtime:0.11.1"
    private const val COROUTINES_VERSION = "1.2.1"
    const val COROUTINES = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$COROUTINES_VERSION"
    private const val DAGGER_VERSION = "2.24"
    const val DAGGER = "com.google.dagger:dagger:$DAGGER_VERSION"
    const val DAGGER_COMPILER = "com.google.dagger:dagger-compiler:$DAGGER_VERSION"
    const val RETROFIT = "com.squareup.retrofit2:retrofit:2.6.1"
    const val KOTLIN_RETROFIT_CONVERTER = "com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:0.4.0"
    const val EXTRAS_DELEGATES = "me.eugeniomarletti:android-extras-delegates:1.0.5"
    const val THREETEN_ABP = "com.jakewharton.threetenabp:threetenabp:1.2.1"
    const val TIMBER = "com.jakewharton.timber:timber:4.7.1"
    const val VIEWMODEL_INJECT = "com.vikingsen.inject:viewmodel-inject:0.1.1"
    const val VIEWMODEL_INJECT_PROCESSOR = "com.vikingsen.inject:viewmodel-inject-processor:0.1.1"

    // UI
    private const val MATERIAL_DIALOGS_VERSION = "3.1.0"
    const val MATERIAL_DIALOGS_CORE = "com.afollestad.material-dialogs:core:$MATERIAL_DIALOGS_VERSION"
    const val MATERIAL_DIALOGS_DATETIME = "com.afollestad.material-dialogs:datetime:$MATERIAL_DIALOGS_VERSION"
    const val MATERIAL_DIALOGS_LIFECYCLE = "com.afollestad.material-dialogs:lifecycle:$MATERIAL_DIALOGS_VERSION"
    const val MATERIAL_DIALOGS_INPUT = "com.afollestad.material-dialogs:input:$MATERIAL_DIALOGS_VERSION"

    // Database
    private const val ROOM_VERSION = "2.1.0"
    const val ARCH_ROOM_RUNTIME = "androidx.room:room-runtime:$ROOM_VERSION"
    const val ARCH_ROOM_KTX = "androidx.room:room-ktx:$ROOM_VERSION"
    const val ARCH_ROOM_COMPILER = "androidx.room:room-compiler:$ROOM_VERSION"
    private const val DBTOOLS_VERSION = "4.9.7"
    const val DBTOOLS_ROOM = "org.dbtools:dbtools-room:$DBTOOLS_VERSION"
    const val DBTOOLS_ROOM_SQLITE = "org.dbtools:dbtools-room-sqliteorg:$DBTOOLS_VERSION"

    // Network
    private const val OKHTTP_VERSION = "4.1.0" // https://github.com/square/okhttp/blob/master/CHANGELOG.md
    const val OKHTTP = "com.squareup.okhttp3:okhttp:$OKHTTP_VERSION"
    const val OKHTTP_LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:$OKHTTP_VERSION"
    const val OKHTTP_IHSANBAL_LOGGING_INTERCEPTOR = "com.github.ihsanbal:LoggingInterceptor:3.0.0"

    // Test - Integration
    private const val ESPRESSO_VERSION = "3.2.0"
    const val TEST_ESPRESSO_CORE = "androidx.test.espresso:espresso-core:$ESPRESSO_VERSION"
    const val TEST_ESPRESSO_CONTRIB = "androidx.test.espresso:espresso-contrib:$ESPRESSO_VERSION"
    const val TEST_RUNNER = "androidx.test:runner:1.2.0"
    const val TEST_RULES = "androidx.test:rules:1.2.0"
    const val TEST_ANDROIDX_JUNIT = "androidx.test.ext:junit:1.1.1"

    // Test - JUnit
    private const val JUNIT_VERSION = "5.5.1"
    const val TEST_JUNIT = "org.junit.jupiter:junit-jupiter:$JUNIT_VERSION"
    const val TEST_JUNIT_ENGINE = "org.junit.jupiter:junit-jupiter-engine:$JUNIT_VERSION"
    const val TEST_OKHTTP_MOCKWEBSERVER = "com.squareup.okhttp3:mockwebserver:$OKHTTP_VERSION"
    const val TEST_MOCKITO_CORE = "org.mockito:mockito-core:3.0.0"
    const val TEST_THREETENBP = "org.threeten:threetenbp:1.4.0"
    const val TEST_XERIAL_SQLITE = "org.xerial:sqlite-jdbc:3.28.0"
    const val TEST_ARCH_ROOM_TESTING = "androidx.room:room-testing:$ROOM_VERSION"
    const val TEST_DBTOOLS_ROOM_JDBC = "org.dbtools:dbtools-room-jdbc:$DBTOOLS_VERSION"
    const val TEST_KOTLIN_COROUTINES_TEST = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$COROUTINES_VERSION"
    const val TEST_MOCKITO_KOTLIN = "com.nhaarman.mockitokotlin2:mockito-kotlin:2.1.0"
}