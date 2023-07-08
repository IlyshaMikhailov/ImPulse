package com.example.impulse

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.example.impulse.databinding.ItemExerciseBinding

class ExerciseAdapter(
    private var hashSet: HashSet<Exercise>,
    private var glide: RequestManager,
    private val onItemClick: (Exercise) -> Unit,

) : RecyclerView.Adapter<ExerciseItem>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ExerciseItem = ExerciseItem(
        binding = ItemExerciseBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ),
        glide = glide,
        onItemClick = onItemClick,
    )

    override fun onBindViewHolder(holder: ExerciseItem, position: Int) {
        holder.onBind(hashSet.elementAt(position))
    }


    override fun getItemCount(): Int {
        return hashSet.size
    }
}