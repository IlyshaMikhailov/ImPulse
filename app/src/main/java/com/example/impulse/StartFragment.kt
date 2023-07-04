package com.example.impulse

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.impulse.databinding.StartFragmentBinding

class StartFragment : Fragment(R.layout.start_fragment) {
    private var binding: StartFragmentBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = StartFragmentBinding.bind(view)
        binding?.run {
            button.setOnClickListener {
                findNavController().navigate(R.id.action_startFragment_to_mainFragment)
            }
        }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}