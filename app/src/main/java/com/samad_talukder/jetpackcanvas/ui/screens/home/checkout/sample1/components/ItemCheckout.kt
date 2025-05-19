/**
 *  Copyright (C) 2025. Samad Talukder (https://github.com/samadtalukder/)
 */
package com.samad_talukder.jetpackcanvas.ui.screens.home.checkout.sample1.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.samad_talukder.jetpackcanvas.R

@Composable
fun ItemCheckout(title: String, image: Int) {
    var count by remember { mutableIntStateOf(0) }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                horizontal = 16.dp,
                vertical = 12.dp
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = image),
            contentDescription = null,
            modifier = Modifier.size(24.dp)
        )

        Text(
            text = title,
            modifier = Modifier
                .padding(start = 16.dp)
                .weight(1f)
        )

        ItemQuantity(
            count = count,
            onDecrement = { if (count > 0) count-- },
            onIncrement = { count++ }
        )
    }

    HorizontalDivider(thickness = 0.5.dp, color = Color.LightGray)
}

@Preview(showBackground = true)
@Composable
private fun PreviewCounterItem() {
    ItemCheckout(title = "Item", image = R.drawable.ic_food_and_drink)
}