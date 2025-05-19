/**
 *  Copyright (C) 2025. Samad Talukder (https://github.com/samadtalukder/)
 */
package com.samad_talukder.jetpackcanvas.ui.screens.home.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class AppRoute(val route: String) {
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

    // Animation Demo
    @Serializable
    object BasicAnimation : AppRoute("basic_animation")

    // Button Demo
    @Serializable
    object BasicBtn : AppRoute("basic_btn")

    @Serializable
    object FilledTonalBtn : AppRoute("filled_tonal_btn")

    @Serializable
    object FilledTonalIconBtn : AppRoute("filled_tonal_icon_btn")

    @Serializable
    object FABtn : AppRoute("fa_btn")

    @Serializable
    object ElevatedBtn : AppRoute("elevated_btn")

    @Serializable
    object IconBtn : AppRoute("icon_btn")

    @Serializable
    object OutlinedBtn : AppRoute("outlined_btn")

    @Serializable
    object TextBtn : AppRoute("text_btn")

    // Card Demo
    @Serializable
    object BasicCard : AppRoute("basic_card")

    @Serializable
    object FilledCard : AppRoute("filled_card")

    @Serializable
    object OutlinedCard : AppRoute("outlined_card")

    // Dialog Route
    @Serializable
    object DialogBasic : AppRoute("dialog_basic")

    @Serializable
    object DialogWithText : AppRoute("dialog_text")

    @Serializable
    object DialogWithImageAndText : AppRoute("dialog_image_text")

    @Serializable
    object DialogWithTextField : AppRoute("dialog_text_field")

    @Serializable
    object DialogAlert : AppRoute("dialog_alert")

    // Layout Demo
    @Serializable
    object ConstraintLayoutBasic : AppRoute("constraint_layout_basic")

    // Text & Typo Demo
    @Serializable
    object BasicText : AppRoute("basic_text")

    @Serializable
    object MultipleTextStyle : AppRoute("multiple_text_style")

    @Serializable
    object TextLink : AppRoute("text_link")

    // Splash Route
    @Serializable
    object SplashSample1 : AppRoute("splash_sample_1")

    // Authentication Route
    @Serializable
    object LogIn1 : AppRoute("login_1")

    @Serializable
    object LogIn2 : AppRoute("login_2")

    // Dashboard Route
    @Serializable
    object FoodieHome : AppRoute("foodie_home")

}
