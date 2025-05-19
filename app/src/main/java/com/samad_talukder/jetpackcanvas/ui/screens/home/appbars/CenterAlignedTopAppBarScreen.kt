/**
 *  Copyright (C) 2025. Samad Talukder (https://github.com/samadtalukder/)
 */
package com.samad_talukder.jetpackcanvas.ui.screens.home.appbars

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.tooling.preview.Preview
import com.samad_talukder.jetpackcanvas.ui.screens.home.components.ScrollContent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CenterAlignedTopAppBarScreen() {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())

    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    MaterialTheme.colorScheme.primaryContainer
                ),
                title = {
                    Text("John Doe")
                },
                navigationIcon = {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "menu items"
                    )
                },
                actions = {
                    Icon(
                        imageVector = Icons.Filled.Search,
                        contentDescription = "Localized description"
                    )
                },
            )
        }
    ) { inner ->
        ScrollContent(inner)

    }


}

@Preview
@Composable
private fun PreviewCenterAlignedTopAppBarScreen() {
    CenterAlignedTopAppBarScreen()
}