package com.example.impulse.calories

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.example.impulse.databinding.ItemRecipesBinding

class RecipeAdapter(
    private var list: List<Recipe>,
    private var glide: RequestManager,
    private val onItemClick: (Recipe) -> Unit
) : RecyclerView.Adapter<RecipeItem>() {

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): RecipeItem =
        RecipeItem(
            binding = ItemRecipesBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ),
            glide = glide,
            onItemClick = onItemClick,
        )

    override fun onBindViewHolder(holder: RecipeItem, position: Int) {
        holder.onBind(list[position])
    }


    override fun getItemCount(): Int {
        return list.size
    }
}
