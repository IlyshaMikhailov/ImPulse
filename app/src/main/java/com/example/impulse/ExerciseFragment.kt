package com.example.impulse

import androidx.fragment.app.Fragment
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.impulse.databinding.ExerciseFragmentBinding

class ExerciseFragment : Fragment(R.layout.exercise_fragment) {
    private var binding: ExerciseFragmentBinding? = null
    private var adapter: ExerciseAdapter? = null
    private var listOfExercise = ArrayList<Exercise>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = ExerciseFragmentBinding.bind(view)

        val descWorkout = arguments?.getString(STR)
        println(descWorkout)
        for (exercise in ExerciseRepository.list) {
            if (descWorkout == exercise.bodyPart)
                listOfExercise.add(exercise)
        }
        initAdapter()
    }

    private fun initAdapter() {
        adapter = ExerciseAdapter(
            list = listOfExercise,
            glide = Glide.with(this),
            onItemClick = { exercise ->
                findNavController().navigate(
                        R.id.action_exerciseFragment_to_infoFragment,
                        InfoFragment.createBundle(exercise.id))
            }
        )
        binding?.rvExerciseFragment?.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    companion object {

        private const val STR = "STR"

        fun createBundle(str : String): Bundle {
            val bundle = Bundle()
            bundle.putString(STR, str)
            return bundle
        }
    }
}