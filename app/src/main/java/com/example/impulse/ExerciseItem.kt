package com.example.impulse

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.RequestManager
import com.example.impulse.databinding.ItemExerciseBinding

class ExerciseItem(
    private val binding: ItemExerciseBinding,
    private val glide: RequestManager,
    private val onItemClick: (Exercise) -> Unit,
) : ViewHolder(binding.root) {
    fun onBind(exercise: Exercise) {

        binding.imBtnFavourite.setOnClickListener {
            when (exercise.isFavourites) {
                true -> {
                    exercise.isFavourites = false
                    binding.imBtnFavourite.setImageResource(R.drawable.baseline_star_border_24)

                }

                false -> {
                    exercise.isFavourites = true
                    binding.imBtnFavourite.setImageResource(R.drawable.baseline_star_24)

                }
            }
        }

        binding.run {
            when (exercise.isFavourites) {
                true -> {
                    binding.imBtnFavourite.setImageResource(R.drawable.baseline_star_24)
                }

                false -> {
                    binding.imBtnFavourite.setImageResource(R.drawable.baseline_star_border_24)
                }
            }

            tvItemExerciseTitle.text = exercise.title

            glide
                .load(exercise.image)
                .error(R.drawable.error)
                .into(ivItemExerciseImage)
            root.setOnClickListener {
                onItemClick(exercise)
            }
        }
    }
}