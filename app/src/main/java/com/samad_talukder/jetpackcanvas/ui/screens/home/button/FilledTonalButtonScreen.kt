/**
 *  Copyright (C) 2025. Samad Talukder (https://github.com/samadtalukder/)
 */
package com.samad_talukder.jetpackcanvas.ui.screens.home.button

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FilledTonalButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.samad_talukder.jetpackcanvas.ui.components.CustomText

@Composable
fun FilledTonalButtonScreen(onBtnClick: () -> Unit) {
    FilledTonalButton(
        onClick = onBtnClick,
        contentPadding = PaddingValues(all = 20.dp),
        elevation = ButtonDefaults.buttonElevation(defaultElevation = 5.dp),
        modifier = Modifier.padding(20.dp)
    ) {
        CustomText(text = "Filled Tonal Button")
    }
}

@Preview
@Composable
private fun PreviewFilledTonalButtonScreen() {
    FilledTonalButtonScreen {}
}