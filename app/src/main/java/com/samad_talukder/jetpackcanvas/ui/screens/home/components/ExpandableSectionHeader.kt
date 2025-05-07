/**
 *  Copyright (C) 2025. Samad Talukder (https://github.com/samadtalukder/)
 */
package com.samad_talukder.jetpackcanvas.ui.screens.home.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.samad_talukder.jetpackcanvas.data.models.HomeCategory
import com.samad_talukder.jetpackcanvas.ui.components.CustomText
import com.samad_talukder.jetpackcanvas.ui.theme.AccentOrange
import com.samad_talukder.jetpackcanvas.ui.theme.Grey
import com.samad_talukder.jetpackcanvas.ui.theme.Grey500

@Composable
fun ExpandableSectionHeader(
    category: HomeCategory,
    isNewBadge: Boolean = false,
    isExpanded: Boolean = false,
    onExpandToggle: () -> Unit = {}
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onExpandToggle() }
            .padding(horizontal = 16.dp, vertical = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = category.icon,
            contentDescription = null,
            tint = Grey,
            modifier = Modifier.size(24.dp)
        )

        Spacer(modifier = Modifier.width(16.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.weight(1f)
        ) {
            CustomText(
                text = category.title,
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
            )
            if (category.items.isNotEmpty()) {
                CustomText(
                    text = "${category.items.size}",
                    fontSize = 12.sp,
                    textColor = Grey500,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(start = 10.dp)
                )
            }

        }

        if (isNewBadge == true) {
            CustomText(
                text = "new",
                fontSize = 12.sp,
                fontWeight = FontWeight.Medium,
                textColor = AccentOrange,
                modifier = Modifier.padding(end = 8.dp)
            )
        }
        if (category.items.isNotEmpty()) {
            Icon(
                imageVector = if (isExpanded) Icons.Default.ExpandLess else Icons.Default.ExpandMore,
                contentDescription = if (isExpanded) "Collapse" else "Expand",
                tint = Grey
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewExpandableSectionHeader() {
    ExpandableSectionHeader(
        category = HomeCategory(
            id = "",
            title = TODO(),
            icon = TODO(),
            items = TODO(),
            isNew = TODO(),
            initiallyExpanded = TODO()
        ),
        isNewBadge = false,
        isExpanded = true,
        onExpandToggle = {},
    )
}