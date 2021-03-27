package com.randomchat.www.ui.launcher

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import com.randomchat.www.databinding.ActivityLauncherBinding

class LauncherActivity: AppCompatActivity(){
    private lateinit var binding: ActivityLauncherBinding
    private val navController by lazy{
        (supportFragmentManager.findFragmentById(binding.navHostFragment.id) as NavHostFragment).navController
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLauncherBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupActionBarWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}