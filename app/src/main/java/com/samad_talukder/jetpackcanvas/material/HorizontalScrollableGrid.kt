package com.samad_talukder.jetpackcanvas.material

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun HorizontalScrollableGrid() {
    val itemList = (0..6).toList()
    val itemModifier = Modifier
        .padding(top = 16.dp, start = 16.dp)
        .border(1.dp, Color.Blue)
        .width(80.dp)
        .wrapContentSize()

    LazyHorizontalGrid(
        rows = GridCells.Fixed(5),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        this.items(itemList) {
            Text(text = "Item is $it", itemModifier)
        }

        item {
            Text(text = "Single Item", itemModifier)
        }
    }
}