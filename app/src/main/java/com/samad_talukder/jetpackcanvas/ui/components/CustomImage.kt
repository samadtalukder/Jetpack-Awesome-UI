/**
 *  Copyright (C) 2025. Samad Talukder (https://github.com/samadtalukder/)
 */
package com.samad_talukder.jetpackcanvas.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

@Composable
fun CustomImage(
    @DrawableRes imgSrc: Int,
    modifier: Modifier = Modifier,
    contentScale: ContentScale = ContentScale.None
) {
    Image(
        painter = painterResource(id = imgSrc),
        contentDescription = "image description",
        contentScale = contentScale,
        modifier = modifier
    )
}