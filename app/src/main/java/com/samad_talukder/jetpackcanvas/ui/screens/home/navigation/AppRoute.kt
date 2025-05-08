/**
 *  Copyright (C) 2025. Samad Talukder (https://github.com/samadtalukder/)
 */
package com.samad_talukder.jetpackcanvas.ui.screens.home.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class AppRoute (val route: String){
    // Bottom Nav Route
    @Serializable
    object BottomScreens : AppRoute("bottom_screens")

    @Serializable
    object BottomApps : AppRoute("bottom_apps")

    @Serializable
    object BottomFavorites : AppRoute("bottom_favorites")

    @Serializable
    object BottomSettings : AppRoute("bottom_settings")

    // App Bar Route
    @Serializable
    object CustomTopAppBar : AppRoute("custom_top_app_bar")

    @Serializable
    object CenterAlignedTopAppBar : AppRoute("center_aligned_top_app_bar")

    @Serializable
    object MediumAppBar : AppRoute("medium_app_bar")

    @Serializable
    object LargeAppBar : AppRoute("large_app_bar")

    // Card Demo
    @Serializable
    object BasicCard : AppRoute("basic_card")

    @Serializable
    object FilledCard : AppRoute("filled_card")

    @Serializable
    object OutlinedCard : AppRoute("outlined_card")

    // Splash Route
    @Serializable
    object SplashSample1 : AppRoute("splash_sample_1")

    // Dialog Route
    @Serializable
    object DialogAlert : AppRoute("dialog_alert")

}
