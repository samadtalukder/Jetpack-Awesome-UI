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

    // Splash Route
    @Serializable
    object SplashSample1 : AppRoute("splash_sample_1")

}
