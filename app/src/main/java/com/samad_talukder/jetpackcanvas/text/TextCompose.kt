package com.samad_talukder.jetpackcanvas.text

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.samad_talukder.jetpackcanvas.ui.theme.JetpackCanvasTheme

@Composable
fun TextCompose() {

    LazyColumn(
        content = {
            item {
                ShowText()
                ShowTextWithTextAlignCenter()
                ShowTextWithTextAlignEnd()
                ShowTextWithTextAlignJustify()
                ShowTextWithColor()
                ShowTextWithModifier()
            }
        }
    )


}

@Composable
fun ShowText() {
    Text(
        text = "Hello ",
    )
}

@Composable
fun ShowTextWithTextAlignCenter() {
    Text(
        text = "Hello ",
        textAlign = TextAlign.Center
    )
}

@Composable
fun ShowTextWithTextAlignEnd() {
    Text(
        text = "Hello ",
        textAlign = TextAlign.End
    )
}

@Composable
fun ShowTextWithTextAlignJustify() {
    Text(
        text = "Hello ",
        textAlign = TextAlign.Justify,
    )
}

@Composable
fun ShowTextWithColor() {
    Text(
        text = "Hello ",
        textAlign = TextAlign.Justify,
        color = Color(0xFFC43737)
    )
}

@Composable
fun ShowTextWithModifier() {
    Text(
        text = "Hello ",
        textAlign = TextAlign.Justify,

        color = Color.Blue
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TextComposePreview() {
    JetpackCanvasTheme {
        TextCompose()
    }
}