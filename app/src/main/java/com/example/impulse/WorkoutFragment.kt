package com.example.impulse

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.impulse.databinding.WorkoutFragmentBinding

class WorkoutFragment : Fragment(R.layout.workout_fragment) {
    private var binding: WorkoutFragmentBinding? = null
    private var adapter: WorkoutAdapter? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = WorkoutFragmentBinding.bind(view)
        initAdapter()
    }
    private fun initAdapter(){
        adapter = WorkoutAdapter(WorkoutRepository.list,
        Glide.with(this)
        ) { Workout ->
            findNavController().navigate(R.id.action_workoutFragment_to_exerciseFragment)
        }
        binding?.rvWorkoutFragment?.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}