package com.samad_talukder.jetpackcanvas.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun CustomBreak(
    width: Dp = 0.dp,
    height: Dp = 0.dp,
) {
    Spacer(
        modifier = Modifier
            .height(height = height)
            .width(width)
    )
}