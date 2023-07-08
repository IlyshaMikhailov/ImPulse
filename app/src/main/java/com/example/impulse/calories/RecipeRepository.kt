package com.example.impulse

import com.example.impulse.calories.Recipe

object RecipeRepository {
    val list:List<Recipe> = listOf(
        Recipe(
            id=1,
            name="Cheesecakes with raisins ",
            kkal = "162 kkal per 100 g.",
            bzhu = "Proteins - 14 g.\nFats - 5 g.\nCarbohydrates - 16 g.",
            image = "https://samors.ru/wp-content/uploads/2022/05/Syrniki-s-izjumom-na-kukuruznoj-muke.jpg",
            ingridients = "Cottage cheese 5 % – 400 g .\n" +
                    "Flour – 3 tbsp. l.\n" +
                    "Egg – 1 pc.\n" +
                    "Vanilla sugar – 8 g.\n" +
                    "Raisins – 2 tbsp. l.\n" +
                    "Sweetener – optional.",
            recipe = "Combine eggs, cottage cheese, vanilla sugar, flour and mix. For a homogeneous mass, you can beat it with a blender. Add the washed and dried raisins, mix well. We moisten our hands with water, form products, roll them in flour. Spread on a preheated frying pan, fry on low heat on both sides until ruddy, covered with a lid."
        ),
        Recipe(
            id = 2,
            name = "Squash lasagna with minced meat and cream",
            kkal = "118 kkal per 91 g.",
            bzhu = "Proteins - 8 g.\n" +
                    "Fats - 5 g.\n" +
                    "Carbohydrates - 4 g.",
            image = "https://samors.ru/wp-content/uploads/2023/04/kabachkovaya-lazanya-s-farshem-i-slivkami.jpg",
            ingridients = "Zucchini – 1 kg.\n" +
                    "Minced chicken – 800 g.\n" +
                    "Bulbs – 2 pcs.\n" +
                    "Carrots – 1-2 pcs.\n" +
                    "Tomato paste – 2 tbsp. l.\n" +
                    "Garlic – 3 slices.\n" +
                    "Salt, spices.\n" +
                    "Chicken eggs – 2 pcs.\n" +
                    "Cream 10 % – 200 g.\n" +
                    "Cheese – 100 g.",
            recipe = "1) Preheat the frying pan, add a little vegetable oil. Fry the chopped onion and garlic until lightly browned. Spread the grated carrots, fry for another 2 minutes.\n\n" +
                    "2) Add the minced chicken, fry until it brightens. Constantly mix to make the filling crumbly. Next, add salt, pepper mixture, dry garlic, ground coriander and tomato paste.\n\n" +
                    "3) Wash the zucchini, dry it, cut it lengthwise into plates no more than 5 mm thick. For the sauce, mix eggs, cream, a little salt and freshly ground pepper.\n\n" +
                    "4) We put a layer of zucchini on the bottom of the mold, distribute the minced meat on top. Next, zucchini and a little filling. Repeat the layers until the ingredients run out. Finish the casserole with a layer of zucchini, pour the remaining sauce, rub the cheese on top.\n\n" +
                    "5) Cover the mold with lasagna foil. Bake in a preheated 180 degree oven for about 40-45 minutes. 10 minutes before cooking, remove the foil so that the cheese is browned."
        ),Recipe(
            id =3 ,
            name = "Oatmeal bars with banana and dried fruits",
            kkal = "295 kkal per 100 g.",
            bzhu = "Proteins - 8 g.\n" +
                    "Fats - 10 g.\n" +
                    "Carbohydrates - 47 g.",
            image = "https://samors.ru/wp-content/uploads/2023/03/batonchiki-myusli-s-suhofruktami-i-shokoladom.jpg",
            ingridients = "Oat flakes – 150 g.\n" +
                    "Raisins, dried apricots, finks – 150 g.\n" +
                    "Sunflower seeds – 50 g.\n" +
                    "Bitter chocolate – 25 g.\n" +
                    "Applesauce – 100 g.\n" +
                    "Orange peel.",
            recipe = "Cut the dried fruits into small pieces. Bitter chocolate is cut into small cubes. To the oatmeal flakes of long cooking, add baby fruit puree without sugar, stir thoroughly. We mix seeds, dried fruits, chocolate and the zest of one orange. Spread the mass on a baking sheet covered with a non-stick mat. We distribute it evenly, tamp it down. Bake at a temperature of 170 degrees for about 20 minutes. Cut into bars of the desired size."
        ),Recipe(
            id = 1,
            name = "Egg muffins with chicken and vegetables",
            kkal = "105 kkal per 100 g.",
            bzhu = "Proteins - 12 g.\n" +
                    "Fats - 6 g.\n" +
                    "Carbohydrates - 3 g.",
            image = "https://samors.ru/wp-content/uploads/2023/03/yaichnye-maffiny-s-kuriczej-i-ovoshhami-2.jpg",
            ingridients = "Chicken eggs – 5 pcs.\n" +
                    "Natural yogurt – 60 g.\n" +
                    "cheese 9 % – 40 g.\n" +
                    "Tomatoes – 1 pc.\n" +
                    "Chicken fillet – 70 g.\n" +
                    "Bulgarian pepper – 1 pc.\n" +
                    "Salt, pepper.",
            recipe = "Finely chop the vegetables and boiled chicken fillet, distribute them into muffin molds. In a deep bowl, beat the eggs with salt, add yogurt and a little grated cheese. The omelet mixture is poured into molds for about three quarters of the volume. Put the muffins in the oven, bake at 180 degrees for 15-20 minutes."
        ),Recipe(
            id = 1,
            name = "Cottage cheese smoothie with berries and seeds",
            kkal = "86 kkal per 100 g.",
            bzhu = "Proteins - 10 g.\n" +
                    "Fats - 4 g.\n" +
                    "Carbohydrates - 4 g.",
            image = "https://samors.ru/wp-content/uploads/2023/03/smuzi-iz-tvoroga-s-yagodami-i-semenami.jpg",
            ingridients = "Cottage cheese 5 % – 180 g.\n" +
                    "Milk 2.5 % – 180 ml. \n" +
                    "Strawberries – 70 g. \n" +
                    "Flax seeds – 1 tsp.\n" +
                    "Sweetener – to taste.",
            recipe = "Combine all the products in a blender bowl, whisk until smooth. If desired, you can add oat flakes, nuts, seeds. Instead of milk, you can also use kefir, yogurt or plain water."
        ),Recipe(
            id = 1,
            name = "Cabbage-egg pancake with tuna",
            kkal = "89 kkal per 100 g.",
            bzhu = "Proteins - 8 g.\n" +
                    "Fats - 5 g.\n" +
                    "Carbohydrates - 3 g.",
            image = "https://samors.ru/wp-content/uploads/2023/03/kapustno-yaichnyj-blin-s-tunczom.jpg",
            ingridients = "Young cabbage – 100 g.\n" +
                    "Eggs – 2 pcs.\n" +
                    "Ghee oil – 3 g.\n" +
                    "Salt, pepper mixture.\n" +
                    "Canned tuna – 35 g.\n" +
                    "Mozzarella – 10 g.\n" +
                    "Dill – 2 twigs.",
            recipe = "Knead the tuna with a fork. Mix with grated cheese and chopped dill. Finely chop the young cabbage, put it on a preheated frying pan, cook for 2 minutes, stirring constantly. Beat the eggs with the addition of salt and pepper, pour the cabbage. We cook pancakes under a lid on a minimum heat. After 1-2 minutes, gently turn over, bake for another 30 seconds. We spread the tuna filling on one half of the pancake, cover the other half. Sprinkle with sesame seeds or herbs."
        ),Recipe(
            id = 4,
            name = "Fish stewed in tomato sauce",
            kkal = "60 kkal per 100 g.",
            bzhu = "Proteins - 10 g.\n" +
                    "Fats - 1 g.\n" +
                    "Carbohydrates - 2 g.",
            image = "https://samors.ru/wp-content/uploads/2019/03/Ryba-tushenaja-v-tomatnom-souse.jpg",
            ingridients = "Pollock fillet – 450 g .\n" +
                    "Carrots – 1 pc.\n" +
                    "Tomatoes – 200 g.\n" +
                    "Olive oil – 1 tsp.\n" +
                    "Fresh herbs – a bunch.\n" +
                    "Salt, spices.",
            recipe = "1) Fish fillet cut into pieces, not finely. A little salt, sprinkle with rosemary, dry Italian herbs.\n\n" +
                    "2) Grated carrots passeruem on a drop of olive oil.\n\n" +
                    "3) Add mashed tomatoes or tomato paste with water. We put a spoonful of low-fat sour cream.\n\n" +
                    "4) Simmer until the vegetables are soft, about 7-8 minutes, medium heat. We try for salt.\n\n" +
                    "5) We spread the pieces of fish. Cook under the lid for about 10 minutes. Sprinkle the finished dish with fresh herbs."
        ),Recipe(
            id = 4,
            name = "Frittata with vegetables and cheese",
            kkal = "122 kkal per 100 g.",
            bzhu = "Proteins - 8 g.\n" +
                    "Fats - 8 g.\n" +
                    "Carbohydrates - 3 g.",
            image = "https://samors.ru/wp-content/uploads/2019/03/Frittata-s-ovoshhami-i-brynzoj.jpg",
            ingridients = "Chicken egg – 6 pcs. \n" +
                    "Bulgarian pepper – 120 g. \n" +
                    "Tomatoes – 120 g. \n" +
                    "Broccoli – 120 g. \n" +
                    "Cheese – 150 g. \n" +
                    "Onion – 1 pc. \n" +
                    "Garlic – 2 cloves. \n" +
                    "Parsley – 1 bunch. \n" +
                    "Olive oil – ½ tbsp. l.\n" +
                    "Spices.",
            recipe = "1) Cut the cheese into cubes. We disassemble the broccoli cabbage into small inflorescences. Cherry tomatoes are cut in half. Chop parsley, garlic, onion, sweet pepper. \n\n" +
                    "2) Break the eggs into a deep bowl. Beat a little with a fork with a pinch of salt and ground pepper. \n\n" +
                    "3) In a preheated frying pan with oil, lightly fry the onion and garlic. Spread the rest of the vegetables, cook for 5 minutes. Add chopped greens. \n\n" +
                    "4) Pour half of the egg mixture. When the eggs are seized, we lay out the cheese, pour in the remaining filling. \n\n" +
                    "5) As soon as the frittata edges are gripped, we move the mold into the oven. Bake at 180 degrees for 15 minutes."
        ),Recipe(
            id = 4,
            name = "Turkey roll with spinach and nuts",
            kkal = "127 kkal per 100 g.",
            bzhu = "Proteins - 17 g.\n" +
                    "Fats - 7 g.\n" +
                    "Carbohydrates - 2 g.",
            image = "https://samors.ru/wp-content/uploads/2022/11/Rulet-iz-indejki-so-shpinatom-i-orehami-2.jpg",
            ingridients = "Turkey breast fillet – 800 g. \n" +
                    "Onion – 1 pc. \n" +
                    "Frozen spinach – 160 g. \n" +
                    "Hard cheese – 100 g. \n" +
                    "Walnuts – 50 g. \n" +
                    "Classic yogurt – 50 g. \n" +
                    "Ghee oil – 2 tsp.",
            recipe = "1) Cut the fillet into two layers about 1.5 cm thick. Each piece is covered with a bag or food wrap, carefully beat off from both sides. \n\n" +
                    "2) We transfer the beaten meat to a plate, salt, pepper on both sides. Generously spread thick natural yogurt on both layers. Leave to lie down for a few minutes. \n\n" +
                    "3) Fry the onion in a preheated frying pan with oil for 2 minutes. After adding the defrosted spinach, cook on low heat for another 2 minutes. Remove from the stove, salt, let cool. \n\n" +
                    "4) We spread half of the spinach mass on the meat layer, distribute it over one third of the surface. Sprinkle grated cheese and chopped walnuts on top. We roll the turkey with the filling into a roll, tightly tie it with a thread. In the same way, we twist the second roll. \n\n" +
                    "5) Preheat the pan, lubricate with oil, fry the rolls for 5-7 minutes. Then we wrap each roll tightly in two layers of foil, put a sprig of rosemary or thyme. Bake at 190 degrees for 40 minutes."
        ),Recipe(
            id =1 ,
            name = "Brizole with minced meat, vegetables and cheese",
            kkal = "106 kkal per 100 g.",
            bzhu = "Proteins - 11 g.\n" +
                    "Fats - 6 g.\n" +
                    "Carbohydrates - 2 g.",
            image = "https://samors.ru/wp-content/uploads/2022/10/Brizoli-s-farshem-ovoshhami-i-syrom.jpg",
            ingridients = "Minced chicken – 400 g.\n" +
                    "Chicken eggs – 6 pcs. \n" +
                    "Milk – 6 tbsp. l.\n" +
                    "Mozzarella – 60 g. \n" +
                    "Pickled cucumbers – 170 g. \n" +
                    "Tomatoes – 170 g. \n" +
                    "Onion – 1 pc. \n" +
                    "Garlic – 3 cloves. \n" +
                    "Salt, spices.",
            recipe = "1) Chop onion, garlic, add to minced meat. Do not forget to season the mixture with salt and pepper to taste. \n\n" +
                    "2) Pickled cucumbers and fresh tomatoes cut into cubes. \n\n" +
                    "3) In a deep bowl, whisk eggs with milk and a generous pinch of salt. A frying pan with a non-stick coating is wiped with vegetable oil. Fry the egg pancakes on both sides until browned. \n\n" +
                    "4) We spread minced meat on each pancake, we distribute it on half. Then we spread the filling of tomatoes and grated cheese. We wrap everything in a roll. We do the same with cucumber stuffing. \n\n" +
                    "5) Put the brizoli in a baking dish. Remove to a preheated 180 degree oven for 30-35 minutes."
        ),Recipe(
            id = 2,
            name = "Minced meat casserole with vegetables",
            kkal = "108 kkal per 100 g.",
            bzhu = "Proteins - 11 g.\n" +
                    "Fats - 5 g.\n" +
                    "Carbohydrates - 4 g.",
            image = "https://samors.ru/wp-content/uploads/2022/10/Mjasnaja-zapekanka-iz-farsha-s-ovoshhami-2.jpg",
            ingridients = "Minced meat – 500 g. \n" +
                    "Mexican mixture – 200 g. \n" +
                    "Broccoli – 200 g. \n" +
                    "Eggs – 3 pcs. \n" +
                    "Milk – 150 ml. \n" +
                    "Salt, spices.",
            recipe = "1) Mince salt, pepper and mold it into medium-sized meatballs. Transfer to a baking dish. \n\n" +
                    "2) Add frozen vegetables to the same place. I took a ready-made Mexican mixture, broccoli, cauliflower. \n\n" +
                    "3) Separately in a bowl combine eggs, milk and a pinch of salt. Mix the filling thoroughly with a whisk until smooth. \n\n" +
                    "4) Fill the meatballs with vegetables with prepared egg filling. \n\n" +
                    "5) We send the casserole into the oven, preheated to 200 degrees for 40-45 minutes. We take the finished dish out of the oven, sprinkle with fresh herbs or grated cheese."
        ),Recipe(
            id = 2,
            name = "Soup with rice and chicken meatballs",
            kkal = "35 kkal per 100 g.",
            bzhu = "Proteins - 3 g.\n" +
                    "Fats - 1 g.\n" +
                    "Carbohydrates - 3 g.",
            image = "https://samors.ru/wp-content/uploads/2022/10/Sup-s-risom-i-kurinymi-frikadelkami.jpg",
            ingridients = "Water – 2.5 l.\n" +
                    "Minced chicken – 450 g.\n" +
                    "Vegetable mixture – 300 g.\n" +
                    "Rice – 100 g.\n" +
                    "Garlic – 2 cloves.\n" +
                    "Salt, spices.",
            recipe = "1) Pour half a cup of rice into boiling water, cook after boiling for about 10 minutes. The water must be salted. \n\n" +
                    "2) Salt and pepper the minced chicken. Add finely chopped garlic and favorite spices to taste. \n\n" +
                    "3) We roll small meatballs out of the meat with our hands. We throw them into the soup, cook for 5-7 minutes. \n\n" +
                    "4) Then add any vegetable mixture. Cook for a couple more minutes and remove the pan from the heat. \n\n" +
                    "5) Before serving, add fresh chopped herbs to each serving. Served with rye croutons and sour cream."
        ),Recipe(
            id = 3 ,
            name = "Oatmeal cookies with nuts and raisins",
            kkal = " 257 kkal per 100 g.",
            bzhu = "Proteins - 10 g.\n" +
                    "Fats - 9 g.\n" +
                    "Carbohydrates - 34 g.",
            image = "https://samors.ru/wp-content/uploads/2022/04/Pechene-iz-ovsjanoj-muki-s-orehami-i-izjumom.jpg",
            ingridients = "Oat flour – 180 g. \n" +
                    "Baking powder – 1.5 tsp.\n" +
                    "Eggs – 2 pcs. \n" +
                    "Sweetener – 3 tbsp . l.\n" +
                    "Almonds – 30 g. \n" +
                    "Raisins – 40 g. \n" +
                    "Lemon zest.",
            recipe = "Beat the eggs with a sweetener until a thick foam forms. Mix the flour with baking powder and sift parts into the egg mass, knead with a spatula. Add lemon zest, chopped nuts and pre-soaked raisins to the finished dough. We cover the form with parchment paper, spread the dough, evenly distribute a thin layer. We put the mold in the oven for 20-25 minutes, 180 degrees. Then we take it out, immediately cut the cookies into portions."
        ),Recipe(
            id = 4,
            name = "Zucchini spaghetti with chicken and soy sauce",
            kkal = "43 kkal per 100 g.",
            bzhu = "Proteins - 6 g.\n" +
                    "Fats - 1 g.\n" +
                    "Carbohydrates - 3 g.",
            image = "https://samors.ru/wp-content/uploads/2021/03/Spagetti-iz-kabachkov.jpg",
            ingridients = "Zucchini – 3 pcs. \n" +
                    "Chicken fillet – 600 g. \n" +
                    "Garlic – 2 cloves. \n" +
                    "Soy sauce. \n" +
                    "Italian herbs.",
            recipe = "1) Three medium zucchini are washed, grated on a grater for Korean carrots along with the peel. Zucchini can also be cut without the use of a grater, but it will be much longer and more difficult. \n\n" +
                    "2) Chicken breast fillet cut into small pieces. Finely chop the garlic. \n\n" +
                    "3) Next, you need to fry the fillets and zucchini separately. We put two frying pans to warm up, add a drop of olive oil to each. \n\n" +
                    "4) Spread the squash noodles and chicken, fry, stirring occasionally. 3-4 minutes before the zucchini is ready, add garlic and spices. \n\n" +
                    "5) Put the finished spaghetti on a plate, add the chicken fillet. We complement the dish with a small amount of soy sauce and sesame seeds."
        ),Recipe(
            id = 2,
            name = "Carrot pizza with chicken breast and green peas",
            kkal = "95 kkal per 100 g.",
            bzhu = "Proteins - 9 g.\n" +
                    "Fats - 3 g.\n" +
                    "Carbohydrates - 7 g.",
            image = "https://samors.ru/wp-content/uploads/2021/02/Morkovnaja-picca-s-kurinoj-grudkoj.jpg",
            ingridients = "Carrots – 3 pcs.\n" +
                    "Garlic – 1 clove \n" +
                    "Egg – 1 pc. \n" +
                    "Flour – 1 tbsp. l.\n" +
                    "Adyghe cheese – 30 g. \n" +
                    "Tomatoes in a / c – 4 pcs. \n" +
                    "Onion – ¼ pcs. \n" +
                    "Green peas – 2 tbsp. l.\n" +
                    "Adyghe cheese – 70 g.\n" +
                    "Spinach – 50 g. \n" +
                    "Chicken breast – 110 g.",
            recipe = "1) Using a food processor, chop carrots, garlic. After we add the coarse flour, cheese, egg and again we interrupt everything. \n\n" +
                    "2) We form a thin round base on a baking sheet with our hands, for convenience, you can use a ring from a detachable baking dish. We send it to the oven, bake at a temperature of 200 degrees for 10 minutes. \n\n" +
                    "3) For the sauce, mash tomatoes with a fork in their own juice with the addition of Italian herbs. For the filling, finely chop the onion, chop the boiled chicken breast. \n\n" +
                    "4) Put tomato sauce on the base of carrot dough, and then the filling of chicken breast, green peas and onions. Sprinkle grated cheese on top. \n\n" +
                    "5) Put the pizza in the oven for another 5 minutes. The finished dish is decorated with lettuce leaves and spinach."
        ),Recipe(
            id = 3,
            name = "Sweets with almonds, peanuts and plums",
            kkal = "220 kkal per 100 g.",
            bzhu = "Proteins - 10 g.\n" +
                    "Fats - 13 g.\n" +
                    "Carbohydrates - 28 g.",
            image = "https://samors.ru/wp-content/uploads/2020/10/Konfety-s-mindalem-arahisom-i-slivoj.jpg",
            ingridients = "Water – 20 ml. \n" +
                    "Plum – 1 tbsp. \n" +
                    "Almonds – 1 tbsp. \n" +
                    "Peanuts – 1 tbsp. \n" +
                    "Coconut chips.",
            recipe = "Pour water into the blender bowl, load dried plums, almonds and peanuts. Grind to a homogeneous state.\n\n" +
                    "Spread a tablespoon of the resulting mass on coconut chips. We roll and form candies. We put the sweets in the freezer for a couple of hours, there they will harden, and it will be more convenient to eat them."
        ),Recipe(
            id = 1  ,
            name = "Cottage cheese and cheese tortilla with herbs",
            kkal = "137 kkal per 100 g.",
            bzhu = "Proteins - 14 g.\n" +
                    "Fats - 5 g.\n" +
                    "Carbohydrates - 6 g.",
            image = "https://samors.ru/wp-content/uploads/2023/03/lepeshka-iz-syra-i-tvoroga-s-zelenyu.jpg",
            ingridients = "Chicken egg – 1 pc. \n" +
                    "Kefir – 40 g. \n" +
                    "Cheese 9 % – 30 g.\n" +
                    "Cottage cheese 5 % – 100 g . \n" +
                    "Wholegrain flour – 1-2 tbsp. l.\n" +
                    "Dill, parsley – 25 g. \n" +
                    "Salt, spices.",
            recipe = "Mix the egg, kefir, and a pinch of salt. Add cottage cheese, any wholegrain flour. Mix well, mix grated cheese and chopped greens. Heat the frying pan, lubricate with a drop of vegetable oil, distribute the curd mass in a thin layer. It is important that the thickness of the cake was no more than two centimeters. Fry khachapuri under the lid on moderate heat on both sides until ruddy."
        ),Recipe(
            id = 1,
            name = "Mini pancakes on sour cream with cocoa",
            kkal = "158  kkal per 100 g.",
            bzhu = "Proteins - 7 g.\n" +
                    "Fats - 6 g.\n" +
                    "Carbohydrates - 18 g.",
            image = "https://samors.ru/wp-content/uploads/2023/02/shokoladnye-mini-pankejki-na-smetane.jpg",
            ingridients = "Rice flour – 80 g. \n" +
                    "Sour cream 10 % – 100 g. \n" +
                    "Chicken eggs – 2 pcs. \n" +
                    "Baking powder – 1 tsp.\n" +
                    "Cocoa powder - 2 tsp.\n" +
                    "Fitparade – 2 sachets.",
            recipe = "Mix the necessary ingredients together until smooth. Bake on a hot non-stick frying pan without oil, spreading the dough with a teaspoon. Served with date syrup, bitter chocolate and fresh berries."
        ),Recipe(
            id = 2,
            name = "Chicken fillet meatballs with mushrooms and sauce",
            kkal = "89 kkal per 100 g.",
            bzhu = "Proteins - 12 g.\n" +
                    "Fats - 12 g.\n" +
                    "Carbohydrates - 3 g.",
            image = "https://samors.ru/wp-content/uploads/2023/02/tefteli-iz-kurinogo-file-s-gribami-i-sousom.jpg",
            ingridients = "Chicken fillet – 550 g. \n" +
                    "Onion – 1 pc. \n" +
                    "Champignons – 200 g. \n" +
                    "Chicken egg – 1 pc. \n" +
                    "Oat bran – 1 tbsp\n" +
                    "Curry – ½ tsp\n" +
                    "Salt, pepper. \n" +
                    "Vegetable oil – 1 tbsp. l.\n" +
                    "Onion – 1 pc. \n" +
                    "Champignons – 250 g. \n" +
                    "Sour cream 15% – 3 tbsp\n" +
                    "Curry – ½ tsp\n" +
                    "Water – ½ cup.",
            recipe = "1) Chicken breast fillet is crushed in a blender or with a meat grinder. We do the same with one onion and half of the mushrooms. \n\n" +
                    "2) Combine the chopped products, add egg, curry seasoning, salt, freshly ground pepper, bran. By the way, you can replace the bran with ground oat flakes. Stir, let it stand for a while. \n\n" +
                    "3) For frying, cut the remaining mushrooms and onions. Grease the frying pan with oil, pass the onion, then put the mushrooms. Simmer under the lid. \n\n" +
                    "4) When the mushrooms become soft and let the juice, add sour cream, curry seasoning, hot water, salt to taste. Bring to a boil, turn off the fire, let it cool down. \n\n" +
                    "5) Roll medium-sized meat balls with wet hands. We put it in a saucepan, pour mushroom sauce, put it on the stove. Simmer under the lid for 20 minutes, medium heat. Periodically pour the sauce over the meatballs. We give the finished dish a little brew under the lid."
        ),Recipe(
            id = 4,
            name = "Salad with beans, vegetables and chicken breast",
            kkal = "119 kkal per 100 g.",
            bzhu = "Proteins - 14 g.\n" +
                    "Fats - 2 g.\n" +
                    "Carbohydrates - 12 g.",
            image = "https://samors.ru/wp-content/uploads/2023/01/salat-s-fasolyu-ovoshhami-i-kurinoj-grudkoj.jpg",
            ingridients = "Chicken fillet – 300 g. \n" +
                    "Red beans – 200 g. \n" +
                    "Tomatoes – 2 pcs. \n" +
                    "Cucumbers – 2 pcs. \n" +
                    "Green onion – a bunch. \n" +
                    "Parsley – a bunch. \n" +
                    "Yogurt 2 % – 3 tbsp. l.",
            recipe = "Baked chicken breast fillet cut into cubes, we do the same with cucumbers. Remove the middle with seeds from tomatoes, chop the pulp. We move the slicing into a bowl, add canned beans and chopped greens. Flavored with unsweetened yogurt, salt to taste."
        ),Recipe(
            id = 2,
            name = "Vegetable salad with beans and celery",
            kkal = "84 kkal per 100 g.",
            bzhu = "Proteins - 3 g.\n" +
                    "Fats - 3 g.\n" +
                    "Carbohydrates - 11 g.",
            image = "https://samors.ru/wp-content/uploads/2023/01/ovoshhnoj-salat-s-fasolyu-i-seldereem.jpg",
            ingridients = "Red beans – 400 g. \n" +
                    "Canned corn – 400 g. \n" +
                    "Sweet pepper – 1 pc. \n" +
                    "Boiled carrots – 2 pcs. \n" +
                    "Celery – 3 stalks. \n" +
                    "Parsley – 5-6 sprigs. \n" +
                    "Olive oil – 3 tbsp. l.\n" +
                    "Wine vinegar – 1 tbsp. l.\n" +
                    "Mustard – 1 tsp.\n" +
                    "Salt, pepper mixture.",
            recipe = "We cut the vegetables into pieces, send them to a dish with corn and beans. Mix mustard with vinegar, oil, salt and pepper. Stir until an emulsion is formed. Pour the sauce into the salad, gently stir."
        ),Recipe(
            id = 3,
            name = "Carrot cake on applesauce",
            kkal = "125 kkal per 100 g.",
            bzhu = "Proteins - 6 g.\n" +
                    "Fats - 4 g.\n" +
                    "Carbohydrates - 16 g.",
            image = "https://samors.ru/wp-content/uploads/2023/01/dieticheskij-morkovnyj-pirog-na-yablochnom-pyure.jpg",
            ingridients = "Applesauce – 220 g. \n" +
                    "Chicken eggs – 4 pcs. \n" +
                    "Carrots – 200 g. \n" +
                    "Wholegrain flour – 120 g. \n" +
                    "Baking powder – 5. \n" +
                    "Sweetener, spices.",
            recipe = "1) Peeled carrots are grated on a fine grater or crushed with a blender. \n\n" +
                    "2) We drive eggs into a working bowl. Add baby fruit puree without sugar, mix thoroughly with a whisk. \n\n" +
                    "3) Mix whole grain flour with baking powder. Add grated carrots, favorite spices. Knead a homogeneous dough. \n\n" +
                    "4) Lubricate the silicone mold with vegetable oil. We shift the dough, distribute it. \n\n" +
                    "5) Bake the pie in a preheated 180 degree oven for 35 minutes. Readiness must be checked with a toothpick. After cooling, remove the mold."
        ),Recipe(
            id = 2,
            name = "Chicken meatballs with rice in sour cream sauce",
            kkal = "104 kkal per 100 g.",
            bzhu = "Proteins - 10 g.\n" +
                    "Fats - 5 g.\n" +
                    "Carbohydrates - 5 g.",
            image = "https://samors.ru/wp-content/uploads/2023/02/kurinye-tefteli-s-risom-v-smetannom-souse.jpg",
            ingridients = "Minced chicken – 500 g. \n" +
                    "Onion – 1 pc. \n" +
                    "Boiled rice – ½ tbsp . \n" +
                    "Garlic – 1 clove.\n" +
                    "Chicken egg – 1 pc. \n" +
                    "Salt – 1 tsp.\n" +
                    "Chicken broth – 400 ml. \n" +
                    "Wholegrain flour – 2 tbsp. l.\n" +
                    "Sour cream 15% – 1 tbsp. l.\n" +
                    "Paprika – ½ tsp.\n" +
                    "Salt, pepper. \n" +
                    "Dill, parsley – 1 bunch.",
            recipe = "1) Mince salt, pepper, squeeze out a clove of garlic through a press. Grate onions on a grater (it will be juicier this way). Add the egg, boiled rice, carefully knead the minced meat. \n\n" +
                    "2) We form meat balls, for convenience, you can use an ice cream spoon. Roll a little in flour. \n\n" +
                    "3) Spread on a preheated frying pan, greased with a drop of oil. Fry for 3-4 minutes on one side. Then turn over, cover with a lid, turn down the heat, simmer for 5-7 minutes. \n\n" +
                    "4) Meanwhile, prepare the sour cream sauce. Combine the ingredients for the sauce, mix well with a whisk so that all the lumps dissolve. \n\n" +
                    "5) Pour the sauce over the meatballs, bring to a boil, sprinkle with chopped herbs. Simmer under the lid for 5 minutes. Closer to the end of the product can be turned over so that they are soaked in sauce from all sides."
        )
    )
}