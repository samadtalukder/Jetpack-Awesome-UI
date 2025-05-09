/**
 *  Copyright (C) 2025. Samad Talukder (https://github.com/samadtalukder/)
 */
package com.samad_talukder.jetpackcanvas.ui.screens.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.samad_talukder.jetpackcanvas.ui.components.CustomText

@Composable
fun ScrollContent(inner: PaddingValues) {
    val range = 1..100
    LazyColumn(
        modifier = Modifier.fillMaxSize().padding(inner),
        verticalArrangement = Arrangement.Top
    ) {
        items(range.count()) { index ->
            CustomText(
                text = "Item ${index + 1}",
                modifier = Modifier.padding(6.dp)
            )
        }
    }
}

@Preview
@Composable
private fun PreviewScrollContent() {
    ScrollContent(PaddingValues(10.dp))
}