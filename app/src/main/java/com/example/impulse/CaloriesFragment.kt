package com.example.impulse

import android.content.Context
import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.View
import com.example.impulse.databinding.CaloriesFragmentBinding


class CaloriesFragment : Fragment(R.layout.calories_fragment) {
    private var binding: CaloriesFragmentBinding? = null

    val sharedPref = activity?.getPreferences(Context.MODE_PRIVATE)
    val age = sharedPref?.getString("Age", "")
    val height = sharedPref?.getString("Height", "")
    val weight = sharedPref?.getString("Weight", "")
    val dsWeight = sharedPref?.getString("DesiredWeight", "")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = CaloriesFragmentBinding.bind(view)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}