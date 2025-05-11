/**
 *  Copyright (C) 2025. Samad Talukder (https://github.com/samadtalukder/)
 */
package com.samad_talukder.jetpackcanvas.ui.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import com.samad_talukder.jetpackcanvas.ui.theme.NunitoFont

@Composable
fun CustomText(
    modifier: Modifier = Modifier,
    text: String,
    textColor: Color = Color.Unspecified,
    textDecoration: TextDecoration = TextDecoration.None,
    fontSize: TextUnit = MaterialTheme.typography.bodyMedium.fontSize,
    fontWeight: FontWeight = FontWeight.Normal,
    textAlign: TextAlign = TextAlign.Start,
    maxLine:Int = 1,
    overflow: TextOverflow = TextOverflow.Visible
) {
    Text(
        text = text,
        modifier = modifier,
        style = TextStyle(
            color = textColor,
            fontSize = fontSize,
            fontFamily = NunitoFont,
            fontWeight = fontWeight,
            textAlign = textAlign,
            textDecoration = textDecoration,
        ),
        maxLines = maxLine,
        overflow = overflow
    )
}