package com.example.paginttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.paginttest.databinding.ActivityMainBinding
import com.example.viewmodel.WeatherViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private val viewModel :WeatherViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        viewModel.weatherResp.observe(this, Observer { weather->
            binding.apply {
                weatherText.text=weather.temperature
                windTv.text=weather.wind
                descriptionTv.text=weather.description
            }
        })
    }
}