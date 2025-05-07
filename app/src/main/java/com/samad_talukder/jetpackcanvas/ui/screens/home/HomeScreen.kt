/**
 *  Copyright (C) 2025. Samad Talukder (https://github.com/samadtalukder/)
 */
package com.samad_talukder.jetpackcanvas.ui.screens.home

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.samad_talukder.jetpackcanvas.ui.screens.home.components.ExpandableSectionHeader
import com.samad_talukder.jetpackcanvas.ui.screens.home.components.ExpandableSectionItem
import com.samad_talukder.jetpackcanvas.ui.theme.Grey200
import com.samad_talukder.jetpackcanvas.utils.CommonFunc.getHomeCategories

@Composable
fun HomeScreen(navController: NavHostController) {
    val homeCategories = remember { getHomeCategories() }

    val expandedState = remember {
        mutableStateMapOf<String, Boolean>().apply {
            homeCategories.forEach { category ->
                put(category.id, category.initiallyExpanded)
            }
        }
    }

    val favorites = remember {
        mutableStateMapOf<String, Boolean>()
    }

    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(homeCategories) { category ->
            val isExpanded = expandedState[category.id] ?: false

            Spacer(modifier = Modifier.height(4.dp))

            ExpandableSectionHeader(
                category = category,
                isNewBadge = category.isNew,
                isExpanded = isExpanded,
                onExpandToggle = {
                    expandedState[category.id] = !isExpanded
                }
            )

            if (isExpanded) {
                category.items.forEach { item ->
                    val itemKey = "${category.id}:${item.title}"
                    val isFavorite = favorites[itemKey] ?: item.isFavorite

                    ExpandableSectionItem(
                        title = item.title,
                        //isFavorite = isFavorite,
                        onClick = {
                            navController.navigate(item.route)
                        },
                        onFavoriteToggle = { newValue ->
                            favorites[itemKey] = newValue
                        }
                    )
                }
            }

            HorizontalDivider(
                color = Grey200
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewHomeScreen() {
    HomeScreen(rememberNavController())
}



