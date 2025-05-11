/**
 *  Copyright (C) 2025. Samad Talukder (https://github.com/samadtalukder/)
 */
package com.samad_talukder.jetpackcanvas.ui.screens.home.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.samad_talukder.jetpackcanvas.ui.components.CustomText
import com.samad_talukder.jetpackcanvas.ui.theme.Black70
import com.samad_talukder.jetpackcanvas.ui.theme.ColorBlack
import com.samad_talukder.jetpackcanvas.ui.theme.ColorWhite
import com.samad_talukder.jetpackcanvas.ui.theme.Orange_300

@Composable
fun BasicButtonScreen(onBtnClick: () -> Unit) {
    val interactionSource = remember { MutableInteractionSource() }
    val pressState = interactionSource.collectIsPressedAsState()
    val bgColor = if (pressState.value) Black70 else Orange_300

    LazyColumn(
        content = {
            item {
                Button(
                    onClick = { onBtnClick() },
                    modifier = Modifier.padding(horizontal = 20.dp, vertical = 10.dp)
                ) {
                    CustomText(text = "Simple Button")
                }

                Button(
                    onClick = { onBtnClick() },
                    modifier = Modifier.padding(horizontal = 20.dp, vertical = 10.dp),
                    shape = RectangleShape
                ) {
                    CustomText(text = "Button Shape")
                }

                Button(
                    onClick = { onBtnClick() },
                    modifier = Modifier.padding(horizontal = 20.dp, vertical = 10.dp),
                    shape = CutCornerShape(10.dp, 10.dp, 10.dp, 10.dp)
                ) {
                    CustomText(text = "Button CutCornerShape")
                }
                Button(
                    onClick = { onBtnClick() },
                    modifier = Modifier.padding(horizontal = 20.dp, vertical = 10.dp),
                    shape = AbsoluteRoundedCornerShape(10.dp, 0.dp, 31.dp, 6.dp)
                ) {
                    CustomText(text = "Button AbsoluteRoundedCornerShape")
                }

                Button(
                    onClick = { onBtnClick() },
                    modifier = Modifier.padding(horizontal = 20.dp, vertical = 10.dp),
                    border = BorderStroke(width = 3.dp, color = Orange_300),
                ) {
                    CustomText(text = "Button Border")
                }


                Button(
                    onClick = { onBtnClick() },
                    modifier = Modifier.padding(horizontal = 20.dp, vertical = 10.dp),
                    elevation = ButtonDefaults.buttonElevation(
                        defaultElevation = 6.dp
                    ),
                ) {
                    CustomText(text = "Button Elevation")
                }

                Button(
                    onClick = { onBtnClick() },
                    modifier = Modifier.padding(horizontal = 20.dp, vertical = 10.dp),
                    colors = ButtonColors(
                        containerColor = Orange_300,
                        contentColor = ColorWhite,
                        disabledContentColor = ColorBlack,
                        disabledContainerColor = ColorBlack
                    ),
                ) {
                    CustomText(text = "Button Colors")
                }


                Button(
                    onClick = { onBtnClick() },
                    modifier = Modifier.padding(horizontal = 20.dp, vertical = 10.dp),
                    interactionSource = interactionSource,
                    colors = ButtonDefaults.buttonColors(containerColor = bgColor)
                ) {
                    CustomText(text = if (pressState.value) "Button Pressed" else "Button Not Pressed")
                }

                Button(
                    onClick = { onBtnClick() },
                    modifier = Modifier.padding(horizontal = 20.dp, vertical = 10.dp),
                    enabled = false
                ) {
                    CustomText(text = "Button Disabled")
                }
            }

        }
    )
}

@Preview(showBackground = true)
@Composable
private fun PreviewSimpleButtonScreen() {
    BasicButtonScreen {}
}