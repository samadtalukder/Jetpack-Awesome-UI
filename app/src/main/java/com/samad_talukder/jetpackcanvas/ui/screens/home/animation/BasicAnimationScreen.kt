/**
 *  Copyright (C) 2025. Samad Talukder (https://github.com/samadtalukder/)
 */
package com.samad_talukder.jetpackcanvas.ui.screens.home.animation

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandHorizontally
import androidx.compose.animation.expandIn
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.animation.shrinkHorizontally
import androidx.compose.animation.shrinkOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.samad_talukder.jetpackcanvas.ui.components.CustomText
import com.samad_talukder.jetpackcanvas.ui.theme.Purple80

@Composable
fun BasicAnimationScreen() {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize().padding(20.dp)
    ) {
        ShowSimpleAnimation()

        FadeInFadeOutAnimation()

        SlideInSlideOutAnimation()

        ScaleInScaleOutAnimation()

        ExpandInShrinkOutAnimation()

    }
}


@Composable
fun ShowSimpleAnimation() {
    var firstAnimVisible by remember { mutableStateOf(false) }

    Button(onClick = { firstAnimVisible = !firstAnimVisible }) {
        CustomText(text = if (firstAnimVisible) "Animated Visibility" else "Simple Animated")
    }

    Spacer(Modifier.height(10.dp))

    AnimatedVisibility(visible = firstAnimVisible) {
        Box(
            modifier = Modifier
                .width(200.dp)
                .background(Purple80)
                .padding(20.dp),
            contentAlignment = Alignment.Center
        ) {
            CustomText(text = "Hello, Animated Text!")
        }
    }
}

@Composable
fun FadeInFadeOutAnimation() {
    var secondAnimVisible by remember { mutableStateOf(false) }

    Button(onClick = { secondAnimVisible = !secondAnimVisible }) {
        CustomText(text = if (secondAnimVisible) "Fade Out Animation" else "Fade In Animation")
    }

    Spacer(Modifier.height(10.dp))

    AnimatedVisibility(
        visible = secondAnimVisible,
        enter = fadeIn(),
        exit = fadeOut()
    ) {
        Box(
            modifier = Modifier
                .width(200.dp)
                .background(Purple80)
                .padding(20.dp),
            contentAlignment = Alignment.Center
        ) {
            CustomText(text = "Hello, Animated Text!")
        }
    }
}

@Composable
fun SlideInSlideOutAnimation() {
    var slideInVerticalVisible by remember { mutableStateOf(false) }
    var slideInHorizontalVisible by remember { mutableStateOf(false) }

    Button(onClick = { slideInVerticalVisible = !slideInVerticalVisible }) {
        CustomText(text = if (slideInVerticalVisible) "Slide Out Vertically Animation" else "Slide In Vertically Animation")
    }

    Spacer(Modifier.height(10.dp))

    AnimatedVisibility(
        visible = slideInVerticalVisible,
        enter = slideInVertically(),
        exit = slideOutVertically()
    ) {
        Box(
            modifier = Modifier
                .width(200.dp)
                .background(Purple80)
                .padding(20.dp),
            contentAlignment = Alignment.Center
        ) {
            CustomText(text = "Hello, Animated Text!")
        }
    }

    Button(onClick = { slideInHorizontalVisible = !slideInHorizontalVisible }) {
        CustomText(text = if (slideInHorizontalVisible) "Slide Out Horizontal Animation" else "Slide In Horizontal Animation")
    }

    Spacer(Modifier.height(10.dp))

    AnimatedVisibility(
        visible = slideInHorizontalVisible,
        enter = slideInHorizontally(),
        exit = slideOutHorizontally()
    ) {
        Box(
            modifier = Modifier
                .width(200.dp)
                .background(Purple80)
                .padding(20.dp),
            contentAlignment = Alignment.Center
        ) {
            CustomText(text = "Hello, Animated Text!")
        }
    }
}

@Composable
fun ScaleInScaleOutAnimation() {
    var scaleVisible by remember { mutableStateOf(false) }

    Button(onClick = { scaleVisible = !scaleVisible }) {
        CustomText(text = if (scaleVisible) "Scale Out Animation" else "Scale In Animation")
    }

    Spacer(Modifier.height(10.dp))

    AnimatedVisibility(
        visible = scaleVisible,
        enter = scaleIn(),
        exit = scaleOut()
    ) {
        Box(
            modifier = Modifier
                .width(200.dp)
                .background(Purple80)
                .padding(20.dp),
            contentAlignment = Alignment.Center
        ) {
            CustomText(text = "Hello, Animated Text!")
        }
    }
}

@Composable
fun ExpandInShrinkOutAnimation() {
    var expandVisible by remember { mutableStateOf(false) }
    var expandVerticalVisible by remember { mutableStateOf(false) }
    var expandHorizontalVisible by remember { mutableStateOf(false) }

    Button(onClick = { expandVisible = !expandVisible }) {
        CustomText(text = if (expandVisible) "Expand Out Animation" else "Expand In Animation")
    }

    Spacer(Modifier.height(10.dp))

    AnimatedVisibility(
        visible = expandVisible,
        enter = expandIn(),
        exit = shrinkOut()
    ) {
        Box(
            modifier = Modifier
                .width(200.dp)
                .background(Purple80)
                .padding(20.dp),
            contentAlignment = Alignment.Center
        ) {
            CustomText(text = "Hello, Animated Text!")
        }
    }


    Button(onClick = { expandVerticalVisible = !expandVerticalVisible }) {
        CustomText(text = if (expandVerticalVisible) "Expand Out Vertically Animation" else "Expand In Vertically Animation")
    }

    Spacer(Modifier.height(10.dp))

    AnimatedVisibility(
        visible = expandVerticalVisible,
        enter = expandVertically(),
        exit = shrinkVertically()
    ) {
        Box(
            modifier = Modifier
                .width(200.dp)
                .background(Purple80)
                .padding(20.dp),
            contentAlignment = Alignment.Center
        ) {
            CustomText(text = "Hello, Animated Text!")
        }
    }

    Button(onClick = { expandHorizontalVisible = !expandHorizontalVisible }) {
        CustomText(text = if (expandHorizontalVisible) "Expand Out Horizontal Animation" else "Expand In Horizontal Animation")
    }

    Spacer(Modifier.height(10.dp))

    AnimatedVisibility(
        visible = expandHorizontalVisible,
        enter = expandHorizontally(),
        exit = shrinkHorizontally()
    ) {
        Box(
            modifier = Modifier
                .width(200.dp)
                .background(Purple80)
                .padding(20.dp),
            contentAlignment = Alignment.Center
        ) {
            CustomText(text = "Hello, Animated Text!")
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun PreviewBasicAnimationScreen() {
    BasicAnimationScreen()
}