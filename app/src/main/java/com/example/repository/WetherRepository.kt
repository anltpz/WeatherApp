package com.example.repository

import androidx.core.location.GnssStatusCompat
import com.example.api.ApiService
import javax.inject.Inject

class WetherRepository @Inject constructor(private val apiService: ApiService) {


    suspend fun getWeather ()=apiService.getWeather()


}