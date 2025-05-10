/**
 *  Copyright (C) 2025. Samad Talukder (https://github.com/samadtalukder/)
 */
package com.samad_talukder.jetpackcanvas.ui.screens.home.button

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.samad_talukder.jetpackcanvas.ui.components.CustomText
import com.samad_talukder.jetpackcanvas.ui.theme.ColorWhite
import com.samad_talukder.jetpackcanvas.ui.theme.Orange_300

@Composable
fun FloatingActionButtonScreen(onBtnClick: () -> Unit) {

    Column {
        FloatingActionButton(
            containerColor = Orange_300,
            contentColor = ColorWhite,
            onClick = onBtnClick,
            modifier = Modifier.padding(20.dp)
        ) {
            Icon(Icons.Filled.Add, "Floating action button.")
        }

        SmallFloatingActionButton(
            shape = CutCornerShape(20.dp),
            containerColor = Orange_300,
            contentColor = ColorWhite,
            elevation = FloatingActionButtonDefaults.elevation(
                defaultElevation = 6.dp
            ),
            onClick = onBtnClick,
        ) {
            Icon(Icons.Filled.Add, "Floating action button.")
        }

        LargeFloatingActionButton(
            shape = CircleShape,
            containerColor = Orange_300,
            contentColor = ColorWhite,
            elevation = FloatingActionButtonDefaults.elevation(
                defaultElevation = 6.dp
            ),
            onClick = onBtnClick,
        ) {
            Icon(Icons.Filled.Add, "Floating action button.")
        }

        Spacer(modifier = Modifier.height(10.dp))

        ExtendedFloatingActionButton(
            text = { CustomText(text = "Extended FAB") },
            icon = { Icon(Icons.Filled.Edit, contentDescription = null) },
            shape = CircleShape,
            containerColor = Orange_300,
            contentColor = ColorWhite,
            elevation = FloatingActionButtonDefaults.elevation(
                defaultElevation = 6.dp
            ),
            onClick = onBtnClick,
        )
    }

}

@Preview(showBackground = true)
@Composable
private fun PreviewFloatingActionButtonScreen() {
    FloatingActionButtonScreen {}
}