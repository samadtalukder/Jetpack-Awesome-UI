/**
 *  Copyright (C) 2025. Samad Talukder (https://github.com/samadtalukder/)
 */
package com.samad_talukder.jetpackcanvas.ui.screens.home.button

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun FilledTonalIconButtonScreen(onClick: () -> Unit) {
    FilledTonalButton(
        onClick = onClick,
        contentPadding = PaddingValues(all = 20.dp),
        elevation = ButtonDefaults.buttonElevation(defaultElevation = 5.dp),
        modifier = Modifier.padding(20.dp)
    ) {
        Text("Filled Tonal")
    }
}

@Preview
@Composable
private fun PreviewFilledTonalIconButtonScreen() {
    FilledTonalIconButtonScreen(
        onClick = {}
    )
}

