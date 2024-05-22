package com.samad_talukder.jetpackcanvas.material

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.NotificationsNone
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Videocam
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun TopAppBarExample() {
    // TopAppBarNavIconTitleActionIcon()
    // CustomTopAppBar()
    LargeTopAppBarExample()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CenterAlignedTopAppBarExample() {
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
                    IconButton({}) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "menu items"
                        )
                    }
                },
                actions = {
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Filled.Search,
                            contentDescription = "Localized description"
                        )
                    }
                },
            )
        }
    ) { inner ->
        ScrollContent(inner)

    }


}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MediumTopAppBarExample() {
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(rememberTopAppBarState())

    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            MediumTopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    MaterialTheme.colorScheme.primaryContainer
                ),
                title = {
                    Text("John Doe")
                },
                navigationIcon = {
                    IconButton({}) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "menu items"
                        )
                    }
                },
                actions = {
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Filled.Search,
                            contentDescription = "Localized description"
                        )
                    }
                },
                scrollBehavior = scrollBehavior
            )
        },

    ) { inner ->
        ScrollContent(inner)

    }


}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LargeTopAppBarExample() {
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(rememberTopAppBarState())

    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            LargeTopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    MaterialTheme.colorScheme.primaryContainer
                ),
                title = {
                    Text("John Doe")
                },
                navigationIcon = {
                    IconButton({}) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "menu items"
                        )
                    }
                },
                actions = {
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Filled.Search,
                            contentDescription = "Localized description"
                        )
                    }
                },
                scrollBehavior = scrollBehavior
            )
        },

    ) { inner ->
        ScrollContent(inner)

    }


}

@Composable
fun ScrollContent(inner: PaddingValues) {
    val range = 1..100
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top
    ) {
        items(range.count()) { index ->
            Text(
                text = "Item ${index + 1}",
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTopAppBar() {

    TopAppBar(
        title = {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    modifier = Modifier
                        .size(48.dp)
                        .fillMaxWidth()
                        .padding(end = 8.dp),
                    imageVector = Icons.Filled.AccountCircle,
                    contentDescription = "profile picture",
                )
                Text("John Doe")
            }
        },
        navigationIcon = {
            IconButton({}) {
                Icon(
                    imageVector = Icons.Filled.ArrowBack,
                    contentDescription = "menu items"
                )
            }
        },
        actions = {
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Filled.Videocam,
                    contentDescription = "video call",
                )
            }
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Filled.Call,
                    contentDescription = "phone call",
                )
            }
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Filled.MoreVert,
                    contentDescription = "more options",
                )
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            MaterialTheme.colorScheme.primaryContainer
        ),
    )
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarNavIconTitleActionIcon() {
    TopAppBar(
        title = {
            Text(
                text = "Jetpack Compose",
                textAlign = TextAlign.Center,
                fontSize = 14.sp,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                fontWeight = FontWeight.Medium
            )
        },
        actions = {
            IconButton(onClick = { }) {
                Icon(
                    Icons.Filled.Search,
                    contentDescription = null,
                    modifier = Modifier.padding(end = 20.dp)
                )
                Icon(
                    Icons.Filled.NotificationsNone,
                    contentDescription = null,
                    modifier = Modifier.padding(start = 20.dp)
                )
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Gray,
            titleContentColor = Color.White,
            actionIconContentColor = Color.White,
            navigationIconContentColor = Color.White,
        ),
        navigationIcon = {
            IconButton(onClick = { }) {
                Icon(
                    imageVector = Icons.Filled.ArrowBack,
                    contentDescription = "Navigation icon"
                )
            }
        }
    )
}

