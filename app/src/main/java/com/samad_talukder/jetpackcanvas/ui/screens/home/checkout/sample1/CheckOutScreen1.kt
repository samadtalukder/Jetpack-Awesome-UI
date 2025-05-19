/**
 *  Copyright (C) 2025. Samad Talukder (https://github.com/samadtalukder/)
 */
package com.samad_talukder.jetpackcanvas.ui.screens.home.checkout.sample1

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.samad_talukder.jetpackcanvas.ui.screens.home.checkout.sample1.enum.StepStatus
import com.samad_talukder.jetpackcanvas.ui.screens.home.checkout.sample1.enum.connectColor
import com.samad_talukder.jetpackcanvas.ui.screens.home.checkout.sample1.enum.fontWeight
import com.samad_talukder.jetpackcanvas.ui.screens.home.checkout.sample1.enum.textColor
import com.samad_talukder.jetpackcanvas.ui.screens.home.checkout.sample1.enum.updateColor
import com.samad_talukder.jetpackcanvas.ui.screens.home.checkout.sample1.model.StepDataItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CheckOutScreen1() {
    var currentStep by remember { mutableIntStateOf(0) }
    val stepsList = listOf(
        StepDataItem("Furniture"),
        StepDataItem("Electronics"),
        StepDataItem("Others")
    )


    Scaffold { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {

            StepperIndicator(
                steps = stepsList,
                currentStep = currentStep
            )

            HorizontalDivider(thickness = 1.dp, color = Color.LightGray)

            Box(modifier = Modifier.weight(1f)) {
                when (currentStep) {
                    0 -> FurnitureTab { currentStep = 1 }
                    1 -> ElectronicsTab { currentStep = 2 }
                    2 -> OthersTab { currentStep = 3 }
                }
            }
        }
    }
}

@Composable
fun StepperIndicator(
    steps: List<StepDataItem>,
    currentStep: Int,
    modifier: Modifier = Modifier,
    stepSize: Dp = 10.dp,
    currentStepSize: Dp = 12.dp,
    textStyle: TextStyle = TextStyle(fontSize = 12.sp)
) {

    ConstraintLayout(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 54.dp, vertical = 16.dp)
    ) {

        val guidelineTop = createGuidelineFromTop(currentStepSize / 2)
        val stepRefs = steps.map { createRef() }
        val lineRefs = (0 until steps.size - 1).map { createRef() }

        steps.forEachIndexed { index, stepTitle ->

            val status = when {
                index < currentStep -> StepStatus.COMPLETED
                index == currentStep -> StepStatus.CURRENT
                else -> StepStatus.UPCOMING
            }
            val size = if (status == StepStatus.CURRENT) currentStepSize else stepSize

            Box(
                modifier = Modifier
                    .size(size)
                    .background(
                        color = status.updateColor(),
                        shape = CircleShape
                    )
                    .border(
                        width = 2.dp,
                        color = status.updateColor(),
                        shape = CircleShape
                    )
                    .constrainAs(stepRefs[index]) {
                        top.linkTo(guidelineTop)
                        if (index == 0) {
                            start.linkTo(parent.start)
                        } else {
                            start.linkTo(lineRefs[index - 1].end)
                        }
                        if (index < steps.lastIndex) {
                            end.linkTo(lineRefs[index].start)
                        } else {
                            end.linkTo(parent.end)
                        }
                    }
            )

            Text(
                text = stepTitle.title,
                color = status.textColor(),
                fontWeight = status.fontWeight(),
                style = textStyle,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .widthIn(min = 60.dp)
                    .constrainAs(createRef()) {
                        top.linkTo(stepRefs[index].bottom, margin = 8.dp)
                        start.linkTo(stepRefs[index].start)
                        end.linkTo(stepRefs[index].end)
                    }
            )

            if (index < steps.lastIndex) {
                Box(
                    modifier = Modifier
                        .height(2.dp)
                        .background(
                            color = connectColor(index, currentStep)
                        )
                        .constrainAs(lineRefs[index]) {
                            start.linkTo(stepRefs[index].end)
                            end.linkTo(stepRefs[index + 1].start)
                            top.linkTo(stepRefs[index].top)
                            bottom.linkTo(stepRefs[index].bottom)
                            width = Dimension.fillToConstraints
                        }
                )
            }
        }
    }
}


@Preview
@Composable
private fun PreviewCheckOutScreen1() {
    CheckOutScreen1()
}