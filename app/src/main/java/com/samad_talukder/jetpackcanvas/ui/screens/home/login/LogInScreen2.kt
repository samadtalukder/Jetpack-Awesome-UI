/**
 *  Copyright (C) 2025. Samad Talukder (https://github.com/samadtalukder/)
 */
package com.samad_talukder.jetpackcanvas.ui.screens.home.login

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Facebook
import androidx.compose.material.icons.filled.Mail
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
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
import com.samad_talukder.jetpackcanvas.ui.components.CustomBreak
import com.samad_talukder.jetpackcanvas.ui.components.CustomEditTextRounded
import com.samad_talukder.jetpackcanvas.ui.components.CustomRoundedButton
import com.samad_talukder.jetpackcanvas.ui.components.CustomText
import com.samad_talukder.jetpackcanvas.ui.components.SocialMediaButton
import com.samad_talukder.jetpackcanvas.ui.theme.BlueGray95
import com.samad_talukder.jetpackcanvas.ui.theme.ColorBlack
import com.samad_talukder.jetpackcanvas.ui.theme.ColorWhite
import com.samad_talukder.jetpackcanvas.ui.theme.Grey40
import com.samad_talukder.jetpackcanvas.ui.theme.Grey60
import com.samad_talukder.jetpackcanvas.ui.theme.LightGrayBackground
import com.samad_talukder.jetpackcanvas.ui.theme.Teal80

@Composable
fun LogInScreen2() {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 10.dp)
    ) {
        CustomBreak(height = 20.dp)

        CustomText(
            text = stringResource(id = R.string.login),
            textColor = ColorBlack,
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
        )

        CustomBreak(height = 50.dp)

        EmailTextField(emailValue = email, onValueChange = { email = it })

        CustomBreak(height = 10.dp)

        PasswordTextField(passwordValue = password, onValueChange = { password = it })

        CustomText(
            text = stringResource(id = R.string.forgot_password),
            modifier = Modifier
                .padding(top = 8.dp, end = 20.dp)
                .fillMaxWidth(),
            textColor = Teal80,
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp,
            textAlign = TextAlign.End,
        )

        CustomBreak(height = 40.dp)
        LoginBtn()

        CustomBreak(height = 30.dp)
        SingUpTextField()

        CustomBreak(height = 30.dp)
        ORField()

        CustomBreak(height = 30.dp)

        SocialMediaButton(
            text = "Sign in with Google",
            icon = R.drawable.ic_google_logo,
            onClick = {}
        )

        CustomBreak(height = 10.dp)

        SocialMediaButton(
            text = "Sign in with Apple",
            icon = R.drawable.ic_apple_logo,
            onClick = {}
        )

        CustomBreak(height = 10.dp)

        SocialMediaButton(
            text = "Sign in with Facebook",
            icon = R.drawable.ic_facebook_logo,
            onClick = {}
        )
    }
}

@Composable
fun ORField() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        HorizontalDivider(
            color = LightGrayBackground,
            thickness = 1.5.dp,
            modifier = Modifier.width(140.dp)
        )

        CustomText(
            text = stringResource(id = R.string.or),
            textColor = Color(0xFF8B8B97),
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp
        )

        HorizontalDivider(
            color = LightGrayBackground,
            thickness = 1.5.dp,
            modifier = Modifier.width(140.dp)
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
        hint = stringResource(id = R.string.enter_password),
        containerColor = BlueGray95,
        leadingIcon = {
            ShowLeadingIcon(Icons.Default.Facebook)
        },
        trailingIcon = {
            val image =
                if (isPasswordVisible) Icons.Filled.Visibility else Icons.Filled.VisibilityOff
            IconButton(onClick = { isPasswordVisible = !isPasswordVisible }) {
                Icon(
                    imageVector = image,
                    contentDescription = null,
                    modifier = Modifier.padding(end = 10.dp),
                    tint = Grey60
                )
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
        tint = Grey60
    )
}

@Composable
fun EmailTextField(emailValue: String, onValueChange: (String) -> Unit) {
    CustomEditTextRounded(
        value = emailValue,
        onValueChange = onValueChange,
        hint = stringResource(id = R.string.enter_email),
        keyboardType = KeyboardType.Email,
        containerColor = BlueGray95,
        leadingIcon = {
            ShowLeadingIcon(Icons.Default.Mail)
        },
    )
}

@Composable
fun LoginBtn() {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        CustomRoundedButton(
            btnText = stringResource(id = R.string.login),
            fontFamily = FontFamily(Font(R.font.nunito_bold)),
            containerColor = Teal80,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
                .height(56.dp)
                .border(
                    BorderStroke(width = 0.dp, color = ColorWhite),
                    shape = RoundedCornerShape(30.dp)
                ),
            textColor = ColorWhite,
            fontSize = 16.sp,
            onBtnClick = {},
            btnElevation = 8.dp,
        )

    }
}

@Composable
fun SingUpTextField() {
    Row {

        CustomText(
            text = stringResource(id = R.string.dont_have_account),
            textColor = Grey40,
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp
        )

        CustomBreak(width = 6.dp)

        CustomText(
            text = stringResource(id = R.string.sign_up),
            textColor = Teal80,
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp,
        )
    }

}

@Preview(showSystemUi = true)
@Composable
fun PreviewLoginUI2() {
    LogInScreen2()
}