/**
 *  Copyright (C) 2025. Samad Talukder (https://github.com/samadtalukder/)
 */
package com.samad_talukder.jetpackcanvas.ui.screens.home.dialog

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.samad_talukder.jetpackcanvas.ui.components.CustomText

@Composable
fun DialogWithTextFieldScreen() {
    var isShowDialog by remember { mutableStateOf(false) }

    Column(
        Modifier.fillMaxSize(),
        Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = { isShowDialog = !isShowDialog },
            Modifier.wrapContentSize()
        ) {
            CustomText(text = "Show Dialog")
        }
    }

    if (isShowDialog) {
        DialogTextFieldItem(onDismiss = {
            isShowDialog = !isShowDialog
        })
    }


}

@Composable
fun DialogTextFieldItem(onDismiss: () -> Unit) {
    val context = LocalContext.current
    var searchedFood by remember {
        mutableStateOf("")
    }

    Dialog(onDismissRequest = { onDismiss() }) {
        Card(
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.padding(8.dp),
            elevation = CardDefaults.cardElevation(8.dp)
        ) {
            Column(
                Modifier
                    .background(Color.White)
            ) {

                CustomText(
                    text = "Search your favorite food",
                    modifier = Modifier.padding(8.dp),
                    fontSize = 20.sp
                )

                OutlinedTextField(
                    value = searchedFood,
                    onValueChange = { searchedFood = it },
                    modifier = Modifier.padding(8.dp),
                    label = { CustomText(text = "Favorite Food") }
                )

                Row {
                    OutlinedButton(
                        onClick = {
                            onDismiss()
                        },
                        Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                            .weight(1f)
                    ) {
                        CustomText(text = "Cancel")
                    }


                    Button(
                        onClick = {
                            Toast.makeText(context, searchedFood, Toast.LENGTH_SHORT).show()
                        },
                        Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                            .weight(1f)
                    ) {
                        CustomText(text = "Search")
                    }
                }


            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewDialogWithTextFieldScreen() {
    DialogWithTextFieldScreen()
}