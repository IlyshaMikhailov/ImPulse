package com.example.impulse.profile.settings

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.impulse.R
import com.example.impulse.databinding.CreatorsFragmentBinding

class CreatorsFragment : Fragment(R.layout.creators_fragment) {
    private var binding: CreatorsFragmentBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = CreatorsFragmentBinding.bind(view)

        binding?.run {
            imBtnBack.setOnClickListener {
                findNavController().navigateUp()
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}