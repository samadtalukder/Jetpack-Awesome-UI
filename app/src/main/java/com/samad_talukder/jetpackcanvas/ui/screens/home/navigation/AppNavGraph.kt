/**
 *  Copyright (C) 2025. Samad Talukder (https://github.com/samadtalukder/)
 */

package com.samad_talukder.jetpackcanvas.ui.screens.home.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.samad_talukder.jetpackcanvas.ui.screens.home.animation.BasicAnimationScreen
import com.samad_talukder.jetpackcanvas.ui.screens.home.animation.ModifierAnimationScreen
import com.samad_talukder.jetpackcanvas.ui.screens.home.animation.TransitionScreen
import com.samad_talukder.jetpackcanvas.ui.screens.home.appbars.CenterAlignedTopAppBarScreen
import com.samad_talukder.jetpackcanvas.ui.screens.home.appbars.CustomTopAppBarScreen
import com.samad_talukder.jetpackcanvas.ui.screens.home.appbars.LargeTopAppBarScreen
import com.samad_talukder.jetpackcanvas.ui.screens.home.appbars.MediumTopAppBarScreen
import com.samad_talukder.jetpackcanvas.ui.screens.home.button.BasicButtonScreen
import com.samad_talukder.jetpackcanvas.ui.screens.home.button.ElevatedButtonScreen
import com.samad_talukder.jetpackcanvas.ui.screens.home.button.FilledTonalButtonScreen
import com.samad_talukder.jetpackcanvas.ui.screens.home.button.FilledTonalIconButtonScreen
import com.samad_talukder.jetpackcanvas.ui.screens.home.button.FloatingActionButtonScreen
import com.samad_talukder.jetpackcanvas.ui.screens.home.button.IconButtonScreen
import com.samad_talukder.jetpackcanvas.ui.screens.home.button.OutlinedButtonScreen
import com.samad_talukder.jetpackcanvas.ui.screens.home.button.TextButtonScreen
import com.samad_talukder.jetpackcanvas.ui.screens.home.cards.BasicCardScreen
import com.samad_talukder.jetpackcanvas.ui.screens.home.cards.FilledCardScreen
import com.samad_talukder.jetpackcanvas.ui.screens.home.cards.OutlinedCardScreen
import com.samad_talukder.jetpackcanvas.ui.screens.home.dashboard.food.FoodieHomeScreen
import com.samad_talukder.jetpackcanvas.ui.screens.home.dialog.AlertDialogExample
import com.samad_talukder.jetpackcanvas.ui.screens.home.dialog.DialogBasicScreen
import com.samad_talukder.jetpackcanvas.ui.screens.home.dialog.DialogWithImageAndTextScreen
import com.samad_talukder.jetpackcanvas.ui.screens.home.dialog.DialogWithTextFieldScreen
import com.samad_talukder.jetpackcanvas.ui.screens.home.dialog.DialogWithTextScreen
import com.samad_talukder.jetpackcanvas.ui.screens.home.layout.ConstraintLayoutBasicScreen
import com.samad_talukder.jetpackcanvas.ui.screens.home.login.LogInScreen1
import com.samad_talukder.jetpackcanvas.ui.screens.home.login.LogInScreen2
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.BasicAnimation
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.BasicBtn
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.BasicCard
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.BasicText
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.CenterAlignedTopAppBar
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.ConstraintLayoutBasic
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.CustomTopAppBar
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.DialogAlert
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.DialogBasic
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.DialogWithImageAndText
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.DialogWithText
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.DialogWithTextField
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.ElevatedBtn
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.FABtn
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.FilledCard
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.FilledTonalBtn
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.FilledTonalIconBtn
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.FoodieHome
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.IconBtn
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.LargeAppBar
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.LogIn1
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.LogIn2
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.MediumAppBar
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.ModifierAnimation
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.MultipleTextStyle
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.OutlinedCard
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.SplashSample1
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.TextBtn
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.TextLink
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.TransitionAnimation
import com.samad_talukder.jetpackcanvas.ui.screens.home.splash.SplashScreen1
import com.samad_talukder.jetpackcanvas.ui.screens.home.text.BasicTextScreen
import com.samad_talukder.jetpackcanvas.ui.screens.home.text.MultipleTextStyleScreen
import com.samad_talukder.jetpackcanvas.ui.screens.home.text.TextLinkScreen
import com.samad_talukder.jetpackcanvas.utils.bottomNavGraph
import com.samad_talukder.jetpackcanvas.utils.showToast

