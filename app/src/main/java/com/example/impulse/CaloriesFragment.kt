package com.example.impulse

import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.View
import com.example.impulse.databinding.CaloriesFragmentBinding


class CaloriesFragment : Fragment(R.layout.calories_fragment) {
    private var binding: CaloriesFragmentBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = CaloriesFragmentBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}