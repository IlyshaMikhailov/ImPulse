package com.example.impulse

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.impulse.databinding.EditProfileFraagmentBinding
import com.example.impulse.databinding.SettingsFragmentBinding

class EditProfileFragment : Fragment(R.layout.edit_profile_fraagment) {
    private var binding: EditProfileFraagmentBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = EditProfileFraagmentBinding.bind(view)


        binding?.run {
            imBtnBack.setOnClickListener {
                findNavController().navigateUp()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}