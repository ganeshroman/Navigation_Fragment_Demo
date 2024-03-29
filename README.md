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



<img src="https://github.com/ganeshroman/Navigation_Fragment_Demo/blob/cd4d9fd796b8bd15d6fe17ba727fb05c47788ea4/Screenshot%202023-07-22%20at%208.44.07%20PM.png" width="250" height="450">


#### Screenshots


<img src="https://github.com/ganeshroman/Navigation_Fragment_Demo/blob/a088b93d0f53ccde1fa5c6a6cd5dd4d409b285a2/Screenshot_20230722_205225.png" width="250" height="450">

<img src="https://github.com/ganeshroman/Navigation_Fragment_Demo/blob/a088b93d0f53ccde1fa5c6a6cd5dd4d409b285a2/Screenshot_20230722_205244.png" width="250" height="450">










