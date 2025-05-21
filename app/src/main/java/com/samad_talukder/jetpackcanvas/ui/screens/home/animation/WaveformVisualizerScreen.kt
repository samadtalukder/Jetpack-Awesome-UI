/**
 *  Copyright (C) 2025. Samad Talukder (https://github.com/samadtalukder/)
 */
package com.samad_talukder.jetpackcanvas.ui.screens.home.animation

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.tooling.preview.Preview
import com.samad_talukder.jetpackcanvas.ui.theme.AccentOrange
import com.samad_talukder.jetpackcanvas.ui.theme.Brand60
import com.samad_talukder.jetpackcanvas.ui.theme.Green85
import com.samad_talukder.jetpackcanvas.ui.theme.Orange_200
import com.samad_talukder.jetpackcanvas.ui.theme.Orange_400
import kotlin.math.sin

@Composable
fun WaveformVisualizerScreen() {
    var amplitude by remember { mutableFloatStateOf(100f) }
    var frequency by remember { mutableFloatStateOf(1f) }

    Canvas(
        modifier = Modifier
            .fillMaxSize()
            .pointerInput(Unit) {
                detectDragGestures { _, dragAmount ->
                    amplitude += dragAmount.y
                    frequency += dragAmount.x / 500f
                }
            }
            .background(
                Brush.verticalGradient(
                    colors = listOf(Orange_200, White, Orange_400)
                )
            )
    ) {
        val canvasWidth = size.width
        val canvasHeight = size.height
        val path = Path()

        val halfHeight = canvasHeight / 2
        val waveLength = canvasWidth / frequency

        path.moveTo(0f, halfHeight)

        for (x in 0 until canvasWidth.toInt()) {
            val theta = (2.0 * Math.PI * x / waveLength).toFloat()
            val y = halfHeight + amplitude * sin(theta.toDouble()).toFloat()
            path.lineTo(x.toFloat(), y)
        }

        val gradient = Brush.horizontalGradient(
            colors = listOf(AccentOrange, Green85, Brand60)
        )

        drawPath(
            path = path,
            brush = gradient,
            style = Stroke(width = 4f)
        )
    }
}

@Preview
@Composable
private fun PreviewWaveformVisualizerScreen() {
    WaveformVisualizerScreen()
}
