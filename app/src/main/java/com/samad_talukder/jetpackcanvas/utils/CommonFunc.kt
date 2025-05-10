/**
 *  Copyright (C) 2025. Samad Talukder (https://github.com/samadtalukder/)
 */
package com.samad_talukder.jetpackcanvas.utils

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Article
import androidx.compose.material.icons.automirrored.filled.HelpOutline
import androidx.compose.material.icons.automirrored.filled.Segment
import androidx.compose.material.icons.automirrored.filled.ViewSidebar
import androidx.compose.material.icons.filled.AccessTimeFilled
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Animation
import androidx.compose.material.icons.filled.Aod
import androidx.compose.material.icons.filled.AppRegistration
import androidx.compose.material.icons.filled.Apps
import androidx.compose.material.icons.filled.ArrowDropDownCircle
import androidx.compose.material.icons.filled.AutoAwesomeMotion
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.CheckBoxOutlineBlank
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.CreditCard
import androidx.compose.material.icons.filled.Dashboard
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.DensityMedium
import androidx.compose.material.icons.filled.Details
import androidx.compose.material.icons.filled.DevicesOther
import androidx.compose.material.icons.filled.Downloading
import androidx.compose.material.icons.filled.DragHandle
import androidx.compose.material.icons.filled.Expand
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.FilterAlt
import androidx.compose.material.icons.filled.FormatColorText
import androidx.compose.material.icons.filled.FormatShapes
import androidx.compose.material.icons.filled.FormatUnderlined
import androidx.compose.material.icons.filled.HideImage
import androidx.compose.material.icons.filled.HorizontalSplit
import androidx.compose.material.icons.filled.HourglassTop
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Layers
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.MilitaryTech
import androidx.compose.material.icons.filled.Navigation
import androidx.compose.material.icons.filled.NewLabel
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Payment
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.RadioButtonChecked
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Repartition
import androidx.compose.material.icons.filled.Reviews
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.ShoppingCartCheckout
import androidx.compose.material.icons.filled.Slideshow
import androidx.compose.material.icons.filled.SmartButton
import androidx.compose.material.icons.filled.SmartDisplay
import androidx.compose.material.icons.filled.SwipeLeft
import androidx.compose.material.icons.filled.Tab
import androidx.compose.material.icons.filled.TextFields
import androidx.compose.material.icons.filled.ToggleOn
import androidx.compose.material.icons.filled.Tune
import androidx.compose.material.icons.filled.Update
import androidx.compose.material.icons.filled.Verified
import androidx.compose.material.icons.filled.VideoChat
import androidx.compose.material.icons.filled.ViewCarousel
import androidx.compose.material.icons.filled.ViewColumn
import androidx.compose.material.icons.filled.ViewComfy
import androidx.compose.material.icons.filled.ViewInAr
import androidx.compose.material.icons.filled.WaterDrop
import androidx.compose.material.icons.filled.Widgets
import com.samad_talukder.jetpackcanvas.data.models.BottomNavItem
import com.samad_talukder.jetpackcanvas.data.models.HomeCategory
import com.samad_talukder.jetpackcanvas.data.models.HomeCategoryItem
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.BasicBtn
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.BasicCard
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
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.IconBtn
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.LargeAppBar
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.LogIn1
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.LogIn2
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.MediumAppBar
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.OutlinedBtn
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.OutlinedCard
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.SplashSample1
import com.samad_talukder.jetpackcanvas.ui.screens.home.navigation.AppRoute.TextBtn

object CommonFunc {
    fun getNavigationItems(): List<BottomNavItem> {
        return listOf(
            BottomNavItem(
                title = "Screens",
                selectedIcon = Icons.Default.Widgets,
                icon = Icons.Default.Widgets,
                route = AppRoute.BottomScreens.route
            ),
            BottomNavItem(
                title = "Apps",
                selectedIcon = Icons.Default.Apps,
                icon = Icons.Default.Apps,
                route = AppRoute.BottomApps.route
            ),
            BottomNavItem(
                title = "Bookmark",
                selectedIcon = Icons.Default.Bookmark,
                icon = Icons.Default.BookmarkBorder,
                route = AppRoute.BottomFavorites.route,
                badgeCount = 5
            ),
            BottomNavItem(
                title = "Settings",
                selectedIcon = Icons.Default.Settings,
                icon = Icons.Default.Settings,
                route = AppRoute.BottomSettings.route
            )
        )
    }

