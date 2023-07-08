package com.example.impulse.profile.settings

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.impulse.R
import com.example.impulse.databinding.EditProfileFraagmentBinding

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