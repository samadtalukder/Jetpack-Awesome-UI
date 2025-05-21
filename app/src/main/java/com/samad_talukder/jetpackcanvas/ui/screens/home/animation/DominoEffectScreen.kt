/**
 *  Copyright (C) 2025. Samad Talukder (https://github.com/samadtalukder/)
 */
package com.samad_talukder.jetpackcanvas.ui.screens.home.animation

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlin.random.Random

@Composable
fun DominoEffectScreen() {

    val animatedValues = List(6) { remember { Animatable(0f) } }

    LaunchedEffect(Unit) {
        animatedValues.forEachIndexed { index, animate ->
            animate.animateTo(
                targetValue = 1f,
                animationSpec = tween(durationMillis = 1000, delayMillis = index * 100)
            )
        }
    }

    Box(modifier = Modifier.fillMaxSize()) {
        animatedValues.forEachIndexed { index, value ->
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .offset(x = ((index + 1) * 50).dp, y = ((index + 1) * 30).dp)
                    .background(getRandomColor(index).copy(alpha = value.value))
            )
        }
    }
}

fun getRandomColor(seed: Int): Color {
    val random = Random(seed = seed).nextInt(256)
    return Color(random, random, random)
}

@Preview(showBackground = true)
@Composable
private fun PreviewDominoEffectScreen() {
    DominoEffectScreen()
}

