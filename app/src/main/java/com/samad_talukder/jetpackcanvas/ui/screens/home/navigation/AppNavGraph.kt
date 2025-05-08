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

        composable(AppRoute.SplashSample1.route) {
            LogInUI_1()
        }

        composable(AppRoute.DialogAlert.route) {
            AlertDialogExample()
        }

    }
}


