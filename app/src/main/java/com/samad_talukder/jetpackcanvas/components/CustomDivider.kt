package com.samad_talukder.jetpackcanvas.components

import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp

@Composable
fun CustomDivider(
    color: Color,
    width: Dp,
    thickness: Dp,
) {
    Divider(
        color = Color(0xFFEEEFF2),
        thickness = thickness,
        modifier = Modifier
            .width(width)
    )
}