package com.example.impulse.calories

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.impulse.R
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
        val sharedPref = activity?.getPreferences(Context.MODE_PRIVATE)
        val age = sharedPref?.getString("Age", "")?.toInt()
        val height = sharedPref?.getString("Height", "")?.toInt()
        val weight = sharedPref?.getString("Weight", "")?.toDouble()
        val dsWeight = sharedPref?.getString("DesiredWeight", "")?.toDouble()
        binding = CaloriesFragmentBinding.bind(view)
        if(age!=null && height!=null && weight!=null && dsWeight!=null){
            binding?.tvWaterValue?.text = (weight*35/1000).toString()+" litres"
            var cal =  10*weight + 6.25*height -5*age -161
            if (dsWeight>weight){
                cal = (cal*1.35)/1
            }
            if (dsWeight==weight) {
                cal = (cal * 1.15)/1
            }
            val intcal:Int = cal.toInt()
            binding?.tvCaloriesValue?.text = intcal.toString() + " kcal"
        }
        binding?.btnBreakfast?.setOnClickListener{
            findNavController().navigate(
                R.id.action_caloriesFragment_to_recipesFragment,
                createBundle(1)
            )
        }
        binding?.btnLunch?.setOnClickListener{
            findNavController().navigate(
                R.id.action_caloriesFragment_to_recipesFragment,
                createBundle(2)
            )
        }
        binding?.btnSnack?.setOnClickListener{
            findNavController().navigate(
                R.id.action_caloriesFragment_to_recipesFragment,
                createBundle(3)
            )
        }
        binding?.btnDinner?.setOnClickListener{
            findNavController().navigate(
                R.id.action_caloriesFragment_to_recipesFragment,
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
