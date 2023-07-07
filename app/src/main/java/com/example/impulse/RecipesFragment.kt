package com.example.impulse

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.impulse.databinding.FragmentRecipesBinding
import kotlin.streams.toList

class RecipesFragment : Fragment(R.layout.fragment_recipes) {
    private var binding: FragmentRecipesBinding?=null
    private var adapter: RecipeAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentRecipesBinding.bind(view)
        val id_bundle = arguments?.getInt("CLASS_NAME")!!.toInt()
        val eatings:Eatings = EatingsRepository.list.single{it.id == id_bundle}
        binding?.tvTitle?.text = eatings.title
        binding?.tvDesc?.text = eatings.desc
        initAdapter(id_bundle)
        binding?.imBtnBack?.setOnClickListener{
            findNavController().navigateUp()
        }

    }
    private fun initAdapter(id:Int){
        var list:List<Recipe> = RecipeRepository.list
        adapter = RecipeAdapter(RecipeRepository.list.stream().filter{it.id==id}.toList(),
            Glide.with(this)
        ) { Recipe ->
            findNavController().navigate(R.id.action_recipesFragment_to_recipeInfoFragment,
                createRecipeBundle(Recipe.name)
            )
        }
        binding?.rvRecipeFragment?.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
    companion object{
        fun createRecipeBundle(name:String):Bundle{
            val bundle = Bundle()
            bundle.putString("RECIPE_NAME",name)
            return bundle
        }
    }
}