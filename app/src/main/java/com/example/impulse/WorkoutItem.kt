package com.example.impulse

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.example.impulse.databinding.ItemWorkoutBinding
import com.example.impulse.databinding.WorkoutFragmentBinding

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