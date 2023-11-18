package com.example.amphibians.network

import com.example.amphibians.model.Amphibians
import retrofit2.http.GET

interface AmphibianApiService {
    @GET("amphibians")
    suspend fun getAmphibianData(): List<Amphibians>
}