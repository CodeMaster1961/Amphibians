package com.example.amphibians.data

import com.example.amphibians.model.Amphibians
import com.example.amphibians.network.AmphibianApiService

interface AmphibiansRepository {
    suspend fun getAmphibiansData(): List<Amphibians>
}

class NetworkAmphibiansRepository(private val amphibiansApiService: AmphibianApiService) :
    AmphibiansRepository {
    override suspend fun getAmphibiansData(): List<Amphibians> {
        return amphibiansApiService.getAmphibianData()
    }

}