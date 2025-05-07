/**
 *  Copyright (C) 2025. Samad Talukder (https://github.com/samadtalukder/)
 */
package com.samad_talukder.jetpackcanvas.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.PaintingStyle
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.unit.Dp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute
import com.samad_talukder.jetpackcanvas.ui.screens.apps.AppsScreen
import com.samad_talukder.jetpackcanvas.ui.screens.favorites.FavoritesScreen
import com.samad_talukder.jetpackcanvas.ui.screens.home.HomeScreen
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.BottomApps
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.BottomFavorites
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.BottomScreens
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.BottomSettings
import com.samad_talukder.jetpackcanvas.ui.screens.settings.SettingsScreen

fun Modifier.drawDashedBorder(width: Dp, radius: Dp, color: Color) = drawBehind {
    drawIntoCanvas {
        val paint = Paint().apply {
            strokeWidth = width.toPx()
            this.color = color
            style = PaintingStyle.Stroke
            pathEffect = PathEffect.dashPathEffect(floatArrayOf(10f, 10f), 0f)
        }
        it.drawRoundRect(
            width.toPx(),
            width.toPx(),
            size.width - width.toPx(),
            size.height - width.toPx(),
            radius.toPx(),
            radius.toPx(),
            paint
        )
    }
}

fun NavHostController.navigateRoute(destination: AppRoute) {
    navigate(destination.route)
}

fun NavHostController.navigateToAndClearBackStack(destination: AppRoute) {
    navigate(destination.route) {
        popUpTo(graph.startDestinationId) {
            inclusive = true
        }
        launchSingleTop = true
        restoreState = true
    }
}

fun NavHostController.navigateToTopLevelDestination(route: String) {
    navigate(route) {
        popUpTo(graph.findStartDestination().id) {
            saveState = true
        }
        launchSingleTop = true
        restoreState = true
    }
}

inline fun <reified T : AppRoute> NavGraphBuilder.composableRoute(
    noinline content: @Composable () -> Unit
) {
    val route = (T::class.java.getDeclaredField("route").get(null) as? String)
        ?: error("Route property not found for ${T::class.simpleName}")
    composable(route) { content() }
}

fun NavGraphBuilder.bottomNavGraph(navController: NavHostController) {
    composable(BottomScreens.route) {
        HomeScreen(navController)
    }

    composable(BottomApps.route) {
        AppsScreen()
    }

    composable(BottomFavorites.route) {
        FavoritesScreen()
    }

    composable(BottomSettings.route) {
        SettingsScreen()
    }
}

fun isBottomNavRoute(route: String?): Boolean {
    return route == BottomScreens.route ||
            route == BottomApps.route ||
            route == BottomFavorites.route ||
            route == BottomSettings.route
}



