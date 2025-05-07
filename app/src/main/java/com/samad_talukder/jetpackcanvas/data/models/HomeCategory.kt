/**
 *  Copyright (C) 2025. Samad Talukder (https://github.com/samadtalukder/)
 */
package com.samad_talukder.jetpackcanvas.data.models

import androidx.compose.ui.graphics.vector.ImageVector

data class HomeCategory(
    val id: String,
    val title: String,
    val icon: ImageVector,
    val items: List<HomeCategoryItem>,
    val isNew: Boolean = false,
    val initiallyExpanded: Boolean = false
)