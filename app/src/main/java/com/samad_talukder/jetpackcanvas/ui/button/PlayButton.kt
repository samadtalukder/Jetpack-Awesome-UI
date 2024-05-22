package com.samad_talukder.jetpackcanvas.ui.button

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Paid
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.samad_talukder.jetpackcanvas.R
import com.samad_talukder.jetpackcanvas.components.CustomBreak
import com.samad_talukder.jetpackcanvas.ui.login.LogInUI_2

/*
* Types of Button
* Normal Button
* Normal Button with full width
* Outlined Button
* Rounded Button
* Rounded edge at the top start
* Cut Corner Shape Button
* Text Button
* Outlined Button with Border stroke
* Icon button
* Horizontal gradient button
* Vertical gradient button
* Icon button
* Icon button with tint color
* Outline icon button
* Floating Action Button
* Floating Action (Text+Icon)
* Floating Action (Text)
*
* */

@Composable
fun PlayDifferentTypesOfBtn() {
    val context = LocalContext.current.applicationContext

    LazyColumn(
        modifier = Modifier
            .padding(start = 20.dp, top = 20.dp)
            .fillMaxSize(),
        content = {
            item {
                Button(onClick = {
                    Toast.makeText(context, "Click Button", Toast.LENGTH_SHORT).show()
                }) {
                    Text(text = "Simple Button")
                }

                OutlinedButton(onClick = { /*TODO*/ }) {
                    Text(text = "Outlined Button")
                }

                TextButton(onClick = { /*TODO*/ }) {
                    Text(text = "Text Button")
                }

                IconButton(onClick = {}) {
                    Row {
                        Icon(
                            imageVector = Icons.Outlined.Paid,
                            contentDescription = "",
                            modifier = Modifier.size(24.dp)
                        )
                        Spacer(Modifier.width(8.dp))
                        Text(text = "Icon")
                    }
                }

                Spacer(Modifier.height(8.dp))

                ElevatedButton(onClick = { /*TODO*/ }) {
                    Text(text = "Elevated Button")
                }

                FloatingActionButton(onClick = { /*TODO*/ }) {
                    Text(text = "Floating Action Button")
                }
            }
        })
}


@Preview(showSystemUi = true)
@Composable
fun PreviewPlayDifferentTypesOfBtn() {
    PlayDifferentTypesOfBtn()
}