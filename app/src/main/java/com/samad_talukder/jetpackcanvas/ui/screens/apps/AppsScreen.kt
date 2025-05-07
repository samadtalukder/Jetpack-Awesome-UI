/**
 *  Copyright (C) 2025. Samad Talukder (https://github.com/samadtalukder/)
 */
package com.samad_talukder.jetpackcanvas.ui.screens.apps

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign

@Composable
fun AppsScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Apps Screen\nComing Soon",
            textAlign = TextAlign.Center
        )
    }
}