package com.example.impulse.workout

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.example.impulse.databinding.ItemWorkoutBinding

class WorkoutAdapter(
    private var list: List<Workout>,
    private var glide:RequestManager,
    private val onItemClick: (Workout)->Unit

) : RecyclerView.Adapter<WorkoutItem>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int
    ): WorkoutItem =
        WorkoutItem(
            binding = ItemWorkoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ),
            glide = glide,
            onItemClick = onItemClick,
        )

    override fun onBindViewHolder(holder: WorkoutItem, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}