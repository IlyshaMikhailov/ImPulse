package com.example.impulse

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.impulse.databinding.InfoFragmentBinding

class InfoFragment : Fragment(R.layout.info_fragment) {
    private var binding: InfoFragmentBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = InfoFragmentBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}