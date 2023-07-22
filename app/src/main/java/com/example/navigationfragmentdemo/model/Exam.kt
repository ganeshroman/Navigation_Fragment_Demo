package com.example.navigationfragmentdemo.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Exam(
    val courseName: String,
    val midtermExamScore: Double,
    val finalExamScore: Double,
) : Parcelable