package com.example.impulse.workout.exercise

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.impulse.R
import com.example.impulse.databinding.ExerciseFragmentBinding
import com.example.impulse.favourites.MyListAdapter
import com.example.impulse.workout.info.InfoFragment

class ExerciseFragment : Fragment(R.layout.exercise_fragment) {
    private var binding: ExerciseFragmentBinding? = null
    private var listAdapter: MyListAdapter? = null
    private var descr: String? = null
    private lateinit var sharedPref: SharedPreferences

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = ExerciseFragmentBinding.bind(view)
        sharedPref = activity?.getPreferences(Context.MODE_PRIVATE)!!

        val descWorkout = arguments?.getString(ARG_TITLE)
        println(descWorkout)

        binding?.imBtnBack?.setOnClickListener {
            findNavController().navigateUp()
        }

        if (descWorkout != null) {
            descr = descWorkout
            println(descr)
        }

        listAdapter = MyListAdapter(
            Glide.with(this),
            ::onItemClick,
            ::onDeleteClick
        )

        binding?.rvExerciseFragment?.adapter = listAdapter
        listAdapter?.submitList(ExerciseRepository.findAllToString(descr!!))
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
        return ExerciseRepository.findAllByIds(stringIds?.split(",")?.map { it.toInt() }!!)!!
    }


    private fun onItemClick(exercise: Exercise) {
        findNavController().navigate(
            R.id.action_exerciseFragment_to_infoFragment,
            InfoFragment.createBundle(exercise.id)
        )
    }

    private fun onDeleteClick(exercise: Exercise) {
        ExerciseRepository.updateFavorites(exercise.id, exercise.isFavourites)
        listAdapter?.submitList(ExerciseRepository.findAllToString(descr!!))
        saveFavouritesIds(getFavouritesIds().joinToString(","))
    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    companion object {

        private const val ARG_TITLE = "ARG_TITLE"

        fun createBundle(str: String): Bundle {
            val bundle = Bundle()
            bundle.putString(ARG_TITLE, str)
            return bundle
        }
    }
}


