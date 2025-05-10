/**
 *  Copyright (C) 2025. Samad Talukder (https://github.com/samadtalukder/)
 */
package com.samad_talukder.jetpackcanvas.ui.screens.home.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samad_talukder.jetpackcanvas.R
import com.samad_talukder.jetpackcanvas.ui.components.CustomImage
import com.samad_talukder.jetpackcanvas.ui.theme.ColorWhite
import com.samad_talukder.jetpackcanvas.ui.theme.Green90

@Composable
fun SplashScreen1() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = ColorWhite),
        contentAlignment = Alignment.Center,
    ) {

        CustomImage(
            imgSrc = R.drawable.ic_cart_logo_with_color,
        )

    }
}


@Preview(showSystemUi = true)
@Composable
fun PreviewUI() {
    SplashScreen1()
}