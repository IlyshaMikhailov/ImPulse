package com.example.impulse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val controller =
            (supportFragmentManager.findFragmentById(R.id.container) as NavHostFragment)
                .navController
        findViewById<BottomNavigationView>(R.id.bnv_main).apply {
            setupWithNavController(controller)
        }
        controller.addOnDestinationChangedListener { _, destination, _ ->
            if(destination.id == R.id.startFragment) {

                findViewById<BottomNavigationView>(R.id.bnv_main).visibility = View.GONE
            } else {

                findViewById<BottomNavigationView>(R.id.bnv_main).visibility = View.VISIBLE
            }
        }
    }
}