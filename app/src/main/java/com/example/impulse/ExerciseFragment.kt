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
    private var setOfExercise = HashSet<Exercise>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = ExerciseFragmentBinding.bind(view)
        initAdapter()

        val descWorkout = arguments?.getString(ARG_TITLE)
        println(descWorkout)
        for (exercise in ExerciseRepository.hashSet) {
            if (descWorkout == exercise.bodyPart)
                setOfExercise.add(exercise)
        }
        binding?.imBtnBack?.setOnClickListener {
            findNavController().navigateUp()
        }
        initAdapter()
    }


    private fun initAdapter() {
        adapter = ExerciseAdapter(
            hashSet = setOfExercise,
            glide = Glide.with(this),
            onItemClick = { exercise ->
                findNavController().navigate(
                    R.id.action_exerciseFragment_to_infoFragment,
                    InfoFragment.createBundle(exercise.id)
                )
            }
        )
        binding?.rvExerciseFragment?.adapter = adapter
    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    companion object {

        private const val ARG_TITLE = "ARG_TITLE"

        fun createBundle(str: String): Bundle {
            val bundle = Bundle()
            bundle.putString(ARG_TITLE, str)
            return bundle
        }
    }
}


