<h1 align="center">
  Reciply App
</h1>

<p align="center">Taste Made Easy!</p>

## About the project

<p style="color: red;">
  Reciply is a mobile application developed with Kotlin, designed to provide users with a wide selection of recipes and enhance their cooking experience. 
  The app allows users to explore a variety of recipes, discover new dishes, and access detailed information about each recipe.
  With a simple and user-friendly interface, users can browse through an extensive collection of recipes. 
  To personalize their experience, users can create an account and sign in to the app. By doing so, they gain access to additional features, such as the ability to save their favorite recipes for quick and easy access later.
</p>

To see the **api**, click here: https://www.themealdb.com/api.php </br>

## Technologies

Technologies and tools that I used to develop this mobile application

- Kotlin
- MVVM structure
- Repository Design Pattern
- Room Database
- Retrofit

## Demo

https://github.com/MonaAdel2/Reciply/assets/96449268/aab79658-8b7e-460b-86e1-3d765f5d1922


## Getting started

### Requirements

- Have this application's [API](https://www.themealdb.com/api.php) running

**Clone the project and access the folders**

```bash
$ git clone https://github.com/MonaAdel2/Reciply
```

**Dependencies**
# Install the following dependencies
Retrofit API:
```bash
    implementation "com.google.code.gson:gson:2.10.1"
    implementation "com.squareup.retrofit2:retrofit:2.9.0"
    implementation "com.squareup.retrofit2:converter-gson:2.9.0"

    implementation(platform("com.squareup.okhttp3:okhttp-bom:4.10.0"))
    implementation("com.squareup.okhttp3:okhttp")
    implementation("com.squareup.okhttp3:logging-interceptor")
```
Image Loader Library:
```bash
    implementation 'com.github.bumptech.glide:glide:4.12.0'
```
Navigation graph:
```bash
    implementation "androidx.navigation:navigation-fragment-ktx:$nav_version"
    implementation "androidx.navigation:navigation-ui-ktx:$nav_version"
```
Room Database:
```bash
    implementation "androidx.room:room-runtime:$room_version"
    annotationProcessor "androidx.room:room-compiler:$room_version"
    implementation "androidx.room:room-ktx:$room_version"
    kapt "androidx.room:room-compiler:$room_version"
```
YouTube Player library:
```bash
    implementation 'com.pierfrancescosoffritti.androidyoutubeplayer:core:12.1.0'
```
Read more TextView:
```bash
    implementation 'com.borjabravo:readmoretextview:2.1.0'
```

Bottom navigation bar:
```bash
    implementation 'com.etebarian:meow-bottom-navigation:1.2.0'
```
Shimmer:
```bash
    implementation 'com.facebook.shimmer:shimmer:0.1.0@aar'
```
