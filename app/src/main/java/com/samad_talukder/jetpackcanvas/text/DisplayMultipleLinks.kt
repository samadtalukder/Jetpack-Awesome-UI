package com.samad_talukder.jetpackcanvas.text

import android.util.Log
import androidx.compose.foundation.text.ClickableText
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle

@Composable
fun DisplayMultipleLinks() {
    val annotatedText = buildAnnotatedString {
        append("Go To ")

        pushStringAnnotation(tag = "URL", annotation = "https://developer.android.com")

        withStyle(
            style = SpanStyle(
                color = Color.Green,
                fontWeight = FontWeight.Bold
            )
        ) {
            append("Android Developers ")
        }

        pop()

        append(" and check the ")

        pushStringAnnotation(
            tag = "URL",
            annotation = "https://developer.android.com/jetpack/compose"
        )

        withStyle(
            style = SpanStyle(
                color = Color.Blue,
                fontWeight = FontWeight.Bold
            )
        ) {
            append("Compose Guidelines")
        }

        pop()

    }

    ClickableText(
        text = annotatedText,
        onClick = { offset ->
            annotatedText.getStringAnnotations(
                tag = "url",
                start = offset,
                end = offset
            ).firstOrNull()?.let { annotation ->
                Log.e("URL", "DisplayMultipleLinks: ${annotation.item}")
            }
        }
    )
}