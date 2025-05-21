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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.tooling.preview.Preview
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
                    colors = listOf(Color(0xFF003366), Color.White, Color(0xFF66B2FF))
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
            colors = listOf(Color.Blue, Color.Cyan, Color.Magenta)
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
