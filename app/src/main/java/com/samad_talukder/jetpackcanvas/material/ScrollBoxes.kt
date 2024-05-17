package com.samad_talukder.jetpackcanvas.material

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ScrollBoxes(modifier: Modifier) {
    Column(
        modifier = Modifier
            .background(Color.White)
            .size(200.dp)
            .verticalScroll(rememberScrollState())
    ) {
        repeat(100) {
            Text(text = "Item $it", modifier = Modifier.padding(2.dp))
        }
    }
}