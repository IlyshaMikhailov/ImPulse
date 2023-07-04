package com.example.impulse

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.impulse.databinding.MainFragmentBinding

class MainFragment: Fragment(R.layout.main_fragment) {
    private var binding: MainFragmentBinding?=null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = MainFragmentBinding.bind(view)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}