/**
 *  Copyright (C) 2025. Samad Talukder (https://github.com/samadtalukder/)
 */
package com.samad_talukder.jetpackcanvas.ui.screens.home.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.samad_talukder.jetpackcanvas.ui.components.CustomText
import com.samad_talukder.jetpackcanvas.ui.theme.AccentPink
import com.samad_talukder.jetpackcanvas.ui.theme.Grey

@Composable
fun ExpandableSectionItem(
    title: String,
    isFavorite: Boolean = false,
    onClick: () -> Unit = {},
    onFavoriteToggle: (Boolean) -> Unit = {}
) {
    var favorited by remember { mutableStateOf(isFavorite) }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() }
            .padding(start = 20.dp, end = 16.dp, top = 16.dp, bottom = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        CustomText(
            text = title,
            fontSize = 16.sp,
            modifier = Modifier.weight(1f),
            maxLine = 1,
            overflow = TextOverflow.Ellipsis
        )

        Icon(
            imageVector = if (favorited) Icons.Default.Bookmark else Icons.Default.BookmarkBorder,
            contentDescription = if (favorited) "Remove favorites" else "Add favorites",
            tint = if (favorited) AccentPink else Grey,
            modifier = Modifier.clickable {
                favorited = !favorited
                onFavoriteToggle(favorited)
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewMaterialItem() {
    ExpandableSectionItem(
        title = "Item 1"
    )
}