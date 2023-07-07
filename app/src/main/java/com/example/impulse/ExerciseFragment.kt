package com.example.impulse

import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.impulse.databinding.ExerciseFragmentBinding

class ExerciseFragment : Fragment(R.layout.exercise_fragment) {
    private var binding: ExerciseFragmentBinding? = null
    private var adapter: ExerciseAdapter? = null
    var list: List<Exercise> = listOf(
        Exercise(
            "Анжумания",
            "10 минут",
            "https://cdn.myanimelist.net/s/common/uploaded_files/1461219842-6ca66b76f0a68f6093c091b790d6df6b.jpeg"
        )
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = ExerciseFragmentBinding.bind(view)
        initAdapter()

    }
    private fun initAdapter() {
        adapter = ExerciseAdapter(
            list,
            Glide.with(this)
        ) { Workout ->
            findNavController().navigate(R.id.action_workoutFragment_to_exerciseFragment)
        }
        binding?.rvExerciseFragment?.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}
