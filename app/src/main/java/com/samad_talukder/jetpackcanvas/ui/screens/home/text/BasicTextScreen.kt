/**
 *  Copyright (C) 2025. Samad Talukder (https://github.com/samadtalukder/)
 */
package com.samad_talukder.jetpackcanvas.ui.screens.home.text

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.samad_talukder.jetpackcanvas.ui.theme.Black70
import com.samad_talukder.jetpackcanvas.ui.theme.ColorWhite
import com.samad_talukder.jetpackcanvas.ui.theme.Green85
import com.samad_talukder.jetpackcanvas.ui.theme.JetpackCanvasTheme
import com.samad_talukder.jetpackcanvas.ui.theme.Orange_300

@Composable
fun BasicTextScreen() {
    val loremIpsum = LoremIpsum(words = 8).values.first()

    LazyColumn(
        content = {
            item {
                Text(
                    text = "Hello, Text!",
                    modifier = Modifier.padding(
                        horizontal = 20.dp,
                        vertical = 10.dp
                    )
                )
                Text(
                    text = "Text Align Center ",
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(
                        horizontal = 20.dp,
                        vertical = 10.dp
                    )
                )

                Text(
                    text = "Text Align With Color ",
                    color = Orange_300,
                    modifier = Modifier.padding(
                        horizontal = 20.dp,
                        vertical = 10.dp
                    )
                )

                Text(
                    text = loremIpsum,
                    color = Color.Blue,
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.padding(
                        horizontal = 20.dp,
                        vertical = 10.dp
                    )
                )

                Text(
                    text = "Change Text Size",
                    fontSize = 30.sp,
                    modifier = Modifier.padding(
                        horizontal = 20.dp,
                        vertical = 10.dp
                    )
                )
                Text(
                    text = "Change Text Italic",
                    fontSize = 30.sp,
                    fontStyle = FontStyle.Italic,
                    modifier = Modifier.padding(
                        horizontal = 20.dp,
                        vertical = 10.dp
                    )
                )
                Text(
                    text = "Change Text Bold ",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(
                        horizontal = 20.dp,
                        vertical = 10.dp
                    )
                )
                Text(
                    text = "Change Text Shadow ",
                    style = TextStyle(
                        color = Orange_300,
                        fontSize = 30.sp,
                        shadow = Shadow(
                            color = Black70,
                            offset = Offset(x = 5.0f, y = 15.0f),
                            blurRadius = 3f
                        )
                    ),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(
                        horizontal = 20.dp,
                        vertical = 10.dp
                    )
                )
            }
        }
    )


}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TextComposePreview() {
    BasicTextScreen()
}