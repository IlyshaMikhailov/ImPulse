package com.example.impulse

import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.View
import com.example.impulse.databinding.ExerciseFragmentBinding

class ExerciseFragment:Fragment(R.layout.exercise_fragment) {
    private var binding: ExerciseFragmentBinding?=null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = ExerciseFragmentBinding.bind(view)

    }
    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}