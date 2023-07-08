package com.example.impulse.workout

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.addCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.impulse.workout.exercise.ExerciseFragment
import com.example.impulse.R
import com.example.impulse.databinding.WorkoutFragmentBinding


class WorkoutFragment : Fragment(R.layout.workout_fragment) {
    private var binding: WorkoutFragmentBinding? = null
    private var adapter: WorkoutAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = WorkoutFragmentBinding.bind(view)
        initAdapter()
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner) {
            requireActivity().finish()
        }
    }

    private fun initAdapter() {
        adapter = WorkoutAdapter(
            list = WorkoutRepository.list,
            glide = Glide.with(this),
            onItemClick = { workout ->
                findNavController().navigate(
                    R.id.action_workoutFragment_to_exerciseFragment,
                    ExerciseFragment.createBundle(workout.title)
                )
            }
        )
        binding?.rvWorkoutFragment?.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}