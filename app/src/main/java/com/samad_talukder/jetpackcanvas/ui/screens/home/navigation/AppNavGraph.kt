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
import com.samad_talukder.jetpackcanvas.ui.screens.home.layout.ConstraintLayoutBasicScreen
import com.samad_talukder.jetpackcanvas.ui.screens.home.login.LogInUI_1
import com.samad_talukder.jetpackcanvas.ui.screens.home.dialog.AlertDialogExample
import com.samad_talukder.jetpackcanvas.ui.screens.home.dialog.DialogBasicScreen
import com.samad_talukder.jetpackcanvas.ui.screens.home.dialog.DialogWithImageAndTextScreen
import com.samad_talukder.jetpackcanvas.ui.screens.home.dialog.DialogWithTextFieldScreen
import com.samad_talukder.jetpackcanvas.ui.screens.home.dialog.DialogWithTextScreen
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
        composable(AppRoute.CustomTopAppBar.route) {
            CustomTopAppBarScreen()
        }

        composable(AppRoute.CenterAlignedTopAppBar.route) {
            CenterAlignedTopAppBarScreen()
        }

        composable(AppRoute.MediumAppBar.route) {
            MediumTopAppBarScreen()
        }

        composable(AppRoute.LargeAppBar.route) {
            LargeTopAppBarScreen()
        }

        // Button Components Screen
        composable(AppRoute.BasicBtn.route) {
            BasicButtonScreen{ context.showToast("Hello!") }
        }
        composable(AppRoute.FilledTonalBtn.route) {
            FilledTonalButtonScreen { context.showToast("Hello") }
        }
        composable(AppRoute.FilledTonalIconBtn.route) {
            FilledTonalIconButtonScreen { context.showToast("Hello") }
        }
        composable(AppRoute.FABtn.route) {
            FloatingActionButtonScreen{ context.showToast("Hello!") }
        }
        composable(AppRoute.ElevatedBtn.route) {
            ElevatedButtonScreen{ context.showToast("Hello!") }
        }
        composable(AppRoute.IconBtn.route) {
            IconButtonScreen{ context.showToast("Hello!") }
        }
        composable(AppRoute.OutlinedBtn.route) {
            OutlinedButtonScreen { context.showToast("Hello!") }
        }
        composable(AppRoute.TextBtn.route) {
            TextButtonScreen{ context.showToast("Hello!") }
        }

        // Cards Screens
        composable(AppRoute.BasicCard.route) {
            BasicCardScreen()
        }

        composable(AppRoute.FilledCard.route) {
            FilledCardScreen()
        }

        composable(AppRoute.OutlinedCard.route) {
            OutlinedCardScreen()
        }

        // Layout Screens
        composable(AppRoute.ConstraintLayoutBasic.route) {
            ConstraintLayoutBasicScreen()
        }


        // Dialog Screens
        composable(AppRoute.DialogBasic.route) {
            DialogBasicScreen()
        }

        composable(AppRoute.DialogWithText.route) {
            DialogWithTextScreen()
        }

        composable(AppRoute.DialogWithImageAndText.route) {
            DialogWithImageAndTextScreen()
        }

        composable(AppRoute.DialogWithTextField.route) {
            DialogWithTextFieldScreen()
        }

        composable(AppRoute.DialogAlert.route) {
            AlertDialogExample()
        }

        // Splash Screens
        composable(AppRoute.SplashSample1.route) {
            LogInUI_1()
        }


    }
}


