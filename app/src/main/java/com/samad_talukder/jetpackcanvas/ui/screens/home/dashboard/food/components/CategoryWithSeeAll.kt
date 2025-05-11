/**
 *  Copyright (C) 2025. Samad Talukder (https://github.com/samadtalukder/)
 */
package com.samad_talukder.jetpackcanvas.ui.screens.home.dashboard.food.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.samad_talukder.jetpackcanvas.R
import com.samad_talukder.jetpackcanvas.ui.components.CustomImage
import com.samad_talukder.jetpackcanvas.ui.components.CustomText
import com.samad_talukder.jetpackcanvas.ui.theme.PrimaryTextColor
import com.samad_talukder.jetpackcanvas.ui.theme.SeeAllTextColor

@Composable
fun CategoryWithSeeAll(
    modifier: Modifier = Modifier,
    categoryTitle: String,
    onClickSeeAll: () -> Unit
) {
    Row(
        modifier = modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        CustomText(
            text = categoryTitle,
            textColor = PrimaryTextColor,
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.clickable { onClickSeeAll() },
        ) {
            CustomText(
                text = "See All",
                textColor = SeeAllTextColor,
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal
            )
            Spacer(modifier = Modifier.width(6.dp))
            CustomImage(
                imgSrc = R.drawable.ic_food_forward,
                modifier = Modifier.size(10.dp),
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun PreviewCategoryWithSeeAll() {
    CategoryWithSeeAll(categoryTitle = "All Categories", onClickSeeAll = {})
}