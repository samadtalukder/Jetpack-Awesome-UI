/**
 *  Copyright (C) 2025. Samad Talukder (https://github.com/samadtalukder/)
 */
package com.samad_talukder.jetpackcanvas.ui.screens.home.button

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Paid
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.samad_talukder.jetpackcanvas.ui.components.CustomText
import com.samad_talukder.jetpackcanvas.ui.theme.ColorBlack
import com.samad_talukder.jetpackcanvas.ui.theme.ColorWhite
import com.samad_talukder.jetpackcanvas.ui.theme.Orange_300

@Composable
fun IconButtonScreen(onBtnClick: () -> Unit) {

    IconButton(
        onClick = onBtnClick,
        colors = IconButtonColors(
            containerColor = Orange_300,
            contentColor = ColorWhite,
            disabledContentColor = ColorBlack,
            disabledContainerColor = ColorBlack
        ),
        modifier = Modifier.padding(20.dp)
    ) {
        Row {
            Icon(
                imageVector = Icons.Outlined.Paid,
                contentDescription = "",
                modifier = Modifier.size(24.dp)
            )
            Spacer(Modifier.width(8.dp))
            CustomText(text = "Icon")
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewIconButtonScreen() {
    IconButtonScreen {}
}