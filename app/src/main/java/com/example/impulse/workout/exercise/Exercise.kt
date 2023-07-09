package com.example.impulse.workout.exercise

data class Exercise (
    val id: Int,
    val bodyPart: String,
    val title: String,
    var isFavourites: Boolean,
    val description: String,
    val image: String,
    val gif: String,
)