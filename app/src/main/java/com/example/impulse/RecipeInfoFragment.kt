package com.example.impulse


import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.impulse.databinding.FragmentRecipeInfoBinding

class RecipeInfoFragment : Fragment(R.layout.fragment_recipe_info) {
    private var binding: FragmentRecipeInfoBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentRecipeInfoBinding.bind(view)
        val name_recipe = arguments?.getString("RECIPE_NAME")
        val recipe: Recipe = RecipeRepository.list.single { it.name == name_recipe }
        binding?.tvName?.text = recipe.name
        binding?.tvBzhu?.text = recipe.bzhu
        binding?.tvRecipe?.text = recipe.recipe
        binding?.tvIngridients?.text = recipe.ingridients
        binding?.imBtnBack?.setOnClickListener {
            findNavController().navigateUp()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}