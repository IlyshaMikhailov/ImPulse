package com.example.impulse.favourites

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.impulse.R
import com.example.impulse.databinding.FavouritesFragmentBinding
import com.example.impulse.workout.exercise.Exercise
import com.example.impulse.workout.exercise.ExerciseRepository
import com.example.impulse.workout.info.InfoFragment

class FavouritesFragment : Fragment(R.layout.favourites_fragment) {
    private var binding: FavouritesFragmentBinding? = null
    private var listAdapter: MyListAdapter? = null
    private lateinit var sharedPref: SharedPreferences
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FavouritesFragmentBinding.bind(view)
        sharedPref = activity?.getPreferences(Context.MODE_PRIVATE)!!

        listAdapter = MyListAdapter(
            Glide.with(this),
            ::onItemClicked,
            ::onDeleteClicked
        )

        binding?.rvFavourite?.adapter = listAdapter
        listAdapter?.submitList(getAllFavourites())
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
        //listAdapter?.submitList(getAllFavourites())
        saveFavouritesIds(getFavouritesIds().joinToString(","))
    }

    private fun getFavouritesIds(): List<Int> {
        return ExerciseRepository.findAllFavourites().map { exercise ->
            exercise.id
        }
    }

    private fun saveFavouritesIds(string: String) {
        val editor = sharedPref.edit()
        editor.putString("favorite_exercise_ids", string)
        editor.apply()
    }

    private fun getAllFavourites(): List<Exercise> {
        val stringIds = sharedPref.getString("favorite_exercise_ids", "")
        return ExerciseRepository.findAllByIds(
            stringIds?.split(",")?.mapNotNull { it.toIntOrNull() }!!
        )
    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}