/**
 *  Copyright (C) 2025. Samad Talukder (https://github.com/samadtalukder/)
 */
package com.samad_talukder.jetpackcanvas.ui.screens.home.checkout.sample1.enum

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import com.samad_talukder.jetpackcanvas.ui.theme.Black
import com.samad_talukder.jetpackcanvas.ui.theme.GrayTextColor
import com.samad_talukder.jetpackcanvas.ui.theme.OrangeTextColor

enum class StepStatus { COMPLETED, CURRENT, UPCOMING }

fun StepStatus.updateColor(): Color = when (this) {
    StepStatus.CURRENT,
    StepStatus.COMPLETED -> OrangeTextColor

    StepStatus.UPCOMING -> GrayTextColor
}

fun StepStatus.textColor(): Color = when (this) {
    StepStatus.CURRENT,
    StepStatus.COMPLETED -> Black

    StepStatus.UPCOMING -> GrayTextColor
}

fun StepStatus.fontWeight(): FontWeight = when (this) {
    StepStatus.CURRENT,
    StepStatus.COMPLETED -> FontWeight.Bold

    StepStatus.UPCOMING -> FontWeight.Normal
}

fun connectColor(index: Int, currentStep: Int): Color =
    if (index < currentStep) OrangeTextColor else GrayTextColor