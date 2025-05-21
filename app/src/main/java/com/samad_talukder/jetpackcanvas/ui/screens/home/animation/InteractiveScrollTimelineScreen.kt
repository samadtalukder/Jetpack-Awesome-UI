package com.samad_talukder.jetpackcanvas.ui.screens.home.animation

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun InteractiveScrollTimelineScreen() {

    val scrollState = rememberLazyListState()
    val timelineItems = listOf(
        "Project Kickoff",
        "Design Phase",
        "Development Start",
        "Mid-Project Review",
        "Testing Phase",
        "Final Review",
        "Deployment",
        "Post-Launch Support",
        "Project Kickoff",
        "Design Phase",
        "Development Start",
        "Mid-Project Review",
        "Testing Phase",
        "Final Review",
        "Deployment",
        "Post-Launch Support",
        "Post-Launch Support",
        "Project Kickoff",
        "Design Phase",
        "Development Start",
        "Mid-Project Review",
        "Testing Phase",
        "Final Review",
        "Deployment",
        "Post-Launch Support",
    )

    LazyColumn(state = scrollState) {
        itemsIndexed(timelineItems) { index, item ->
            val animatableAlpha = remember { Animatable(0f) }
            val isVisible = remember {
                derivedStateOf {
                    scrollState.firstVisibleItemIndex <= index
                }
            }

            LaunchedEffect(isVisible.value) {
                if (isVisible.value) {
                    animatableAlpha.animateTo(
                        targetValue = 1f,
                        animationSpec = tween(durationMillis = 100)
                    )

                }
            }

            TimelineItem(
                text = item,
                alpha = animatableAlpha.value,
            )
        }
    }
}

@Composable
fun TimelineItem(text: String, alpha: Float) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.DarkGray.copy(alpha = alpha))
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = text,
            color = Color.White,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 18.sp,
            fontWeight = FontWeight.SemiBold
        )
    }
}

