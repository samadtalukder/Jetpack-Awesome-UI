package com.samad_talukder.jetpackcanvas.ui.login

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Mail
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.samad_talukder.jetpackcanvas.R
import com.samad_talukder.jetpackcanvas.components.CustomEditTextRounded

@Composable
fun LogInUI_2() {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 10.dp)
    ) {
        Spacer(modifier = Modifier.height(10.dp))

        EmailTextField(emailValue = email, onValueChange = { email = it })

        Spacer(modifier = Modifier.height(10.dp))

        PasswordTextField(passwordValue = password, onValueChange = { password = it })

        Text(
            text = "Forgot Password?",
            modifier = Modifier
                .padding(top = 8.dp, end = 20.dp)
                .fillMaxWidth(),
            textAlign = TextAlign.End,
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 14.sp,
                fontFamily = FontFamily(Font(R.font.nunito_medium)),
                fontWeight = FontWeight(400),
                color = Color(0xFF19998E),
            )
        )
    }
}

@Composable
fun PasswordTextField(passwordValue: String, onValueChange: (String) -> Unit) {
    var isPasswordVisible by remember { mutableStateOf(false) }

    CustomEditTextRounded(
        value = passwordValue,
        keyboardType = KeyboardType.Password,
        onValueChange = onValueChange,
        visualTransformation = if (isPasswordVisible) VisualTransformation.None else PasswordVisualTransformation(),
        hint = "Enter your password",
        containerColor = Color(0xFFF5F8FE),
        textColor = Color(0xFF000000),
        hintTextColor = Color(0xFFBBC1C6),
        leadingIcon = {
            ShowLeadingIcon(Icons.Default.Lock)
        },
        trailingIcon = {
            val image =
                if (isPasswordVisible) Icons.Filled.Visibility else Icons.Filled.VisibilityOff
            IconButton(onClick = { isPasswordVisible = !isPasswordVisible }) {
                ShowLeadingIcon(imageVector = image)
            }
        }
    )
}

@Composable
fun ShowLeadingIcon(imageVector: ImageVector) {
    Icon(
        imageVector = imageVector,
        contentDescription = null,
        modifier = Modifier.padding(start = 10.dp),
        tint = Color(0xFFBBC1C6)
    )
}

@Composable
fun EmailTextField(emailValue: String, onValueChange: (String) -> Unit) {
    CustomEditTextRounded(
        value = emailValue,
        onValueChange = onValueChange,
        hint = "Enter your email",
        keyboardType = KeyboardType.Email,
        containerColor = Color(0xFFF5F8FE),
        textColor = Color(0xFF000000),
        hintTextColor = Color(0xFFBBC1C6),
        leadingIcon = {
            ShowLeadingIcon(Icons.Default.Mail)
        },
    )
}


@Preview(showSystemUi = true)
@Composable
fun PreviewLoginUI2() {
    LogInUI_2()
}