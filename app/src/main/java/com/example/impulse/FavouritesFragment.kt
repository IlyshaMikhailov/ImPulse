package com.example.impulse


import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.impulse.databinding.FavouritesFragmentBinding

class FavouritesFragment : Fragment(R.layout.favourites_fragment) {
    private var binding: FavouritesFragmentBinding? = null
    private var adapter: FavouritesAdapter? = null
    private var listOfExercise = ArrayList<Exercise>()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FavouritesFragmentBinding.bind(view)

        for (exercise in ExerciseRepository.list) {
            if (exercise.isFavourites) {
                listOfExercise.add(exercise)
            }
        }

        initAdapter()

    }

    private fun initAdapter() {
        adapter = listOfExercise?.let {
            FavouritesAdapter(
                list = it,
                glide = Glide.with(this),
                onItemClick = { exercise ->
                    findNavController().navigate(
                        R.id.action_favouritesFragment_to_infoFragment,
                        InfoFragment.createBundle(exercise.id)
                    )
                }
            )
        }
        binding?.rvFavourite?.adapter = adapter
    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}