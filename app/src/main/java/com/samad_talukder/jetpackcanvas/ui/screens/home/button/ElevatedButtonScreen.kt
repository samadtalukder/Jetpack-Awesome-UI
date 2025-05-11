/**
 *  Copyright (C) 2025. Samad Talukder (https://github.com/samadtalukder/)
 */
package com.samad_talukder.jetpackcanvas.ui.screens.home.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.samad_talukder.jetpackcanvas.ui.components.CustomText
import com.samad_talukder.jetpackcanvas.ui.theme.ColorBlack
import com.samad_talukder.jetpackcanvas.ui.theme.ColorWhite
import com.samad_talukder.jetpackcanvas.ui.theme.Orange_300
import com.samad_talukder.jetpackcanvas.ui.theme.Purple40

@Composable
fun ElevatedButtonScreen(onBtnClick: () -> Unit) {

    ElevatedButton(
        onClick = onBtnClick,
        colors = ButtonColors(
            containerColor = Orange_300,
            contentColor = ColorWhite,
            disabledContentColor = ColorBlack,
            disabledContainerColor = ColorBlack
        ),
        border = BorderStroke(width = 2.dp, color = Purple40),
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 6.dp
        ),
        modifier = Modifier.padding(20.dp)
    ) {
        CustomText(text = "Elevated Button")
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewElevatedButtonScreen() {
    ElevatedButtonScreen {}
}