package com.example.impulse

object ExerciseRepository {
    val hashSet =  setOf(
        Exercise(
            1,
            "Hands",
            "Standard push up",
            false,
            "Get into push-up positions, and do the best you can, if it's still difficult, start with smaller numbers.\n" +
                    "4 sets with a 4 minute break in between",
            R.raw.manpushups,
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
            R.raw.bicepspullups,
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRd2YFKW_uNxmkOirkw5cpL8bZtf-pwBg3Kfg&usqp=CAU",
            "https://media1.giphy.com/media/2ALcpIRjQFi21eezSI/giphy.gif?cid=ecf05e47yocsnymj6owk55w8ustial3ms4ojwenr12u19vzv&ep=v1_gifs_search&rid=giphy.gif&ct=g"
        ),
        Exercise(
            2,
            "Hands",
            "Reversed pull up",
            false,
            "\n" +
                    "In a position with your back to a chair, rest your hands on the front of the stud while pushing your hips and legs.\n" +
                    "Keeping your back close to the chair, bend your elbows to a 90 degree angle.\n" +
                    "4 sets of 13 reps, rest between sets 3.5 minutes",
            R.raw.reversedpullupsonthechair,
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSXxR7weASmpON51SN_Qw9StAPpDhqQ-R88Nw&usqp=CAU",
            "https://media4.giphy.com/media/jTs6TRPQAlHvtV044Y/giphy.gif?cid=ecf05e47t7k42nvomett88g4k4uud08g6vbtmfmk0srlzzqw&ep=v1_gifs_search&rid=giphy.gif&ct=g"
        ),
        Exercise(
            4,
            "Press",
            "Scruchivaniya",
            false,
            "Lie on your back, bend your knees and put your hands behind your head, as in the video, slightly raising the body, bringing the ribs and pelvis together.Each set of 15 repetitions, total approaches should be 4\\n\" +\n" +
                    "\"rest between sets should be 2 to 3 minutes.",
            R.raw.scruchivaniya,
            "https://www.mentoday.ru/upload/img_cache/a78/a78c6b22e05b8bad1038929d0f2aa717_ce_1080x719x0x52_cropped_666x444.jpg",
            "https://assets.gq.ru/photos/5d9f40b43a54c0000840d1c6/4:3/w_285,h_213,c_limit/giphy.gif"
        ),
        Exercise(
            19,
            "Chest",
            "Chest",
            false,
            description = "Get into push-up positions, and do the best you can, if it's still difficult, start with smaller numbers.\n" +
                    "4 sets with a 4 minute break in between",

            R.raw.manpushups,
            "https://storage.teendaily.ru/2021/11/08/67775cec-74ec-4a74-90ab-25d790258fcc.jpg",
            "https://cdn.lifehacker.ru/wp-content/uploads/2017/01/ezgif.com-02f99f58dd_1484735298.gif"
        ),
        Exercise(
            5,
            "Press",
            "Russian twists",
            false,
            "Sit on the floor, stretch your legs forward and bend your knees. Raise your legs slightly, tilt your body back.\n" +
                    "Put your hands together in front of your chest and turn your body from side to side without moving your pelvis.4 sets of 2 reps. Rest 2 to 3 minutes",
            R.raw.russiantwists,
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
            R.raw.plank,
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQlXmYJW9j8sojZNgbz7LorRgdwhFXgb5M9kg&usqp=CAU",
            "https://i.gifer.com/origin/b7/b7566b44f91a69b5d0e93775b481febc.gif"
        ),
        Exercise(
            7,
            "Press",
            "Scisors",
            false,
            "Lie on your back, put your head on the floor. Alternately raise your right and left legs without bending at the knees and without lowering your legs to the floor.\n" +
                    "4 sets of 15 reps",
            R.raw.scisors,
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSd--0UfdhzXO4nkz5a-fy800KjC2g7VN7ihw&usqp=CAU",
            "https://avalon.fabiosacdn.com/image/56674407-10ea-4e9a-9571-13fd6236696d.gif"
        ),
        Exercise(
            8,
            "Press",
            "Bicycle",
            false,
            "Lie on your back, put your hands under your head, raise each leg in turn to your head and point the opposite elbow in its direction.\n" +
                    "4 sets of 20 reps rest between sets of 2 to 3 minutes",
            R.raw.bicycle,
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcREAXCwpIDruU0oHJq0nIYP4pU-nUFrao2ACQ&usqp=CAU",
            "https://media2.giphy.com/media/cM8tzmeTY0SYMz6VGj/giphy.gif"
        ),
        Exercise(
            9,
            "Press",
            "Alpinist",
            false,
            "Take an emphasis lying down. Pull your right knee to your chest, jump out and change legs in the air - left forward, right back.\n" +
                    " 4 sets of 16 reps, rest between sets 2 to 3 minutes",
            R.raw.alpinist,
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
            R.raw.bringsallyup,
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSd8NYqNfkbaI_wZqNzLTJ1vlBpvsU9WqI8IQ&usqp=CAU",
            "https://media2.giphy.com/media/v1.Y2lkPTc5MGI3NjExdnVoMGFha3YyaGZ3cTFob3c1NGVwMnE2dXpxcThkemtsODBtaHUxbSZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/7zuAQ6ebll6maa2rBF/giphy.gif"
        ),
        Exercise(
            11,
            "Legs",
            "Sitdown",
            false,
            "Feet shoulder-width apart, socks slightly apart, back straight, look forward,\n" +
                    "bending the legs at the knees, lower the pelvis down to a position where the thighs are parallel to the floor, while the position of the body does not change,\n" +
                    "unbend the legs and return to the starting position,\n" +
                    "hands can help keep the balance, being in front of the chest.\n" +
                    "3 sets of 15 reps, rest between sets of 3 minutes",
            R.raw.sitdowns,
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTK24_fcmXS8ZSKxzjoXEduNLXG5_GyMzYtBQ&usqp=CAU",
            "https://wpstatic.gymbeam.com/blog/wp-content/uploads/mageblog/1f5dddd2a2a1b1b350de5b6dcae07807.gif"
        ),
        Exercise(
            12,
            "Legs",
            "Caviar",
            false,
            "Take dumbbells in your hands and straighten your back. Rise on your toes as you exhale, and as you inhale, lower your entire foot. If desired, place your socks on a plate or other support to make the workout more difficult.\n" +
                    "4 sets of 20 reps, rest 2-3 minutes",
            R.raw.ikra1,
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
                    "Take a deep breath and, holding your breath, tighten your lats and pull yourself up. During pull-ups, the elbows should always remain in the same place.\n" +
                    "Pull yourself up until your chin is level with or slightly above the bar.\n" +
                    "Do 3-4 sets depending on your ability and rest for 4 minutes",
            R.raw.pullups,
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS2npiX20Vptj1OV8luBk1mr1z90gqYtmjuTg&usqp=CAU",
            "https://media1.giphy.com/media/j5VrvBfbV332AOow1B/giphy.gif?cid=ecf05e47yocsnymj6owk55w8ustial3ms4ojwenr12u19vzv&ep=v1_gifs_search&rid=giphy.gif&ct=g"
        ),
        Exercise(
            14,
            "Back",
            "Back pull up",
            false,
            "Grab the crossbar.\n" +
                    "As you exhale, start moving up. As you rise, try to reduce the shoulder blades so that it is the back muscles that are included in the work, and not the arms. Keep pulling up until there are a few inches between the back of your head and the bar.\n" +
                    "Slowly lower yourself down.\n" +
                    "Do 3 sets depending on your capabilities, rest for 4 minutes",
            R.raw.backpullups,
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ9pNX-axPYXsWmLTaSL8zewLL-cAkBKE792g&usqp=CAU",
            "https://cross.expert/wp-content/uploads/2017/08/Podtyagivaniya-za-golovu-1.gif"
        ),

    )
}