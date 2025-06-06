/**
 *  Copyright (C) 2025. Samad Talukder (https://github.com/samadtalukder/)
 */
package com.samad_talukder.jetpackcanvas.ui.screens.home.animation

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.keyframes
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.snap
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.samad_talukder.jetpackcanvas.R
import com.samad_talukder.jetpackcanvas.ui.components.CustomText
import com.samad_talukder.jetpackcanvas.ui.theme.OrangeTextColor
import com.samad_talukder.jetpackcanvas.ui.theme.Purple80
import com.samad_talukder.jetpackcanvas.ui.theme.Teal80

@Composable
fun ModifierAnimationScreen() {

    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        item {
            FireForgetAnimation()
            AnimateContentSize()
            ChangeAnimColor()
            TweenAnimation()
            SpringAnimation()
            KeyframesAnimation()
            RepeatAnimation()
            SnapAnimation()
            AnimateDpAsState()
            AnimateAsFloat()
            InfiniteRotate()
            InfiniteAnimation()

        }

    }
}

@Composable
fun InfiniteAnimation() {
    val infiniteTransition = rememberInfiniteTransition()

    val heartSize by infiniteTransition.animateFloat(
        initialValue = 100.0f,
        targetValue = 200.0f,
        animationSpec = infiniteRepeatable(
            animation = tween(800, delayMillis = 100, easing = FastOutLinearInEasing),
            repeatMode = RepeatMode.Reverse
        )
    )
    Image(
        painter = painterResource(R.drawable.ic_clock),
        contentDescription = "heart",
        modifier = Modifier
            .size(heartSize.dp)
    )
}

@Composable
fun InfiniteRotate() {
    val infiniteTransition = rememberInfiniteTransition()

    val angle by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = 2000,
                easing = LinearEasing
            ),
            repeatMode = RepeatMode.Restart
        )
    )

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        Image(
            painter = painterResource(id = R.drawable.ic_furniture_clock),
            contentDescription = "Rotating Image",
            modifier = Modifier
                .size(200.dp)
                .rotate(angle)
        )
    }
}

@Composable
fun AnimateAsFloat() {
    var isRotated by rememberSaveable { mutableStateOf(false) }

    val rotationAngle by animateFloatAsState(
        targetValue = if (isRotated) 360F else 0f,
        animationSpec = tween(durationMillis = 500)
    )

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(R.drawable.ic_furniture_clock),
            contentDescription = "clock",
            modifier = Modifier
                .rotate(rotationAngle)
                .size(150.dp)
        )

        Button(
            onClick = { isRotated = !isRotated },
            modifier = Modifier
                .padding(top = 50.dp)
                .width(200.dp)
        ) {
            Text(text = "Rotate")
        }
    }
}

@Composable
fun AnimateDpAsState() {
    val isNeedExpansion = rememberSaveable { mutableStateOf(false) }

    val animatedSizeDp: Dp by animateDpAsState(targetValue = if (isNeedExpansion.value) 150.dp else 100.dp)

    Column(horizontalAlignment = Alignment.CenterHorizontally) {

        CircleImage(animatedSizeDp)

        Button(
            onClick = {
                isNeedExpansion.value = !isNeedExpansion.value
            },
            modifier = Modifier
                .padding(top = 50.dp)

        ) {
            Text(text = "animateDpAsState")
        }
    }
}

@Composable
fun CircleImage(imageSize: Dp) {
    Image(
        painter = painterResource(R.drawable.img_restaurant_bg),
        contentDescription = "Circle Image",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(imageSize)
            .clip(CircleShape)
            .border(5.dp, Color.Gray, CircleShape)
    )
}

@Composable
fun SnapAnimation() {
    var isMoved by remember { mutableStateOf(false) }

    val offsetX by animateDpAsState(
        targetValue = if (isMoved) 200.dp else 0.dp,
        animationSpec = snap(delayMillis = 1500), label = "SnapAnimation"
    )

    Column {
        Box(
            Modifier
                .size(100.dp)
                .offset(x = offsetX)
                .background(Teal80)
        )
        Button(onClick = { isMoved = !isMoved }) {
            Text("Snap Animation")
        }
    }

}

