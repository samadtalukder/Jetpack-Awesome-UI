/**
 *  Copyright (C) 2025. Samad Talukder (https://github.com/samadtalukder/)
 */

package com.samad_talukder.jetpackcanvas.ui.screens.home.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.samad_talukder.jetpackcanvas.ui.screens.home.appbars.CenterAlignedTopAppBarScreen
import com.samad_talukder.jetpackcanvas.ui.screens.home.appbars.CustomTopAppBarScreen
import com.samad_talukder.jetpackcanvas.ui.screens.home.appbars.LargeTopAppBarScreen
import com.samad_talukder.jetpackcanvas.ui.screens.home.appbars.MediumTopAppBarScreen
import com.samad_talukder.jetpackcanvas.ui.screens.home.cards.BasicCardScreen
import com.samad_talukder.jetpackcanvas.ui.screens.home.cards.FilledCardScreen
import com.samad_talukder.jetpackcanvas.ui.screens.home.cards.OutlinedCardScreen
import com.samad_talukder.jetpackcanvas.ui.screens.home.login.LogInUI_1
import com.samad_talukder.jetpackcanvas.ui.screens.home.material.AlertDialogExample
import com.samad_talukder.jetpackcanvas.utils.bottomNavGraph

@Composable
fun AppNavGraph(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier
) {
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

        // Dialog Screens
        composable(AppRoute.DialogAlert.route) {
            AlertDialogExample()
        }

        // Splash Screens
        composable(AppRoute.SplashSample1.route) {
            LogInUI_1()
        }



    }
}


