/**
 *  Copyright (C) 2025. Samad Talukder (https://github.com/samadtalukder/)
 */
package com.samad_talukder.jetpackcanvas.ui.screens.home.text

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import com.samad_talukder.jetpackcanvas.ui.theme.Green85
import com.samad_talukder.jetpackcanvas.ui.theme.Orange500

@Composable
fun MultipleTextStyleScreen() {
    Text(buildAnnotatedString {
        withStyle(
            style =
                SpanStyle(color = Green85)
        ) {
            append("H")
        }
        append("ello")

        withStyle(
            style = SpanStyle(
                fontWeight = FontWeight.Bold,
                color = Orange500
            )
        ) {
            append("W")
        }
        append("orld")
    })
}

@Preview(showBackground = true)
@Composable
private fun PreviewMultipleStylesInText() {
    MultipleTextStyleScreen()
}