@Composable
fun RepeatAnimation() {
    val infiniteOffset by rememberInfiniteTransition(label = "infinite").animateFloat(
        initialValue = 0f,
        targetValue = 200f,
        animationSpec = infiniteRepeatable(
            animation = tween(1500),
            repeatMode = RepeatMode.Reverse
        ), label = "RepeatAnimation"
    )

    Box(
        Modifier
            .size(100.dp)
            .offset(x = infiniteOffset.dp)
            .background(OrangeTextColor)
    )


}

@Composable
fun KeyframesAnimation() {
    var isMoved by remember { mutableStateOf(false) }

    val offsetX by animateDpAsState(
        targetValue = if (isMoved) 200.dp else 0.dp,
        animationSpec = keyframes {
            durationMillis = 3000
            50.dp at 500            // 0.5 seconds to 50.dp
            //150.dp at 1000
            //200.dp at 2000
        }, label = "OffsetAnimation"
    )

    Column {
        Box(
            Modifier
                .size(100.dp)
                .offset(x = offsetX)
                .background(Teal80)
        )
        Button(onClick = { isMoved = !isMoved }) {
            Text("Keyframes Animation")
        }
    }
}

@Composable
fun SpringAnimation() {
    var isMoved by remember { mutableStateOf(false) }

    val offsetX by animateDpAsState(
        targetValue = if (isMoved) 200.dp else 0.dp,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,      // Damping Ratio
            stiffness = Spring.StiffnessMedium,                  // Stiffness
        ), label = "OffsetAnimation"
    )

    Column {
        Box(
            Modifier
                .size(100.dp)
                .offset(x = offsetX)
                .background(Teal80)
        )
        Button(onClick = { isMoved = !isMoved }) {
            Text("Spring Animation")
        }
    }
}

@Composable
fun TweenAnimation() {
    var isMoved by remember { mutableStateOf(false) }

    val offsetX by animateDpAsState(
        targetValue = if (isMoved) 200.dp else 0.dp,
        animationSpec = tween(
            durationMillis = 1500,      // Duration
            delayMillis = 300,          // Delay
            easing = LinearEasing       // Easing Curve
        ), label = "OffsetAnimation"
    )

    Column {
        Box(
            Modifier
                .size(100.dp)
                .offset(x = offsetX)
                .background(Teal80)
        )
        Button(onClick = { isMoved = !isMoved }) {
            Text("Tween Animation")
        }
    }

}

@Composable
fun ChangeAnimColor() {
    var colorState by remember { mutableStateOf(Teal80) }

    val animatedColor by animateColorAsState(
        targetValue = colorState,
        animationSpec = tween(durationMillis = 2000)
    )

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Box(
            modifier = Modifier
                .size(200.dp)
                .background(animatedColor)
        )

        Spacer(modifier = Modifier.height(32.dp))

        Button(onClick = {
            colorState = if (colorState == OrangeTextColor) Teal80 else OrangeTextColor
        }) {
            Text("Change Color")
        }
    }

}

@Composable
fun AnimateContentSize() {
    var count by remember { mutableIntStateOf(0) }
    val colors = listOf(
        OrangeTextColor,
        Purple80
    )

    Button(onClick = { count++ }) {
        Text(text = "Animate")
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .animateContentSize()
    ) {
        repeat(count) { index ->
            val colorIndex = index % colors.size

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
                    .background(color = colors[colorIndex])
            )
        }
    }
}

@Composable
fun FireForgetAnimation() {
    var isEnabled by remember { mutableStateOf(false) }
    var targetValue by remember { mutableFloatStateOf(50f) }

    Button(onClick = {
        if (isEnabled) targetValue += 5f

    }) {
        CustomText(text = "Fire-and-forget animation")
    }

    val animatedValue by animateFloatAsState(
        targetValue = if (isEnabled) 1f else 0f,
        animationSpec = tween(durationMillis = 300, easing = FastOutSlowInEasing)
    )

    Box(
        modifier = Modifier
            .drawBehind { drawRect(OrangeTextColor) }
            .size(animatedValue.dp)
    )
}


@Preview(showBackground = true)
@Composable
private fun PreviewModifierAnimationScreen() {
    ModifierAnimationScreen()
}