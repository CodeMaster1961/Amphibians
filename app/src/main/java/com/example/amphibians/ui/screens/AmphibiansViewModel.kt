package com.example.amphibians.ui.screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.amphibians.model.Amphibians

sealed interface AmphibiansUiState {
    data class Success(val photos: List<Amphibians>) : AmphibiansUiState
    object Error : AmphibiansUiState
    object Loading : AmphibiansUiState
}

class AmphibiansViewModel : ViewModel() {
    var amphibiansUiState by mutableStateOf("")
        private set
}