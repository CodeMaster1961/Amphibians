package com.example.amphibians.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun HomeScreen(amphibiansUiState: AmphibiansUiState, modifier: Modifier = Modifier) {
    when (amphibiansUiState) {
        is AmphibiansUiState.Loading ->
    }
}

@Composable
fun LoadingScreen(modifier: Modifier = Modifier) {

}