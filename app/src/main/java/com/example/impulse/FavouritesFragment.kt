package com.example.impulse


import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.impulse.databinding.FavouritesFragmentBinding

class FavouritesFragment : Fragment(R.layout.favourites_fragment) {
    private var binding: FavouritesFragmentBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FavouritesFragmentBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}