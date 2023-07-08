package com.example.impulse

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.RequestManager
import com.example.impulse.databinding.ItemExerciseBinding


class ExerciseItem(
    private val binding: ItemExerciseBinding,
    private val glide: RequestManager,
    private val onItemClick: (Exercise) -> Unit
) : ViewHolder(binding.root) {
    fun onBind(exercise: Exercise) {
        binding.run {
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