package com.samad_talukder.jetpackcanvas.material


import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.style.TextAlign

@Composable
fun AlertDialogExample() {
    var showDialog by remember {
        mutableStateOf(false)
    }


    if (showDialog) {
        AlertDialog(
            icon = {},
            title = {
                Text(
                    text = "Transaction Rejected",
                )
            },
            text = {
                Text(
                    text = "You may view the status of your transaction via Connect Online.",
                    textAlign = TextAlign.Center
                )
            },
            onDismissRequest = {},
            confirmButton = {
                Button(onClick = { showDialog = false }) {
                    Text(
                        text = "Ok",
                    )
                }
            },
            dismissButton = {

            },
        )
    }

    Button(onClick = { showDialog = true }) {
        Text(text = "Click")
    }
}






