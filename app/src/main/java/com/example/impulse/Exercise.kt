package com.example.impulse

import android.os.Parcelable

data class Exercise (
    val id: Int,
    val bodyPart: String,
    val title: String,
    var isFavourites: Boolean,
    val description: String,
    val gif: Int,
    val image: String,
    val url: String,
)