package com.example.amphibians.ui.screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class AmphibiansViewModel : ViewModel() {
    var amphibiansUiState by mutableStateOf("")
        private set
}