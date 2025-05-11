/**
 *  Copyright (C) 2025. Samad Talukder (https://github.com/samadtalukder/)
 */
package com.samad_talukder.jetpackcanvas.ui.screens.home.text

import android.util.Log
import androidx.compose.foundation.text.ClickableText
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import com.samad_talukder.jetpackcanvas.ui.theme.Teal80

@Composable
fun TextLinkScreen() {
    val annotatedText = buildAnnotatedString {
        append("By clicking Join Jetpack Awesome UI, you are agreeing to the ")

        pushStringAnnotation(tag = "URL", annotation = "https://developer.android.com")

        withStyle(
            style = SpanStyle(
                color = Teal80,
                fontWeight = FontWeight.Bold
            )
        ) {
            append("Terms of Use ")
        }

        pop()

        append(" and the ")

        pushStringAnnotation(
            tag = "URL",
            annotation = "https://developer.android.com/jetpack/compose"
        )

        withStyle(
            style = SpanStyle(
                color = Teal80,
                fontWeight = FontWeight.Bold
            )
        ) {
            append(" Privacy Policy")
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

@Preview(showBackground = true)
@Composable
private fun PreviewDisplayMultipleLinks() {
    TextLinkScreen()
}