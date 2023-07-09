package com.example.impulse.calories

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.example.impulse.databinding.ItemRecipesBinding

class RecipeItem(
    private val binding: ItemRecipesBinding,
    private val glide: RequestManager,
    private val onItemClick: (Recipe) -> Unit
) : RecyclerView.ViewHolder(binding.root) {
    fun onBind(recipe: Recipe) {
        binding.run {
            tvItemDishName.text = recipe.name
            tvItemDishCal.text = recipe.kkal
            glide
                .load(recipe.image)
                .into(ivItemDishImage)
            root.setOnClickListener {
                onItemClick(recipe)
            }
        }
    }
}