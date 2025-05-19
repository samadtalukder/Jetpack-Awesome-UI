/**
 *  Copyright (C) 2025. Samad Talukder (https://github.com/samadtalukder/)
 */
package com.samad_talukder.jetpackcanvas.ui.screens.home.animation

import androidx.compose.animation.animateColor
import androidx.compose.animation.core.animateDp
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.samad_talukder.jetpackcanvas.ui.screens.home.animation.enums.BoxType
import com.samad_talukder.jetpackcanvas.ui.theme.AccentOrange
import com.samad_talukder.jetpackcanvas.ui.theme.Alert_Success
import com.samad_talukder.jetpackcanvas.ui.theme.ColorWhite
import com.samad_talukder.jetpackcanvas.ui.theme.OrangeTextColor
import com.samad_talukder.jetpackcanvas.ui.theme.Purple80

@Composable
fun TransitionScreen() {
    SwitchState()
    MultiStateTransition()
}

@Composable
fun MultiStateTransition() {
    var boxState by remember { mutableStateOf(BoxType.SMALL) }
    val transition = updateTransition(targetState = boxState, label = "MultiStateTransition")

    val boxSize by transition.animateDp(label = "BoxSize") { state ->
        when (state) {
            BoxType.SMALL -> 80.dp
            BoxType.MEDIUM -> 150.dp
            BoxType.LARGE -> 250.dp
        }
    }

    val boxColor by transition.animateColor(label = "BoxColor") { state ->
        when (state) {
            BoxType.SMALL -> OrangeTextColor
            BoxType.MEDIUM -> AccentOrange
            BoxType.LARGE -> Alert_Success
        }
    }


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(boxSize)
                .background(boxColor),
            contentAlignment = Alignment.Center
        ) {
            val status = when (boxState) {
                BoxType.SMALL -> "Small"
                BoxType.MEDIUM -> "Medium"
                BoxType.LARGE -> "Large"
            }

            Text(text = status, color = ColorWhite)
        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            boxState = when (boxState) {
                BoxType.SMALL -> BoxType.MEDIUM
                BoxType.MEDIUM -> BoxType.LARGE
                BoxType.LARGE -> BoxType.SMALL
            }
        }) {
            Text("Multi State")
        }
    }


}

@Composable
fun SwitchState() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        var isExpanded by remember { mutableStateOf(false) }
        val transition = updateTransition(
            targetState = isExpanded
        )

        val size by transition.animateDp(label = "Size") { state ->
            if (state) 150.dp else 100.dp
        }
        val color by transition.animateColor(label = "Color") { state ->
            if (state) OrangeTextColor else Purple80
        }
        val offset by transition.animateDp(label = "Offset") { state ->
            if (state) 20.dp else 0.dp
        }

        Column {
            Box(
                modifier = Modifier
                    .size(size)
                    .offset(x = offset)
                    .background(color)
            )

            Spacer(modifier = Modifier.height(20.dp))

            Button(onClick = { isExpanded = !isExpanded }) {
                Text("Switch State")
            }
        }

    }
}


@Preview(showBackground = true)
@Composable
private fun PreviewTransitionScreen() {
    TransitionScreen()
}