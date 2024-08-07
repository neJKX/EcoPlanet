package com.app.ecoplanet.presentation.screens

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity
import com.app.ecoplanet.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        counDownTimer()
    }

    private fun counDownTimer(){
        object : CountDownTimer(2000, 1000){
            override fun onTick(millisUntilFinished: Long) {}

            override fun onFinish() {
                val intent = Intent(this@MainActivity, Sing_In_Up_Activity::class.java)
                startActivity(intent)
            }

        }
    }

}