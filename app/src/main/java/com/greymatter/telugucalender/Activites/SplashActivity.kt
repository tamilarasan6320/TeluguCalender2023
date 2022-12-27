package com.greymatter.telugucalender.Activites

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import com.greymatter.telugucalender.MainActivity
import com.greymatter.telugucalender.R
import com.greymatter.telugucalender.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding :ActivitySplashBinding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.ProgressBar.visibility = View.VISIBLE
        Handler().postDelayed(Runnable {
            startActivity(Intent(this@SplashActivity,HomeActivity::class.java))
            finish()
        },5000)
    }
}