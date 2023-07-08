package com.example.impulse

object EatingsRepository {
    val list: List<Eatings> = listOf(
        Eatings(
            id = 1,
            title = "Breakfast",
            desc = "The breakfast is extremely necessary for our brain for better concentration and memorization of information. It also stimulates metabolic processes that charge a person with strength and energy for the whole day"
        ),
        Eatings(
            id = 2,
            title = "Lunch",
            desc = "Balanced intake of nutrients facilitates their assimilation by the body, normalizes metabolic processes and helps to maintain a healthy weight.When skipping lunch, it is very common to have breakdowns on sweets in the evening, overeating and late dinners."
        ),
        Eatings(
            id = 3,
            title = "Snack",
            desc = "Snacking helps the body maintain a constant glucose level, which reduces the uncontrollable feeling of hunger and allows you not to overeat in the main meals."
        ),
        Eatings(
            id=4,
            title = "Dinner",
            desc = "When food is absorbed by the body, serotonin is produced, which causes a feeling of pleasure and happiness.Also, a proper dinner reduces blood sugar and \"bad\" cholesterol \n" +
                    "Sleep better if you are not hungry"
        )
    )
}