package com.example.impulse.workout.info

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.example.impulse.R
import com.example.impulse.databinding.InfoFragmentBinding
import com.example.impulse.workout.exercise.Exercise
import com.example.impulse.workout.exercise.ExerciseRepository

class InfoFragment : Fragment(R.layout.info_fragment) {
    private var binding: InfoFragmentBinding? = null
    private val options: RequestOptions = RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.ALL)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = InfoFragmentBinding.bind(view)
        binding?.imBtnBack?.setOnClickListener {
            findNavController().navigateUp()
        }
        val exercise = getInfo()
        setInfo(exercise)
        setGif(exercise)
    }

    private fun getInfo(): Exercise {
        val title = arguments?.getInt(ARG_ID)
        return ExerciseRepository.list.single { it.id == title }
    }

    private fun setInfo(exercise: Exercise) {

        binding?.desc?.text = "Exercise description: ${exercise.description}"
        binding?.title?.text = "${exercise.title}"

    }

    private fun setGif(exercise: Exercise) {
        binding?.imageView?.let {
            Glide.with(this)
                .load(exercise.gif)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.error)
                .apply(options)
                .into(binding!!.imageView)
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    companion object {

        private const val ARG_ID = "ARG_ID"

        fun createBundle(id: Int) = Bundle().apply {
            putInt(ARG_ID, id)
        }
    }
}