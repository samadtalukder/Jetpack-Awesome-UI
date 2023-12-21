package com.samad_talukder.jetpackcanvas.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun CustomRoundedButton(
    btnText: String,
    modifier: Modifier = Modifier,
    btnElevation: Dp,
    fontSize: TextUnit,
    fontFamily: FontFamily,
    containerColor: Color = Color.White,
    contentColor: Color = Color.White,
    textColor: Color = Color.White,
    onBtnClick: () -> Unit,
) {
    Button(
        onClick = { onBtnClick.invoke() },
        modifier = modifier,
        elevation = ButtonDefaults.buttonElevation(btnElevation),
        colors = ButtonDefaults.buttonColors(
            containerColor = containerColor,
            contentColor = contentColor
        )
    ) {
        Text(
            text = btnText,
            style = TextStyle(
                fontSize = fontSize,
                lineHeight = 16.sp,
                fontFamily = fontFamily,
                fontWeight = FontWeight(400),
                color = textColor,
                textAlign = TextAlign.Center,
                letterSpacing = 0.8.sp,
            )
        )
    }
}