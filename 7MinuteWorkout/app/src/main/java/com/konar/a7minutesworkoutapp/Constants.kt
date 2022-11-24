package com.konar.a7minutesworkoutapp

object Constants {
    fun defaultExerciseList(): ArrayList<ExerciseModel> {
        val exerciseList = ArrayList<ExerciseModel>()
        val jumpingJacks =
            ExerciseModel(1, "Jumping Jacks", R.drawable.ic_jumping_jacks, false, false)
        val wallSit = ExerciseModel(2, "Wall Sit", R.drawable.ic_wall_sit, false, false)
        val abdominalCrunch =
            ExerciseModel(3, "Abdominal Crunch", R.drawable.ic_abdominal_crunch, false, false)
        val pushUp = ExerciseModel(4, "Push Up", R.drawable.ic_push_up, false, false)
        val pushUpAndRotation = ExerciseModel(
            5,
            "Push Up and Rotation",
            R.drawable.ic_push_up_and_rotation,
            false,
            false
        )
        val plank = ExerciseModel(6, "Planck", R.drawable.ic_plank, false, false)
        val sidePlanck = ExerciseModel(7, "Side Planck", R.drawable.ic_side_plank, false, false)
        val squat = ExerciseModel(8, "Squat", R.drawable.ic_squat, false, false)
        val lunge = ExerciseModel(9, "Lunge", R.drawable.ic_lunge, false, false)
        val stepUpOntoChair =
            ExerciseModel(10, "Step up onto chair", R.drawable.ic_step_up_onto_chair, false, false)
        val tricepsDipOnChair = ExerciseModel(
            11,
            "Triceps dip on chair",
            R.drawable.ic_triceps_dip_on_chair,
            false,
            false
        )
        val highKneesRunningInPlace = ExerciseModel(
            12,
            "High knees running in place",
            R.drawable.ic_high_knees_running_in_place,
            false,
            false
        )

        exerciseList.add(jumpingJacks)
        exerciseList.add(wallSit)
        exerciseList.add(abdominalCrunch)
        exerciseList.add(pushUp)
        exerciseList.add(pushUpAndRotation)
        exerciseList.add(plank)
        exerciseList.add(sidePlanck)
        exerciseList.add(squat)
        exerciseList.add(lunge)
        exerciseList.add(stepUpOntoChair)
        exerciseList.add(tricepsDipOnChair)
        exerciseList.add(highKneesRunningInPlace)

        return exerciseList
    }
}