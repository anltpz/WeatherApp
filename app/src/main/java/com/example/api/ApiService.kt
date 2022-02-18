package com.example.api


import com.example.data.Weather
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("weather/edirne")
    suspend fun getWeather():Response<Weather>

}