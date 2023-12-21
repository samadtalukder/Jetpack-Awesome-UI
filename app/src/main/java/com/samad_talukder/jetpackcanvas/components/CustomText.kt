package com.samad_talukder.jetpackcanvas.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomText(
    value: String,
    modifier: Modifier = Modifier,
    isSingleLine: Boolean = false,
    textColor: Color,
    fontSize: TextUnit = 12.sp,
    fontFamily: FontFamily,
    fontWeight: FontWeight = FontWeight(400),
    textAlign: TextAlign = TextAlign.Start,
    textDecoration: TextDecoration = TextDecoration.None,
) {
    Text(
        text = value,
        modifier = modifier,
        style = TextStyle(
            color = textColor,
            fontSize = fontSize,
            fontFamily = fontFamily,
            fontWeight = fontWeight,
            textAlign = textAlign,
            textDecoration = textDecoration,
        )
    )
}