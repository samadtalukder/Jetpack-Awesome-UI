package com.samad_talukder.jetpackcanvas.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.samad_talukder.jetpackcanvas.R

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