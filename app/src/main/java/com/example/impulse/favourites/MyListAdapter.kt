package com.example.impulse.favourites

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.bumptech.glide.RequestManager
import com.example.impulse.databinding.ItemExerciseBinding
import com.example.impulse.workout.exercise.Exercise
import com.example.impulse.workout.exercise.ExerciseItem

class MyListAdapter(
    private val glide: RequestManager,
    private val onItemClicked: (Exercise) -> Unit,
    private val onDeleteClick: (Exercise) -> Unit
) : ListAdapter<Exercise, ExerciseItem>(object : DiffUtil.ItemCallback<Exercise>() {

    override fun areItemsTheSame(
        oldItem: Exercise,
        newItem: Exercise
    ): Boolean = oldItem.id == newItem.id

    override fun areContentsTheSame(
        oldItem: Exercise,
        newItem: Exercise
    ): Boolean = oldItem == newItem

}) {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ExerciseItem = ExerciseItem(
        binding = ItemExerciseBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ),
        glide,
        onItemClicked,
        onDeleteClick
    )

    override fun onBindViewHolder(
        holder: ExerciseItem,
        position: Int
    ) {
        holder.onBind(currentList[position])
    }
}