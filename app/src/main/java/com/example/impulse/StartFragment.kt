package com.example.impulse

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.impulse.databinding.StartFragmentBinding
import com.google.android.material.textfield.TextInputEditText

class StartFragment : Fragment(R.layout.start_fragment) {
    private var binding: StartFragmentBinding? = null
    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = StartFragmentBinding.bind(view)
        val name = binding?.etName
        val age = binding?.etAge
        val height = binding?.etHeight
        val weight = binding?.etWeight
        val desiredWeight = binding?.etDesiredWeight
        val textView = binding?.tvError
        val sharedPref = activity?.getPreferences(Context.MODE_PRIVATE)
        if (sharedPref?.getBoolean("Key", false) == true) {
            findNavController().navigate(R.id.action_startFragment_to_workoutFragment)
        }
        addTextChangedListenerForName(name)
        addTextChangedListenerForAge(age)
        addTextChangedListenerForHeight(height)
        addTextChangedListenerForWeight(weight)
        addTextChangedListenerForDesiredWeight(desiredWeight)
        binding?.run {
            button.setOnClickListener {
                val etName = name?.text.toString()
                val etAge = age?.text.toString()
                val etHeight = height?.text.toString()
                val etWeight = weight?.text.toString()
                val etDsWeight = desiredWeight?.text.toString()
                try {
                    if (validateFields(etName, etAge, etHeight, etWeight, etDsWeight)) {
                        val editor = sharedPref?.edit()
                        editor?.putString("Name", etName)
                        editor?.putString("Height", etHeight)
                        editor?.putString("Age", etAge)
                        editor?.putString("Weight", etWeight)
                        editor?.putString("DesiredWeight", etDsWeight)
                        editor?.putBoolean("Key", true)
                        editor?.apply()
                        findNavController().navigate(R.id.action_startFragment_to_workoutFragment)

                    } else {
                        textView?.text = "Data entered incorrectly."
                    }
                } catch (e: NumberFormatException) {
                    textView?.text = "Data entered incorrectly."
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    private fun validateFields(
        name: String?,
        age: String?,
        height: String?,
        weight: String?,
        dsWeight: String?,
    ): Boolean {
        if (name.isNullOrEmpty() || name.length > 20 || !name[0].isUpperCase()) {
            return false
        }
        if (age.isNullOrEmpty() || age.toInt() !in 1..150) {
            return false
        }
        if (height.isNullOrEmpty() || height.toInt() !in 0..250) {
            return false
        }
        if (weight.isNullOrEmpty() || weight.toDouble() !in 0.0..250.0) {
            return false
        }
        if (dsWeight.isNullOrEmpty() || dsWeight.toDouble() !in 0.0..250.0) {
            return false
        }
        return true
    }

    private fun addTextChangedListenerForName(name: TextInputEditText?) {
        name?.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable?) {
                val input = s.toString()
                if (input.isEmpty()) {
                    binding!!.tiName.error = "Enter a string value"
                } else if (input.length > 20) {
                    binding!!.tiName.error = "Field cannot exceed 20 characters"
                } else if (!input[0].isUpperCase()) {
                    binding!!.tiName.error = "The name must begin with a capital letter"
                } else {
                    binding!!.tiName.error = null
                }
            }
        })
    }

    private fun addTextChangedListenerForAge(age: TextInputEditText?) {
        age?.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable?) {
                val age = s.toString().toIntOrNull()
                if (age != null) {
                    if (age in 1..150) {
                        binding!!.tiAge.error = null
                    } else {
                        binding!!.tiAge.error = "Enter a number in the range from 1 to 150"
                    }
                } else {
                    binding!!.tiAge.error = "Enter a numeric value"
                }
            }
        })
    }

    private fun addTextChangedListenerForHeight(height: TextInputEditText?) {
        height?.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable?) {
                val input = s.toString().toIntOrNull()
                if (input != null) {
                    if (input in (1..250)) {
                        binding!!.tiHeight.error = null
                    } else {
                        binding!!.tiHeight.error = "Enter a number in the range from 1 to 250"
                    }
                } else {
                    binding!!.tiHeight.error = "Enter a numeric value"
                }
            }
        })
    }

    private fun addTextChangedListenerForWeight(weight: TextInputEditText?) {
        weight?.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable?) {
                val input = s.toString().toDoubleOrNull()
                if (input != null) {
                    if (input in (1.0..250.0)) {
                        binding!!.tiWeight.error = null
                    } else {
                        binding!!.tiWeight.error = "Enter a number in the range from 1 to 250"
                    }
                } else {
                    binding!!.tiWeight.error = "Enter a numeric value"
                }
            }
        })
    }

    private fun addTextChangedListenerForDesiredWeight(desiredWeight: TextInputEditText?) {
        desiredWeight?.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable?) {
                val input = s.toString().toDoubleOrNull()
                if (input != null) {
                    if (input in (1.0..250.0)) {
                        binding!!.tiDesiredWeight.error = null
                    } else {
                        binding!!.tiDesiredWeight.error =
                            "Enter a number in the range from 1 to 250"
                    }
                } else {
                    binding!!.tiDesiredWeight.error = "Enter a numeric value"
                }
            }
        })
    }
}