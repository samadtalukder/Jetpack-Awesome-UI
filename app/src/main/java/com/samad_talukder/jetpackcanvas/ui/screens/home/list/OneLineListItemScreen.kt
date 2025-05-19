/**
 *  Copyright (C) 2025. Samad Talukder (https://github.com/samadtalukder/)
 */
package com.samad_talukder.jetpackcanvas.ui.screens.home.list

import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun OneLineListItemScreen() {
    Column {
        ListItem(
            headlineContent = {
                Text(text = "Headline")
            },
            /*overlineContent = {
                Text(text = "Overline")
            },*/
            supportingContent = {
                Text(text = "Secondary Text")
            },
            leadingContent = {
                Icon(
                    imageVector = Icons.Filled.Favorite,
                    contentDescription = null
                )
            },
            trailingContent = {
                Text(text = "10/10/2025")
            }
        )

        HorizontalDivider()
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewOneLineListItemScreen() {
    OneLineListItemScreen()
}
