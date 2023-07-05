package com.example.impulse

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.impulse.databinding.StartFragmentBinding
import com.google.android.material.textfield.TextInputLayout
import timber.log.Timber

class StartFragment : Fragment(R.layout.start_fragment) {
    private var binding: StartFragmentBinding? = null
    private var textView: TextView? = null
    private var name: EditText? = null
    private var weight: EditText? = null
    private var height: EditText? = null
    private var age: EditText? = null
    private var desiredWeidgt: EditText? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = StartFragmentBinding.bind(view)
        name = binding?.etName
        age = binding?.etAge
        height = binding?.etHeight
        weight = binding?.etWeight
        desiredWeidgt = binding?.etDesiredWeight
        textView = binding?.tvError
        binding?.run {
            button.setOnClickListener {
                val etName: String = name?.text.toString()
                val etAge: String = age?.text.toString()
                val etHeight: String = height?.text.toString()
                val etWeight: String = weight?.text.toString()
                val etDsWeight: String = desiredWeidgt?.text.toString()
                try {
                    if (etName.length >= 50 || etName == "" || etAge.toInt() !in 1..150 || etHeight.toInt() !in 0..250 || etWeight.toDouble() !in 0.0..250.0 ||
                        etDsWeight.toDouble() !in 0.0..250.0) {
                        textView?.text = "Данные введены некорректно."
                    } else {
                        findNavController().navigate(R.id.action_startFragment_to_mainFragment)
                    }
                } catch (e: NumberFormatException) {
                    textView?.text = "Данные введены некорректно."
                }
            }
        }

        name?.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable?) {
                val input = s.toString().trim()
                if (input.isEmpty()) {
                    binding!!.tiName.error = "Field cannot be empty"
                } else if (input.length > 20) {
                    binding!!.tiName.error = "Field cannot exceed 20 characters"
                } else {
                    binding!!.tiName.error = null
                }
            }
        })
        age?.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable?) {
                val age = s.toString().toIntOrNull()
                if (age != null) {
                    if (age in 1..150) {
                        binding!!.tiAge.error = null
                    } else {
                        binding!!.tiAge.error = "Введите число в диапазоне от 1 до 150"
                    }
                } else {
                    binding!!.tiAge.error = "Введите числовое значение"
                }
            }
        })
        height?.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable?) {
                val input = s.toString().toIntOrNull()
                if (input != null) {
                    if (input in (1..250)) {
                        binding!!.tiHeight.error = null
                    } else {
                        binding!!.tiHeight.error = "Введите число в диапазоне от 1 до 250"
                    }
                } else {
                    binding!!.tiHeight.error = "Введите числовое значение"
                }
            }
        })
        weight?.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable?) {
                val input = s.toString().toIntOrNull()
                if (input != null) {
                    if (input in (1..250)) {
                        binding!!.tiWeight.error = null
                    } else {
                        binding!!.tiWeight.error = "Введите число в диапазоне от 1 до 250"
                    }
                } else {
                    binding!!.tiWeight.error = "Введите числовое значение"
                }
            }
        })
        desiredWeidgt?.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable?) {
                val input = s.toString().toIntOrNull()
                if (input != null) {
                    if (input in (1..250)) {
                        binding!!.tiDesiredWeight.error = null
                    } else {
                        binding!!.tiDesiredWeight.error = "Введите число в диапазоне от 1 до 250"
                    }
                } else {
                    binding!!.tiDesiredWeight.error = "Введите числовое значение"
                }
            }
        })
    }
    
    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}