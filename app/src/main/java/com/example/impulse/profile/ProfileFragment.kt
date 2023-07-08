package com.example.impulse.profile

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.impulse.R
import com.example.impulse.databinding.ProfileFragmentBinding
import com.example.impulse.databinding.ProfileFragmentBinding.*

class ProfileFragment : Fragment(R.layout.profile_fragment) {
    private var binding: ProfileFragmentBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = bind(view)

        val sharedPref = activity?.getPreferences(Context.MODE_PRIVATE)
        val name = sharedPref?.getString("Name", "")
        val age = sharedPref?.getString("Age", "")
        val height = sharedPref?.getString("Height", "")
        val weight = sharedPref?.getString("Weight", "")
        val dsWeight = sharedPref?.getString("DesiredWeight", "")

        binding!!.tvTextName.text = name
        binding!!.tvTextAge.text = age
        binding!!.tvTextHeight.text = height
        binding!!.tvTextWeight.text = weight
        binding!!.tvTextDsWeight.text = dsWeight

        binding?.run {
            btnSettings.setOnClickListener {
                findNavController().navigate(R.id.action_profileFragment_to_settingsFragment)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}