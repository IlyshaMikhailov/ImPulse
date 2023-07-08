package com.example.impulse

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.RequestManager
import com.example.impulse.databinding.ItemExerciseBinding
import com.google.android.material.snackbar.Snackbar


class ExerciseItem(
    private val binding: ItemExerciseBinding,
    private val glide: RequestManager,
    private val onItemClick: (Exercise) -> Unit,
) : ViewHolder(binding.root) {
    fun onBind(exercise: Exercise) {

        binding.imBtnFavourite.setOnClickListener{
            when (exercise.isFavourites) {
                true -> {
                    exercise.isFavourites = false
                    binding.imBtnFavourite.setImageResource(R.drawable.baseline_star_border_24)
                    Snackbar.make(binding.root, "\"" + exercise.title + "\" exercise was deleted from \"Favourites exercise\"", Snackbar.LENGTH_SHORT).show()
                }
                false -> {
                    exercise.isFavourites = true
                    binding.imBtnFavourite.setImageResource(R.drawable.baseline_star_24)
                    Snackbar.make(binding.root, "\"" + exercise.title + "\" exercise was added to \"Favourites exercise\"", Snackbar.LENGTH_SHORT).show()
                }
            }
        }

        binding.run {
            when (exercise.isFavourites) {
                true -> {
                    binding.imBtnFavourite.setImageResource(R.drawable.baseline_star_24)
                } false -> {
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