    fun getHomeCategories(): List<HomeCategory> {
        return listOf(
            HomeCategory(
                id = "animation",
                title = "Animation",
                icon = Icons.Default.Animation,
                items = emptyList()
            ),

            HomeCategory(
                id = "app_bars",
                title = "App Bars",
                icon = Icons.Default.AppRegistration,
                isNew = true,
                items = listOf(
                    HomeCategoryItem(
                        title = "Custom Top App Bar",
                        route = CustomTopAppBar.route
                    ),
                    HomeCategoryItem(
                        title = "Center Aligned Top App Bar",
                        route = CenterAlignedTopAppBar.route
                    ),
                    HomeCategoryItem(
                        title = "Medium Top App Bar",
                        route = MediumAppBar.route
                    ),
                    HomeCategoryItem(
                        title = "Large Top App Bar",
                        route = LargeAppBar.route
                    ),
                ),
            ),

            HomeCategory(
                id = "badges",
                title = "Badges",
                icon = Icons.Default.MilitaryTech,
                items = emptyList()
            ),


            HomeCategory(
                id = "bottom_nav",
                title = "Bottom Navigation",
                icon = Icons.Default.Navigation,
                items = emptyList()
            ),

            HomeCategory(
                id = "bottom_sheet",
                title = "Bottom Sheet",
                icon = Icons.Default.ExpandLess,
                items = emptyList()
            ),

            HomeCategory(
                id = "box",
                title = "Box",
                icon = Icons.Default.CheckBoxOutlineBlank,
                items = emptyList()
            ),

            HomeCategory(
                id = "buttons",
                title = "Buttons",
                isNew = true,
                icon = Icons.Default.SmartButton,
                items = listOf(
                    HomeCategoryItem(
                        title = "Basic Button",
                        route = BasicBtn.route
                    ),
                    HomeCategoryItem(
                        title = "Elevated Button",
                        route = ElevatedBtn.route
                    ),
                    HomeCategoryItem(
                        title = "Filled Tonal Button",
                        route = FilledTonalBtn.route
                    ),
                    HomeCategoryItem(
                        title = "Filled Tonal Icon Button",
                        route = FilledTonalIconBtn.route
                    ),
                    HomeCategoryItem(
                        title = "Floating Action Button",
                        route = FABtn.route
                    ),
                    HomeCategoryItem(
                        title = "Icon Button",
                        route = IconBtn.route
                    ),
                    HomeCategoryItem(
                        title = "Outlined Button",
                        route = OutlinedBtn.route
                    ),
                    HomeCategoryItem(
                        title = "Text Button",
                        route = TextBtn.route
                    ),
                )
            ),

            HomeCategory(
                id = "cards",
                title = "Cards",
                isNew = true,
                icon = Icons.Default.CreditCard,
                items = listOf(
                    HomeCategoryItem(
                        title = "Basic",
                        route = BasicCard.route
                    ),
                    HomeCategoryItem(
                        title = "Filled",
                        route = FilledCard.route
                    ),
                    HomeCategoryItem(
                        title = "Outlined",
                        route = OutlinedCard.route
                    ),
                ),
            ),

            HomeCategory(
                id = "carousel",
                title = "Carousel",
                icon = Icons.Default.ViewCarousel,
                items = emptyList()
            ),

            HomeCategory(
                id = "checkbox",
                title = "Checkbox",
                icon = Icons.Default.CheckCircle,
                items = emptyList()
            ),

            HomeCategory(
                id = "chips",
                title = "Chips",
                icon = Icons.Default.NewLabel,
                items = emptyList()
            ),

            HomeCategory(
                id = "column",
                title = "Column",
                icon = Icons.Default.ViewColumn,
                items = emptyList()
            ),

            HomeCategory(
                id = "date_pickers",
                title = "Date Picker",
                icon = Icons.Default.DateRange,
                items = emptyList()
            ),

            HomeCategory(
                id = "dialogs",
                title = "Dialogs",
                isNew = true,
                icon = Icons.Default.Info,
                items = listOf(
                    HomeCategoryItem(
                        title = "Dialog Basic",
                        route = DialogBasic.route
                    ),
                    HomeCategoryItem(
                        title = "Dialog With Text",
                        route = DialogWithText.route
                    ),
                    HomeCategoryItem(
                        title = "Dialog With Text and Image",
                        route = DialogWithImageAndText.route
                    ),
                    HomeCategoryItem(
                        title = "Dialog With TextField",
                        route = DialogWithTextField.route
                    ),
                    HomeCategoryItem(
                        title = "Alert Dialog",
                        route = DialogAlert.route
                    ),
                ),
            ),

            HomeCategory(
                id = "divider",
                title = "Divider",
                icon = Icons.Default.FormatUnderlined,
                items = emptyList()
            ),

            HomeCategory(
                id = "draggable",
                title = "Draggable",
                icon = Icons.Default.DragHandle,
                items = emptyList()
            ),

            HomeCategory(
                id = "dropdown_menu",
                title = "Dropdown Menu",
                icon = Icons.Default.ArrowDropDownCircle,
                items = emptyList()
            ),

            HomeCategory(
                id = "expansion_panels",
                title = "Expansion Panels",
                icon = Icons.Default.Expand,
                items = emptyList()
            ),

            HomeCategory(
                id = "fab",
                title = "Floating Action Button",
                icon = Icons.Default.AddCircle,
                items = emptyList()
            ),

            HomeCategory(
                id = "image",
                title = "Images & Icons",
                icon = Icons.Default.Image,
                items = emptyList()
            ),

            HomeCategory(
                id = "layout",
                title = "Layout",
                isNew = true,
                icon = Icons.Default.Layers,
                items = listOf(
                    HomeCategoryItem(
                        title = "Constraint Layout Basic",
                        route = ConstraintLayoutBasic.route
                    ),
                ),
            ),

            HomeCategory(
                id = "list_column",
                title = "List (Column, Row & Grid)",
                icon = Icons.Default.ViewComfy,
                items = emptyList()
            ),

            HomeCategory(
                id = "menus",
                title = "Menus",
                icon = Icons.AutoMirrored.Filled.Segment,
                items = emptyList()
            ),

            HomeCategory(
                id = "modifiers",
                title = "Modifiers",
                icon = Icons.Filled.Update,
                items = emptyList()
            ),

            HomeCategory(
                id = "motion",
                title = "Motion",
                icon = Icons.Default.AutoAwesomeMotion,
                items = emptyList()
            ),

            HomeCategory(
                id = "nav_bar",
                title = "Navigation Bar",
                icon = Icons.AutoMirrored.Filled.Segment,
                items = emptyList()
            ),

            HomeCategory(
                id = "nav_drawer",
                title = "Navigation Drawer",
                icon = Icons.Filled.DensityMedium,
                items = emptyList()
            ),

            HomeCategory(
                id = "nav_rail",
                title = "Navigation Rail",
                icon = Icons.AutoMirrored.Filled.ViewSidebar,
                items = emptyList()
            ),

            HomeCategory(
                id = "popups",
                title = "Popups",
                icon = Icons.Filled.HourglassTop,
                items = emptyList()
            ),

            HomeCategory(
                id = "progress_indicator",
                title = "Progress Indicator",
                icon = Icons.Default.Downloading,
                items = emptyList()
            ),

            HomeCategory(
                id = "radio_button",
                title = "Radio Button",
                icon = Icons.Default.RadioButtonChecked,
                items = emptyList()
            ),

            HomeCategory(
                id = "row",
                title = "Row",
                icon = Icons.Default.HorizontalSplit,
                items = emptyList()
            ),

            HomeCategory(
                id = "scaffold",
                title = "Scaffold",
                icon = Icons.Default.DevicesOther,
                items = emptyList()
            ),

            HomeCategory(
                id = "search",
                title = "Search Bar",
                icon = Icons.Default.Search,
                items = emptyList()
            ),

            HomeCategory(
                id = "shapes",
                title = "Shape & Images",
                icon = Icons.Default.FormatShapes,
                items = emptyList()
            ),

            HomeCategory(
                id = "side_sheets",
                title = "Side Sheets",
                icon = Icons.Default.Slideshow,
                items = emptyList()
            ),

            HomeCategory(
                id = "sliders",
                title = "Sliders",
                icon = Icons.Default.Tune,
                items = emptyList()
            ),

            HomeCategory(
                id = "snackbar",
                title = "Snackbars",
                icon = Icons.Default.Info,
                items = emptyList()
            ),

            HomeCategory(
                id = "surface",
                title = "Surface",
                icon = Icons.Default.ViewInAr,
                items = emptyList()
            ),

            HomeCategory(
                id = "swipe_refresh",
                title = "Swipe to Refresh",
                icon = Icons.Default.Refresh,
                items = emptyList()
            ),

            HomeCategory(
                id = "switch",
                title = "Switches",
                icon = Icons.Default.ToggleOn,
                items = emptyList()
            ),

            HomeCategory(
                id = "tabs",
                title = "Tabs (Segmented button)",
                icon = Icons.Default.Tab,
                items = emptyList()
            ),

            HomeCategory(
                id = "text_typo",
                title = "Text & Typography",
                icon = Icons.Default.FormatColorText,
                items = emptyList()
            ),

            HomeCategory(
                id = "text_fields",
                title = "Text Fields",
                icon = Icons.Default.TextFields,
                items = emptyList()
            ),

            HomeCategory(
                id = "time_pickers",
                title = "Time Picker",
                icon = Icons.Default.AccessTimeFilled,
                items = emptyList()
            ),

            HomeCategory(
                id = "tooltips",
                title = "Tooltips",
                icon = Icons.AutoMirrored.Filled.HelpOutline,
                items = emptyList()
            ),


            HomeCategory(
                id = "splash",
                title = "Splash",
                isNew = true,
                icon = Icons.Default.WaterDrop,
                items = listOf(
                    HomeCategoryItem(
                        title = "Sample 1",
                        route = SplashSample1.route
                    ),
                ),
            ),

            HomeCategory(
                id = "onboard",
                title = "Onboard",
                icon = Icons.Default.SwipeLeft,
                items = emptyList()
            ),

            HomeCategory(
                id = "auth",
                title = "Authentication",
                icon = Icons.Default.Lock,
                items = listOf(
                    HomeCategoryItem(
                        title = "Log In Sample 1",
                        route = LogIn1.route
                    ),
                    HomeCategoryItem(
                        title = "Log In Sample 2",
                        route = LogIn2.route
                    ),
                ),
            ),

            HomeCategory(
                id = "profile",
                title = "Profile",
                icon = Icons.Default.Person,
                items = emptyList()
            ),

            HomeCategory(
                id = "no_item",
                title = "No Item",
                icon = Icons.Default.HideImage,
                items = emptyList()
            ),

            HomeCategory(
                id = "player",
                title = "Player",
                icon = Icons.Default.SmartDisplay,
                items = emptyList()
            ),

            HomeCategory(
                id = "timeline",
                title = "Timeline",
                icon = Icons.Default.Repartition,
                items = emptyList()
            ),

            HomeCategory(
                id = "settings",
                title = "Settings",
                icon = Icons.Default.Settings,
                items = emptyList()
            ),

            HomeCategory(
                id = "verification",
                title = "Verification",
                icon = Icons.Default.Verified,
                items = emptyList()
            ),

            HomeCategory(
                id = "cart",
                title = "Shopping Cart",
                icon = Icons.Default.ShoppingCart,
                items = emptyList()
            ),

            HomeCategory(
                id = "checkout",
                title = "Checkout",
                icon = Icons.Default.ShoppingCartCheckout,
                items = emptyList()
            ),

            HomeCategory(
                id = "payment",
                title = "Payment",
                icon = Icons.Default.Payment,
                items = emptyList()
            ),

            HomeCategory(
                id = "dashboard",
                title = "Dashboard",
                icon = Icons.Default.Dashboard,
                items = emptyList()
            ),

            HomeCategory(
                id = "notification",
                title = "Notifications",
                icon = Icons.Default.Notifications,
                items = emptyList()
            ),

            HomeCategory(
                id = "reviews",
                title = "Reviews",
                icon = Icons.Default.Reviews,
                items = emptyList()
            ),

            HomeCategory(
                id = "filters",
                title = "Filters",
                icon = Icons.Default.FilterAlt,
                items = emptyList()
            ),

            HomeCategory(
                id = "details",
                title = "Details",
                icon = Icons.Default.Details,
                items = emptyList()
            ),

            HomeCategory(
                id = "article",
                title = "Article",
                icon = Icons.AutoMirrored.Filled.Article,
                items = emptyList()
            ),

            HomeCategory(
                id = "chat",
                title = "Chat",
                icon = Icons.Default.VideoChat,
                items = emptyList()
            ),

            HomeCategory(
                id = "about",
                title = "About",
                icon = Icons.Default.Aod,
                items = emptyList()
            ),
        )
    }
}