package com.example.impulse

import android.content.Context
import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.impulse.databinding.CaloriesFragmentBinding


class CaloriesFragment : Fragment(R.layout.calories_fragment) {
    private var binding: CaloriesFragmentBinding? = null

    val sharedPref = activity?.getPreferences(Context.MODE_PRIVATE)
    val age = sharedPref?.getString("Age", "")
    val height = sharedPref?.getString("Height", "")
    val weight = sharedPref?.getString("Weight", "")
    val dsWeight = sharedPref?.getString("DesiredWeight", "")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = CaloriesFragmentBinding.bind(view)

        binding?.btnBreakfast?.setOnClickListener{
            findNavController().navigate(R.id.action_caloriesFragment_to_recipesFragment,
                createBundle(1)
            )
        }
        binding?.btnLunch?.setOnClickListener{
            findNavController().navigate(R.id.action_caloriesFragment_to_recipesFragment,
                createBundle(2)
            )
        }
        binding?.btnSnack?.setOnClickListener{
            findNavController().navigate(R.id.action_caloriesFragment_to_recipesFragment,
                createBundle(3)
            )
        }
        binding?.btnDinner?.setOnClickListener{
            findNavController().navigate(R.id.action_caloriesFragment_to_recipesFragment,
                createBundle(4)
            )
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
    companion object{
        fun createBundle(id:Int):Bundle{
            val bundle = Bundle()
            bundle.putInt("CLASS_NAME",id)
            return bundle
        }
    }
}