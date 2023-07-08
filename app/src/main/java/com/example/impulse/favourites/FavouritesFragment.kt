package com.example.impulse.favourites

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.impulse.workout.info.InfoFragment
import com.example.impulse.R
import com.example.impulse.databinding.FavouritesFragmentBinding
import com.example.impulse.workout.exercise.Exercise
import com.example.impulse.workout.exercise.ExerciseRepository

class FavouritesFragment : Fragment(R.layout.favourites_fragment) {
    private var binding: FavouritesFragmentBinding? = null
    private var listAdapter: MyListAdapter? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FavouritesFragmentBinding.bind(view)

        listAdapter = MyListAdapter(
            Glide.with(this),
            ::onItemClicked,
            ::onDeleteClicked
        )

        binding?.rvFavourite?.adapter = listAdapter
        listAdapter?.submitList(ExerciseRepository.findAllFavourites())
    }

    private fun onItemClicked(exercise: Exercise) {
        findNavController().navigate(
            R.id.action_favouritesFragment_to_infoFragment,
            InfoFragment.createBundle(exercise.id)
        )
    }

    private fun onDeleteClicked(exercise: Exercise) {
        ExerciseRepository.updateFavorites(exercise.id, exercise.isFavourites)
        listAdapter?.submitList(ExerciseRepository.findAllFavourites())
    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}