@Composable
fun AppNavGraph(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier
) {
    val context = LocalContext.current.applicationContext

    NavHost(
        navController = navController,
        startDestination = AppRoute.BottomScreens.route,
        modifier = modifier
    ) {
        // Bottom Navigation Screens
        bottomNavGraph(navController)

        // App Bar Screens
        composable(CustomTopAppBar.route) {
            CustomTopAppBarScreen()
        }

        composable(CenterAlignedTopAppBar.route) {
            CenterAlignedTopAppBarScreen()
        }

        composable(MediumAppBar.route) {
            MediumTopAppBarScreen()
        }

        composable(LargeAppBar.route) {
            LargeTopAppBarScreen()
        }

        // Animation Components Screen
        composable(BasicAnimation.route) {
            BasicAnimationScreen()
        }

        composable(ModifierAnimation.route) {
            ModifierAnimationScreen()
        }

        composable(TransitionAnimation.route) {
            TransitionScreen()
        }

        // Button Components Screen
        composable(BasicBtn.route) {
            BasicButtonScreen { context.showToast("Hello!") }
        }
        composable(FilledTonalBtn.route) {
            FilledTonalButtonScreen { context.showToast("Hello") }
        }
        composable(FilledTonalIconBtn.route) {
            FilledTonalIconButtonScreen { context.showToast("Hello") }
        }
        composable(FABtn.route) {
            FloatingActionButtonScreen { context.showToast("Hello!") }
        }
        composable(ElevatedBtn.route) {
            ElevatedButtonScreen { context.showToast("Hello!") }
        }
        composable(IconBtn.route) {
            IconButtonScreen { context.showToast("Hello!") }
        }
        composable(AppRoute.OutlinedBtn.route) {
            OutlinedButtonScreen { context.showToast("Hello!") }
        }
        composable(TextBtn.route) {
            TextButtonScreen { context.showToast("Hello!") }
        }

        // Cards Screens
        composable(BasicCard.route) {
            BasicCardScreen()
        }

        composable(FilledCard.route) {
            FilledCardScreen()
        }

        composable(OutlinedCard.route) {
            OutlinedCardScreen()
        }

        // Dialog Screens
        composable(DialogBasic.route) {
            DialogBasicScreen()
        }

        composable(DialogWithText.route) {
            DialogWithTextScreen()
        }

        composable(DialogWithImageAndText.route) {
            DialogWithImageAndTextScreen()
        }

        composable(DialogWithTextField.route) {
            DialogWithTextFieldScreen()
        }

        composable(DialogAlert.route) {
            AlertDialogExample()
        }

        // Layout Screens
        composable(ConstraintLayoutBasic.route) {
            ConstraintLayoutBasicScreen()
        }

        // Text & Typo Screens
        composable(BasicText.route) {
            BasicTextScreen()
        }

        composable(MultipleTextStyle.route) {
            MultipleTextStyleScreen()
        }

        composable(TextLink.route) {
            TextLinkScreen()
        }

        // Splash Screens
        composable(SplashSample1.route) {
            SplashScreen1()
        }

        // Authentication Screens
        composable(LogIn1.route) {
            LogInScreen1()
        }
        composable(LogIn2.route) {
            LogInScreen2()
        }

        // Dashboard Screens
        composable(FoodieHome.route) {
            FoodieHomeScreen()
        }

    }
}


