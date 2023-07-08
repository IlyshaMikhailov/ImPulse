package com.example.impulse.workout

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.RequestManager
import com.example.impulse.R
import com.example.impulse.databinding.ItemWorkoutBinding

class WorkoutItem(
    private val binding: ItemWorkoutBinding,
    private val glide:RequestManager,
    private val onItemClick:(Workout)->Unit
) : ViewHolder(binding.root) {
    fun onBind(workout: Workout) {
        binding.run {
            tvItemWorkoutTitle.text = workout.title
            tvItemWorkoutDesc.text = workout.desc
            glide
                .load(workout.image)
                .error(R.drawable.error)
                .into(ivItemWorkoutImage)
            root.setOnClickListener{
                onItemClick(workout)
            }
        }
    }
}