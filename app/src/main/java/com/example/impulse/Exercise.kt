package com.example.impulse

data class Exercise (
    val id: Int,
    val bodyPart: String,
    val title: String,
    var isFavourites: Boolean,
    val description: String,
    val gifka: Int,
)