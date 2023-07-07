package com.example.impulse

import com.example.impulse.Exercise

object ExerciseRepository {
    val list: List<Exercise> = listOf(
        Exercise(1, "arm", "Standard push up", false, "Classic push up", R.raw.manpushups),
        Exercise(2, "arm", "Reversed pull up", false, "Chair pull up", R.raw.reversedpullupsonthechair),
        Exercise(4, "press", "Scruchivaniya", false, "Scruchivaniya", R.raw.scruchivaniya),
        Exercise(5, "press", "Russian twists", false, "Russian twists", R.raw.russiantwists),
        Exercise(6, "press", "Plank", false, "Plank", R.raw.plank),
        Exercise(7, "press", "Scosors", false, "Scisors", R.raw.scisors),
        Exercise(8, "press", "Bicycle", false, "bicycle", R.raw.bicycle),
        Exercise(9, "press", "Alpinist", false, "Alpinist", R.raw.alpinist),
        Exercise(10, "press", "Bring sally up", false, "Bring sally up", R.raw.bringsallyup),
        Exercise(11, "leg", "Sitdown", false, "Classic sit down", R.raw.sitdowns),
        Exercise(12, "leg", "Caviar", false, "Caviar upgrade", R.raw.ikra1),
        Exercise(13, "back", "Pull up", false, "Classic pull up", R.raw.pullups),
        Exercise(14, "back", "Back bull up", false, "Classic", R.raw.backpullups),
        Exercise(15, "arm", "Standard pull up", false, "Classic", R.raw.pullups),

        )
}



