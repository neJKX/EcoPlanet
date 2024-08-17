package com.app.ecoplanet.presentation.screens

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.app.ecoplanet.R
import com.app.ecoplanet.databinding.ActivitySingInUpBinding

class Sing_In_Up_Activity : AppCompatActivity() {
    lateinit var binding: ActivitySingInUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySingInUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        spinnerSettings()
    }

    private fun spinnerSettings(){
        val spinner = binding.spinner
        val countryList = resources.getStringArray(R.array.countryList)

        val adapter = ArrayAdapter(
            this,
            android.R.layout.activity_list_item,
            countryList)

        spinner.adapter = adapter
    }



}