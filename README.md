# Navigation Fragment Demo
 

## Summary
- **Summary:**  Android Navigation Fragment Demo 
- **Created Date:** 22 July 2023
- **Last modified:** 22 July 2023 

## Feature
- Take input as Exam Score
- Calculate on Next Fragment
- Use Navigation



### Technology Used
- Kotlin
- Navigation Graph
- Constraint Layout
- Input Layout
- Navigation Action with Args

### Backend Details

- **Webservice** : offline


#### Example Model


```
{
        "id": 1234,
        "courseName": "Course Title",
        "midtermExamScore": 60,
        "finalExamScore": 70
    }

```

```
data class Exam(
    val courseName: String,
    val midtermExamScore: Double,
    val finalExamScore: Double,
)
```

- **Library Imports**
  
```


    // Navigation & Layout
    implementation 'androidx.appcompat:appcompat:1.4.1'
    //implementation 'com.google.android.material:material:1.5.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.3'
    //implementation 'androidx.legacy:legacy-support-v4:1.0.0'
    implementation 'androidx.navigation:navigation-fragment-ktx:2.6.0'
    implementation 'androidx.navigation:navigation-ui-ktx:2.6.0'
```

- **build.gradle (app)**
```
plugins {
    ...
    id 'androidx.navigation.safeargs'
    id 'kotlin-parcelize'
}
```

- **build.gradle (module)**
```
buildscript {
    //repositories {
    //    google()
    //    mavenCentral()
    //}
    dependencies {

        //SafeArgs
        classpath 'androidx.navigation:navigation-safe-args-gradle-plugin:2.6.0'
    }
}
```

#### Project Structure



<img src="https://github.com/ganeshroman/Jetpack_Compose_List/blob/6ff496111737682edba9a7cf406a71282e020673/Screenshot%202023-07-22%20at%201.41.39%20PM.png" width="250" height="450">


#### Screenshots


<img src="https://github.com/ganeshroman/Navigation_Fragment_Demo/blob/5d6ba7448cef4acb8d4ec09b2929ddeb9d8eb418/Screenshot_20230722_204548.png" width="250" height="450">

<img src="https://github.com/ganeshroman/Navigation_Fragment_Demo/blob/5d6ba7448cef4acb8d4ec09b2929ddeb9d8eb418/Screenshot_20230722_204510.png" width="250" height="450">










