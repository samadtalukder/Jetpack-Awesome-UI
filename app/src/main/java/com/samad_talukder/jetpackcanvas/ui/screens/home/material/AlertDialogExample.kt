/**
 *  Copyright (C) 2025. Samad Talukder (https://github.com/samadtalukder/)
 */
package com.samad_talukder.jetpackcanvas.ui.screens.home.material


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.samad_talukder.jetpackcanvas.ui.components.CustomText

@Composable
fun AlertDialogExample() {
    var showDialog by remember {
        mutableStateOf(false)
    }

    if (showDialog) {
        AlertDialog(
            icon = {},
            title = {
                CustomText(
                    text = "Transaction Rejected",
                )
            },
            text = {
                CustomText(
                    text = "You may view the status of your transaction via Connect Online.",
                    textAlign = TextAlign.Center
                )
            },
            onDismissRequest = {},
            confirmButton = {
                Button(onClick = { showDialog = false }) {
                    CustomText(
                        text = "Ok",
                    )
                }
            },
            dismissButton = {},
        )
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { showDialog = true }) {
            CustomText(text = "Show Dialog")
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewAlertDialog() {
    AlertDialogExample()
}






