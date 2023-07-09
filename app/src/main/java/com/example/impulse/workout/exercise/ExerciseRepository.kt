package com.example.impulse.workout.exercise

object ExerciseRepository {
    fun updateFavorites(id: Int, isFavorite: Boolean) {
        list.find { it.id == id }?.isFavourites = !isFavorite
    }

    fun findAllByIds(listIds: List<Int>): List<Exercise> {
        for (exercise in list) {
            if (exercise.id in listIds)
                exercise.isFavourites = true
        }
        return list.filter { it.id in listIds }
    }

    fun findAllFavourites(): List<Exercise> {
        return list.filter {
            it.isFavourites
        }
    }

    fun findAllToString(str: String): List<Exercise> {
        return list.filter {
            it.bodyPart == str
        }
    }

    val list = listOf(
        Exercise(
            1,
            "Hands",
            "Standard push up",
            false,
            "Get into push-up positions, and do the best you can, if it's still difficult, start with smaller numbers.\n" +
                    "4 sets with a 4 minute break in between",

            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTfzEMCJqxaReBlIU24hN7KYaVLICsfkUMKrg&usqp=CAU",
            "https://media1.giphy.com/media/u0bxtw7oGJX8zIBPCD/giphy.gif?cid=ecf05e47t7k42nvomett88g4k4uud08g6vbtmfmk0srlzzqw&ep=v1_gifs_search&rid=giphy.gif&ct=g"
        ),
        Exercise(
            15,
            "Hands",
            "Biceps",
            false,
            "Grasp the horizontal bar with a wide grip, placing your palms with a regular grip on top.\n" +
                    "Exhale: bending your elbows, pull your chin to the bar, bringing your shoulder blades together at the top. Keep your legs bent at the knee.\n" +
                    "Inhale: slowly lower yourself without extending your elbows to the end, \n" +
                    "Do 3-4 sets depending on your ability and rest for 4 minutes",

            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR6--qlYK68OoSkkipH1vya5PsdYENDdsPqMg&usqp=CAU",
            "https://media1.giphy.com/media/2ALcpIRjQFi21eezSI/giphy.gif?cid=ecf05e47yocsnymj6owk55w8ustial3ms4ojwenr12u19vzv&ep=v1_gifs_search&rid=giphy.gif&ct=g"
        ),
        Exercise(
            2,
            "Hands",
            "Reversed pull up",
            false,
            "In a position with your back to a chair, rest your hands on the front of the stud while pushing your hips and legs.\n" +
                    "Keeping your back close to the chair, bend your elbows to a 90 degree angle.\n" +
                    "4 sets of 13 reps, rest between sets 3.5 minutes",

            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSXxR7weASmpON51SN_Qw9StAPpDhqQ-R88Nw&usqp=CAU",
            "https://media4.giphy.com/media/jTs6TRPQAlHvtV044Y/giphy.gif?cid=ecf05e47t7k42nvomett88g4k4uud08g6vbtmfmk0srlzzqw&ep=v1_gifs_search&rid=giphy.gif&ct=g"
        ),
        Exercise(
            4,
            "Press",
            "Twists",
            false,
            "Lie on your back, bend your knees and put your hands behind your head, as in the video, slightly raising the body, bringing the ribs and pelvis together.Each set of 15 repetitions, total approaches should be 4\n" +
                    "rest between sets should be 2 to 3 minutes.",

            "https://www.mentoday.ru/upload/img_cache/a78/a78c6b22e05b8bad1038929d0f2aa717_ce_1080x719x0x52_cropped_666x444.jpg",
            "https://assets.gq.ru/photos/5d9f40b43a54c0000840d1c6/4:3/w_285,h_213,c_limit/giphy.gif"
        ),
        Exercise(
            19,
            "Chest",
            "Chest",
            false,
            "Get into push-up positions, and do the best you can, if it's still difficult, start with smaller numbers.\n" +
                    "4 sets with a 4 minute break in between",
            "https://your-revolution1905.ru/wp-content/uploads/2019/08/otzhimaniya-4-min.jpg",
            "https://cdn.lifehacker.ru/wp-content/uploads/2017/01/ezgif.com-02f99f58dd_1484735298.gif"
        ),
        Exercise(
            5,
            "Press",
            "Russian twists",
            false,
            "Sit on the floor, stretch your legs forward and bend your knees. Raise your legs slightly, tilt your body back.\n" +
                    "Put your hands together in front of your chest and turn your body from side to side without moving your pelvis.4 sets of 2 reps. Rest 2 to 3 minutes",

            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTXMTZ5KaAQkj7zC2RxPjbp2jkDvqem39EAGg&usqp=CAU",
            "https://avalon.fabiosacdn.com/image/8595067f-1e07-401d-9df3-485c3134306e.gif"
        ),
        Exercise(
            6,
            "Press",
            "Plank",
            false,
            "Hold the position of the emphasis lying, only on the elbows and on the toes. Straighten your back and hold this position for as long as possible\n" +
                    "2 max sets to keep you in denial until the very end",

            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQlXmYJW9j8sojZNgbz7LorRgdwhFXgb5M9kg&usqp=CAU",
            "https://i.gifer.com/origin/b7/b7566b44f91a69b5d0e93775b481febc.gif"
        ),
        Exercise(
            7,
            "Press",
            "Scissors",
            false,
            "Lie on your back, put your head on the floor. Alternately raise your right " +
                    "and left legs without bending at the knees and without lowering your legs to the floor.\n" +
                    "4 sets of 15 reps",

            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSd--0UfdhzXO4nkz5a-fy800KjC2g7VN7ihw&usqp=CAU",
            "https://avalon.fabiosacdn.com/image/56674407-10ea-4e9a-9571-13fd6236696d.gif"
        ),
        Exercise(
            8,
            "Press",
            "Bicycle",
            false,
            "Lie on your back, put your hands under your head, raise each leg in turn to " +
                    "your head and point the opposite elbow in its direction.\n" +
                    "4 sets of 20 reps rest between sets of 2 to 3 minutes",

            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcREAXCwpIDruU0oHJq0nIYP4pU-nUFrao2ACQ&usqp=CAU",
            "https://media2.giphy.com/media/cM8tzmeTY0SYMz6VGj/giphy.gif"
        ),
        Exercise(
            9,
            "Press",
            "Alpinist",
            false,
            "Take an emphasis lying down. Pull your right knee to your chest, jump out " +
                    "and change legs in the air - left forward, right back.\n" +
                    " 4 sets of 16 reps, rest between sets 2 to 3 minutes",

            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS_yiaFTn-5gBMnfn0VtpAkPK8ZSY8RKds3tw&usqp=CAU",
            "https://media2.giphy.com/media/v1.Y2lkPTc5MGI3NjExb2JxMWo2OHMzNjN4bXA3dDNyZWpqcmQ0cDZna250dnI5eDM0YWFvciZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/iD7UrloaBlLB3ygIha/giphy.gif"
        ),
        Exercise(
            10,
            "Press",
            "Bring sally up",
            false,
            "Get into a plank position, and go to a push-up position and back in a plank position\n" +
                    "2 sets of 2 minutes, rest between sets of 4 minutes",

            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSd8NYqNfkbaI_wZqNzLTJ1vlBpvsU9WqI8IQ&usqp=CAU",
            "https://media2.giphy.com/media/v1.Y2lkPTc5MGI3NjExdnVoMGFha3YyaGZ3cTFob3c1NGVwMnE2dXpxcThkemtsODBtaHUxbSZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/7zuAQ6ebll6maa2rBF/giphy.gif"
        ),
        Exercise(
            11,
            "Legs",
            "Sitdown",
            false,
            "Feet shoulder-width apart, socks slightly apart, back straight, look forward,\n" +
                    "bending the legs at the knees, lower the pelvis down to a position where the " +
                    "thighs are parallel to the floor, while the position of the body does not change,\n" +
                    "unbend the legs and return to the starting position,\n" +
                    "hands can help keep the balance, being in front of the chest.\n" +
                    "3 sets of 15 reps, rest between sets of 3 minutes",

            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTK24_fcmXS8ZSKxzjoXEduNLXG5_GyMzYtBQ&usqp=CAU",
            "https://wpstatic.gymbeam.com/blog/wp-content/uploads/mageblog/1f5dddd2a2a1b1b350de5b6dcae07807.gif"
        ),
        Exercise(
            12,
            "Legs",
            "Caviar",
            false,
            "Take dumbbells in your hands and straighten your back. Rise on your toes as" +
                    " you exhale, and as you inhale, lower your entire foot. If desired, place your socks on a plate or other support to make the workout more difficult.\n" +
                    "4 sets of 20 reps, rest 2-3 minutes",

            "https://www.futurefit.co.uk/wp-content/uploads/2019/08/shutterstock_1363264151-1500x1039.jpg",
            "https://media3.giphy.com/media/Y34H7RtoYT6MDTDMwd/giphy.gif"
        ),
        Exercise(
            13,
            "Back",
            "Pull up",
            false,
            "Jump up and grab the bar with a wide grip.\n" +
                    "Hang on the crossbar.\n" +
                    "Take a deep breath and, holding your breath, tighten your lats and pull " +
                    "yourself up. During pull-ups, the elbows should always remain in the same place.\n" +
                    "Pull yourself up until your chin is level with or slightly above the bar.\n" +
                    "Do 3-4 sets depending on your ability and rest for 4 minutes",

            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS2npiX20Vptj1OV8luBk1mr1z90gqYtmjuTg&usqp=CAU",
            "https://media1.giphy.com/media/j5VrvBfbV332AOow1B/giphy.gif?cid=ecf05e47yocsnymj6owk55w8ustial3ms4ojwenr12u19vzv&ep=v1_gifs_search&rid=giphy.gif&ct=g"
        ),
        Exercise(
            14,
            "Back",
            "Back pull up",
            false,
            "Grab the crossbar.\n" +
                    "As you exhale, start moving up. As you rise, try to reduce the shoulder" +
                    " blades so that it is the back muscles that are included in the work, and not the arms. Keep pulling up until there are a few inches between the back of your head and the bar.\n" +
                    "Slowly lower yourself down.\n" +
                    "Do 3 sets depending on your capabilities, rest for 4 minutes",

            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ9pNX-axPYXsWmLTaSL8zewLL-cAkBKE792g&usqp=CAU",
            "https://cross.expert/wp-content/uploads/2017/08/Podtyagivaniya-za-golovu-1.gif"
        ),
        Exercise(
            16,
            "Hands",
            "Hang on a bar",
            false,
            "Jump up and grab the bar with a wide grip.\n" +
                    "Hang on the crossbar.\n" +
                    "Take a deep breath and, holding your breath, hang on the bar as long as you can.\n" +
                    "Do the approach for as long as you can.",
            "https://gb-fitness.od.ua/wp-content/uploads/2018/06/myshtsy-ruk.jpg",
            "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2021/01/Two-handed-hang-for-time.gif?resize=600%2C646&ssl=1",
        ),
        Exercise(
            3,
            "Legs",
            "Fitness Jumping",
            false,
            "Take a standing position, and alternately raise your knees to your chest, depicting a run.\n" +
                    "4 sets of 1 minute",
            "https://img.championat.com/s/735x490/news/big/s/c/kak-nakachat-nogi-na-ulice-bez-trenazhyorov_1655802748774078661.jpg",
            "https://media2.giphy.com/media/62aGqZoUJYtPsl0Hb0/giphy.gif?cid=ecf05e47jrttgd9n35a5wz2funvulfkpkh5gkfkgqgta5b07&ep=v1_gifs_search&rid=giphy.gif&ct=g"
        ),
        Exercise(
            17,
            "Legs",
            "Lunges",
            false,
            "To perform a leg lunge exercise, start by standing with your feet hip-width apart. " +
                    "Take a step forward with one leg, keeping your knee directly above your ankle. " +
                    "Lower your body by bending both knees until your back knee is just above the ground. " +
                    "Push back up through your front heel to the starting position. " +
                    "Repeat with the other leg. Aim for 2 to 3 sets of 8 to 12 repetitions per leg. " +
                    "Rest for about 30 seconds to 1 minute between sets to allow for recovery.",
            "https://www.mentoday.ru/upload/img_cache/b8c/b8c2dc8084e332d92cfcf1cf69f0b1a3_ce_1579x1052x270x0_cropped_666x444.jpg",
            "https://giphy.com/gifs/8fit-man-1ncuQASTajJ0lx6Nix"
        ),
        Exercise(
            18,
            "Legs",
            "Leg raise",
            false,
            "Lie on your back with knees bent and feet flat on the floor. Engage your core " +
                    "and press your heels into the floor to lift your hips off the ground. " +
                    "Keep your upper body relaxed and back straight as you raise your hips until your " +
                    "body forms a straight line. Squeeze your glutes at the top and hold briefly. " +
                    "Aim for 10-12 repetitions and 2-3 sets, gradually increasing as you progress." +
                    "Focus on maintaining proper form and listening to your body's limits to prevent overexertion.",
            "https://avatars.dzeninfra.ru/get-zen_doc/5192222/pub_635d5b5f43ae4a7daf9f22dd_635d843b25146416da2db173/scale_1200",
            "https://giphy.com/gifs/8fit-fitness-exercise-glute-bridge-SJWtWnRFsTiNVSECVP"
        ),
        Exercise(
            20,
            "Hands",
            "Dip",
            false,
            "Start by gripping the parallel bars with your hands shoulder-width apart. " +
                    "Keep your arms straight and your body upright. Lower your body by bending your " +
                    "elbows until your upper arms are parallel to the ground. Push through your palms to" +
                    " extend your elbows and raise your body back up to the starting position. Aim for a" +
                    " controlled and smooth movement throughout. Adjust the number of repetitions and sets" +
                    " based on your fitness level and goals. Remember to maintain proper form and avoid" +
                    " any excessive swinging or momentum.",
            "https://musclefit.info/wp-content/uploads/2021/09/luchshie-uprazhneniya-na-brusyah-min.jpg",
            "https://giphy.com/gifs/8fit-workout-chest-8fit-XL3mS4LvNB7I6qRnyu"
        ),
        Exercise(
            21,
            "Back",
            "Wide-Grip Pull-Up",
            false,
            "Start by grasping a pull-up bar with your hands positioned wider than shoulder-width apart. " +
                    "Hang with your arms fully extended and your body in a straight line. Engage your core muscles " +
                    "and squeeze your shoulder blades together as you pull your body upward. Aim to bring your chest " +
                    "close to the bar while maintaining a controlled and smooth movement. Lower your body back down to " +
                    "the starting position with control. Adjust the number of repetitions and sets based on your fitness " +
                    "level and goals. Remember to maintain proper form and avoid any excessive swinging or kipping movements.",
            "https://i0.wp.com/baltija.eu/wp-content/uploads/2023/06/podtjagivanija-bez-turnika-kak-nauchitsja-podtjagivatsja-s-nulja-v-domashnih-uslovijah-e60148f.jpg?fit=1024%2C576&ssl=1",
            "https://delavie.ru/wp-content/uploads/2016/8/spinsh24a.gif"
        ),
        Exercise(
            22,
            "Back",
            "Close-Grip Pull-Up",
            false,
            "Start by gripping a pull-up bar with hands positioned closer than shoulder-width apart. " +
                    "Hang with arms fully extended and body straight. Engage core muscles and squeeze shoulder " +
                    "blades together as you pull body upward, aiming to bring chin above the bar. Lower body back " +
                    "down with control. Adjust repetitions and sets based on fitness level and goals. Maintain proper " +
                    "form and avoid swinging or kipping movements.",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTK4mMr9aWl820R25LmyXDJvPTl-0aTe6fPPw&usqp=CAU",
            "https://vashsport.com/wp-content/uploads/podtyagivaniya-uzkim-hvatom-vashsport.com_.gif"
        ),
        Exercise(
            23,
            "Chest",
            "Elevated Push-Up",
            false,
            "Start by placing your hands on an elevated surface, such as a bench or step, " +
                    "with your palms facing down and slightly wider than shoulder-width apart. Position " +
                    "your feet on the ground, forming a straight line from your head to your heels. Engage " +
                    "your core muscles and maintain a neutral spine as you lower your chest towards the " +
                    "elevated surface by bending your elbows. Ensure your elbows are at a 45-degree angle t" +
                    "o your body. Push through your palms to extend your elbows and return to the starting " +
                    "position. Adjust the number of repetitions and sets based on your fitness level and goals. " +
                    "Focus on maintaining proper form and avoid letting your hips sag or your lower back arch excessively.",
            "https://fitnavigator.ru/wp-content/uploads/2015/12/naklonnye-otzhimanija_5.jpg",
            "https://cdn.lifehacker.ru/wp-content/uploads/2017/01/ezgif.com-980b4e7d2f_1484736189.gif"
        ),
        Exercise(
            24,
            "Chest",
            "Archer Push-Up",
            false,
            "Start in a push-up position with your hands wider than shoulder-width apart. " +
                    "Extend one arm straight out to the side while keeping the other arm in the " +
                    "regular push-up position. Lower your chest towards the ground by bending your " +
                    "elbows, while simultaneously shifting your body weight towards the side of the " +
                    "arm that is extended. As you lower, aim to keep your extended arm straight. " +
                    "Push through your palms to extend your elbows and return to the starting position. " +
                    "Alternate sides for each repetition. Adjust the number of repetitions and sets " +
                    "based on your fitness level and goals. Focus on maintaining proper form and avoid " +
                    "letting your hips sag or your lower back arch excessively.",
            "https://avatars.dzeninfra.ru/get-zen_doc/1219524/pub_5c4dd58e079c5400af5f1e84_5c4e5e8d6ddc3700bdacbe0c/scale_1200",
            "https://makefitness.pro/wp-content/uploads/2020/02/%D0%BE%D1%82%D0%B6%D0%B8%D0%BC%D0%B0%D0%BD%D0%B8%D1%8F-%D0%BB%D1%83%D1%87%D0%BD%D0%B8%D0%BA%D0%B0.gif"
        ),
        Exercise(
            25,
            "Chest",
            "Knee Tuck Push-Up Exercise",
            false,
            "Start in a push-up position with your hands slightly wider than shoulder-width" +
                    " apart. Position one knee on a raised surface, such as a step or bench, with " +
                    "your foot hanging off the edge. Keep the other leg extended behind you. Lower " +
                    "your chest towards the ground by bending your elbows, while simultaneously " +
                    "bringing your back knee towards your chest, tucking it in as close as possible. " +
                    "Push through your palms to extend your elbows and return to the starting p" +
                    "osition, while simultaneously extending your back leg. Alternate legs for each " +
                    "repetition. Adjust the number of repetitions and sets based on your fitness l" +
                    "evel and goals. Focus on maintaining proper form and avoid letting your hips " +
                    "sag or your lower back arch excessively.",
            "https://strong-life.ru/wp-content/uploads/2017/08/IMG_20180126_191941.jpg",
            "https://makefitness.pro/wp-content/uploads/2020/02/%D0%BE%D1%82%D0%B6-%D1%81-%D0%BF%D0%BE%D0%B4%D0%BD%D0%BE%D1%81%D0%BE%D0%BC-%D0%BA%D0%BE%D0%BB%D0%B5%D0%BD%D0%B0-%D0%B2-%D0%BD%D0%B8%D0%B6%D0%BD%D0%B5%D0%B9-%D1%82%D0%BE%D1%87%D0%BA%D0%B5.gif",
        )
    )
}