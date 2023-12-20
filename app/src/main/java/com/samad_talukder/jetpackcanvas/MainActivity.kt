package com.samad_talukder.jetpackcanvas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.samad_talukder.jetpackcanvas.ui.login.LogInUI_1
import com.samad_talukder.jetpackcanvas.ui.login.LogInUI_2
import com.samad_talukder.jetpackcanvas.ui.theme.JetpackCanvasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackCanvasTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LogInUI_2()
                }
            }
        }
    }
}

