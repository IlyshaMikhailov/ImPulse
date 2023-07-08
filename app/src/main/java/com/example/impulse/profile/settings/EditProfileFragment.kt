package com.example.impulse

import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.impulse.R
import com.example.impulse.databinding.EditProfileFraagmentBinding
import com.example.impulse.databinding.SettingsFragmentBinding
import com.google.android.material.snackbar.Snackbar

class EditProfileFragment : Fragment(R.layout.edit_profile_fraagment) {
    private var binding: EditProfileFraagmentBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = EditProfileFraagmentBinding.bind(view)
        val name = binding?.etName
        val age = binding?.etAge
        val height = binding?.etHeight
        val weight = binding?.etWeight
        val desiredWeight = binding?.etDesiredWeight

        val sharedPref = activity?.getPreferences(Context.MODE_PRIVATE)
        val shareName = sharedPref?.getString("Name", "")
        val shareAge = sharedPref?.getString("Age", "")
        val shareHeight = sharedPref?.getString("Height", "")
        val shareWeight = sharedPref?.getString("Weight", "")
        val shareDsWeight = sharedPref?.getString("DesiredWeight", "")

        binding!!.etName.setText(shareName)
        binding!!.etAge.setText(shareAge)
        binding!!.etHeight.setText(shareHeight)
        binding!!.etWeight.setText(shareWeight)
        binding!!.etDesiredWeight.setText(shareDsWeight)


        binding?.run {
            imBtnBack.setOnClickListener {
                findNavController().navigateUp()
            }
            btnToChange.setOnClickListener {
                val etName: String = name?.text.toString()
                val etAge = age?.text.toString()
                val etHeight = height?.text.toString()
                val etWeight = weight?.text.toString()
                val etDsWeight = desiredWeight?.text.toString()
                if (StartFragment.validateFields(etName, etAge, etHeight, etWeight, etDsWeight)) {
                    val editor = sharedPref?.edit()
                    editor?.putString("Name", etName)
                    editor?.putString("Height", etHeight)
                    editor?.putString("Age", etAge)
                    editor?.putString("Weight", etWeight)
                    editor?.putString("DesiredWeight", etDsWeight)
                    editor?.apply()
                    findNavController().navigate(R.id.action_editProfileFragment_to_profileFragment)
                }else{
                    Snackbar.make(view, "Data entered incorrectly.", Snackbar.LENGTH_SHORT).show();
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}