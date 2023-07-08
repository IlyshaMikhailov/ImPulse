package com.example.impulse

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.impulse.databinding.SettingsFragmentBinding

class SettingsFragment : Fragment(R.layout.settings_fragment) {
    private var binding: SettingsFragmentBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = SettingsFragmentBinding.bind(view)
        val name = binding?.etName

        binding?.run {
            imBtnBack.setOnClickListener {
                findNavController().navigateUp()
            }
            btnToChange.setOnClickListener {
                val etName: String = name?.text.toString()
                val sharedPref = activity?.getPreferences(Context.MODE_PRIVATE)
                val editor = sharedPref?.edit()
                editor?.putString("Name", etName)
                editor?.apply()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}