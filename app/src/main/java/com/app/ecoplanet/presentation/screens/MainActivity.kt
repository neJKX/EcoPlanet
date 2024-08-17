package com.app.ecoplanet.presentation.screens

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity
import com.app.ecoplanet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    private var splashTime = 2000L
    private var timeStep = 1000L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        counDownTimer(splashTime, timeStep)
    }

    private fun counDownTimer(splashTime : Long, timeStep: Long){
        object : CountDownTimer(splashTime, timeStep){
            override fun onTick(millisUntilFinished: Long) {}
            override fun onFinish() {
                val intent = Intent(
                    this@MainActivity,
                    Sing_In_Up_Activity::class.java)
                startActivity(intent)
            }

        }
    }

}