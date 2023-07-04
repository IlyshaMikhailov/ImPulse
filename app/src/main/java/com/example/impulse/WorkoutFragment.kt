package com.example.impulse

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.impulse.databinding.WorkoutFragmentBinding

class WorkoutFragment :Fragment(R.layout.workout_fragment) {
    private var binding: WorkoutFragmentBinding?=null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = WorkoutFragmentBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}