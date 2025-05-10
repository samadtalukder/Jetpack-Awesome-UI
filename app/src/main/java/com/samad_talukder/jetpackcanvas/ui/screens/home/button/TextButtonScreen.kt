/**
 *  Copyright (C) 2025. Samad Talukder (https://github.com/samadtalukder/)
 */
package com.samad_talukder.jetpackcanvas.ui.screens.home.button

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.FilledTonalIconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.samad_talukder.jetpackcanvas.ui.theme.ColorBlack
import com.samad_talukder.jetpackcanvas.ui.theme.ColorWhite
import com.samad_talukder.jetpackcanvas.ui.theme.Orange_300
import com.samad_talukder.jetpackcanvas.ui.theme.Purple40
import com.samad_talukder.jetpackcanvas.utils.showToast

@Composable
fun TextButtonScreen(onBtnClick: () -> Unit) {

    TextButton(
        onClick = onBtnClick,
        modifier = Modifier.padding(20.dp)
    ) {
        Text(text = "Text Button")
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewTextButtonScreen() {
    TextButtonScreen {}
}