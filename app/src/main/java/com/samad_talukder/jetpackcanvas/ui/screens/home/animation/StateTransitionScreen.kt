package com.samad_talukder.jetpackcanvas.ui.screens.home.animation

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.samad_talukder.jetpackcanvas.ui.theme.Alert_Success
import com.samad_talukder.jetpackcanvas.ui.theme.Alert_Warning
import com.samad_talukder.jetpackcanvas.ui.theme.Teal80

enum class UIState { StateA, StateB, StateC }

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun StateTransitionScreen() {
    var currentState by remember { mutableStateOf(UIState.StateA) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(getBackgroundColorForState(currentState)),
        contentAlignment = Alignment.Center
    ) {
        AnimatedContent(
            targetState = currentState,
            transitionSpec = {
                (fadeIn(tween(500)) + expandVertically()).togetherWith(fadeOut(tween(500)) + shrinkVertically())
            }) { state ->
            Text("This is ${state.name}", fontSize = 32.sp)
        }

        Button(
            onClick = { currentState = getNextState(currentState) },
            modifier = Modifier.align(Alignment.BottomCenter)
        ) {
            Text("Next State")
        }
    }

}

fun getBackgroundColorForState(state: UIState): Color {
    return when (state) {
        UIState.StateA -> Teal80
        UIState.StateB -> Alert_Success
        UIState.StateC -> Alert_Warning
    }
}

fun getNextState(currentState: UIState): UIState {
    return when (currentState) {
        UIState.StateA -> UIState.StateB
        UIState.StateB -> UIState.StateC
        UIState.StateC -> UIState.StateA
    }
}

@Preview
@Composable
private fun PreviewStateTransitionScreen() {
    StateTransitionScreen()
}