package com.example.impulse.profile.settings

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.impulse.R
import com.example.impulse.databinding.SettingsFragmentBinding

class SettingsFragment : Fragment(R.layout.settings_fragment) {
    private var binding: SettingsFragmentBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = SettingsFragmentBinding.bind(view)

        binding?.run {
            imBtnBack.setOnClickListener {
                findNavController().navigateUp()
            }
            vChangeDataProfile.setOnClickListener {
                findNavController().navigate(R.id.action_settingsFragment_to_editProfileFragment)
            }
            vSupport.setOnClickListener {
                findNavController().navigate(R.id.action_settingsFragment_to_supportFragment)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}