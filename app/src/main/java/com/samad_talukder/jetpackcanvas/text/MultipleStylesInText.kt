package com.samad_talukder.jetpackcanvas.text

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle


@Composable
fun MultipleStylesInText() {
    Text(buildAnnotatedString {
        withStyle(style = SpanStyle(color = Color.Blue)){
            append("H")
        }
        append("ello")

        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, color = Color.Red)){
            append("W")
        }
        append("orld")
    })


}
