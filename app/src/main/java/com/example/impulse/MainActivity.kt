package com.example.impulse

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.example.impulse.databinding.ActivityMainBinding
import com.example.impulse.workout.exercise.ExerciseRepository
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null
    private var repository: ExerciseRepository? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val newBinding = ActivityMainBinding.inflate(layoutInflater)
        binding = newBinding
        setContentView(newBinding.root)
        val controller =
            (supportFragmentManager.findFragmentById(R.id.container) as NavHostFragment)
                .navController
        findViewById<BottomNavigationView>(R.id.bnv_main).apply {
            setupWithNavController(controller)
        }
        binding?.bnvMain?.setOnItemSelectedListener { item ->
            NavigationUI.onNavDestinationSelected(item, controller)
            return@setOnItemSelectedListener true
        }
        controller.addOnDestinationChangedListener { _, destination, _ ->
            if (destination.id == R.id.startFragment) {

                findViewById<BottomNavigationView>(R.id.bnv_main).visibility = View.GONE
            } else {

                findViewById<BottomNavigationView>(R.id.bnv_main).visibility = View.VISIBLE
            }

        }
    }

    override fun onDestroy() {
        super.onDestroy()
        repository = null

    }

}