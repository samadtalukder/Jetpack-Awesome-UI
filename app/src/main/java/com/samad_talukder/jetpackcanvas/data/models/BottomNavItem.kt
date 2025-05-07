/**
 *  Copyright (C) 2025. Samad Talukder (https://github.com/samadtalukder/)
 */
package com.samad_talukder.jetpackcanvas.data.models

import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavItem(
    val title: String,
    val selectedIcon: ImageVector,
    val icon: ImageVector,
    val route: String,
    val badgeCount: Int? = null
)