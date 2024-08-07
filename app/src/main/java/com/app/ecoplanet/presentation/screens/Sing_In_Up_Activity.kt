package com.app.ecoplanet.presentation.screens

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.app.ecoplanet.databinding.ActivitySingInUpBinding

class Sing_In_Up_Activity : AppCompatActivity() {
    lateinit var binding: ActivitySingInUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySingInUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


}