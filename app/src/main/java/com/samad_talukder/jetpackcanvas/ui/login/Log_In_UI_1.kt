package com.samad_talukder.jetpackcanvas.ui.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
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
import com.samad_talukder.jetpackcanvas.components.CustomBreak
import com.samad_talukder.jetpackcanvas.components.CustomEditText
import com.samad_talukder.jetpackcanvas.components.CustomImage
import com.samad_talukder.jetpackcanvas.components.CustomText
import com.samad_talukder.jetpackcanvas.components.SocialLoginBtn

@Composable
fun LogInUI_1() {
    Box(Modifier.background(Color(0xFFF0F1F5))) {
        Surface(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .clipToBounds(),
            color = (Color(0xFFFCFCFD))
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.verticalScroll(rememberScrollState())
            ) {
                HeaderTitleWithIcon()
                Spacer(modifier = Modifier.height(40.dp))
                MobileNoInputField()
                Spacer(modifier = Modifier.height(20.dp))
                PasswordInputField()
                Spacer(modifier = Modifier.height(40.dp))
                LoginButton()
                Spacer(modifier = Modifier.height(40.dp))
                SocialLoginButton()
                Spacer(modifier = Modifier.height(30.dp))
                SingUpButton()
            }
        }
    }
}


@Composable
fun HeaderTitleWithIcon() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        CustomImage(
            imgSrc = R.drawable.ic_cart_logo_with_color,
            modifier = Modifier
                .padding(top = 30.dp)
                .width(120.dp)
                .height(120.dp)
        )

        CustomBreak(height = 30.dp)

        CustomText(
            value = stringResource(id = R.string.welcome_to_our),
            textColor = Color(0xFF16162E),
            fontFamily = FontFamily(Font(R.font.gilroy_bold)),
            fontWeight = FontWeight(400),
            textAlign = TextAlign.Center,
            fontSize = 24.sp
        )

        CustomText(
            value = stringResource(id = R.string.e_grocery),
            textColor = Color(0xFF048F6E),
            fontFamily = FontFamily(Font(R.font.gilroy_bold)),
            fontWeight = FontWeight(400),
            textAlign = TextAlign.Center,
            fontSize = 24.sp
        )
    }
}

@Composable
fun MobileNoInputField() {
    var mobileNo by remember {
        mutableStateOf("")
    }

    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,
    ) {

        Text(
            text = stringResource(id = R.string.mobile_no),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 14.sp,
                fontFamily = FontFamily(Font(R.font.gilroy_medium)),
                fontWeight = FontWeight(400),
                color = Color(0xFF8B8B97),
            )
        )
        Spacer(modifier = Modifier.height(10.dp))

        CustomEditText(
            value = mobileNo,
            onValueChange = { mobileNo = it },
            placeHolderText = "01XXXXXXX",
            containerColor = Color(0xFFF7F7F7),
            textColor = Color(0xFF000000),
            placeholderColorColor = Color(0xFF8B8B97),
            roundedCornerShape = RoundedCornerShape(8.dp),
            keyboardType = KeyboardType.Phone
        )
    }
}

@Composable
fun PasswordInputField() {
    var password by remember {
        mutableStateOf("")
    }
    var isPasswordVisible by remember {
        mutableStateOf(false)
    }

    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,
    ) {

        Text(
            text = stringResource(id = R.string.password),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 14.sp,
                fontFamily = FontFamily(Font(R.font.gilroy_medium)),
                fontWeight = FontWeight(400),
                color = Color(0xFF8B8B97),
            )
        )
        Spacer(modifier = Modifier.height(10.dp))

        CustomEditText(
            value = password,
            onValueChange = { password = it },
            placeHolderText = stringResource(id = R.string.password_hint_text),
            containerColor = Color(0xFFF7F7F7),
            textColor = Color(0xFF000000),
            placeholderColorColor = Color(0xFF8B8B97),
            roundedCornerShape = RoundedCornerShape(8.dp),
            keyboardType = KeyboardType.Password,
            trailingIcon = {
                val image =
                    if (isPasswordVisible) Icons.Filled.Visibility else Icons.Filled.VisibilityOff
                IconButton(onClick = { isPasswordVisible = !isPasswordVisible }) {
                    Icon(imageVector = image, contentDescription = "")
                }
            },
            visualTransformation = if (isPasswordVisible) VisualTransformation.None else PasswordVisualTransformation()

        )

        Text(
            text = stringResource(id = R.string.forgot_password),
            modifier = Modifier
                .padding(top = 8.dp, end = 20.dp)
                .fillMaxWidth(),
            textAlign = TextAlign.End,
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 14.sp,
                fontFamily = FontFamily(Font(R.font.gilroy_medium)),
                fontWeight = FontWeight(400),
                color = Color(0xFF16162E),
            )
        )

    }
}

@Composable
fun LoginButton() {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
                .height(56.dp),
            shape = RoundedCornerShape(15.dp),
            elevation = ButtonDefaults.buttonElevation(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF048F6E),
                contentColor = Color(0xFFFFFFFF)
            )
        ) {
            Text(
                text = stringResource(id = R.string.login),
                style = TextStyle(
                    fontSize = 16.sp,
                    lineHeight = 16.sp,
                    fontFamily = FontFamily(Font(R.font.gilroy_bold)),
                    fontWeight = FontWeight(400),
                    color = Color(0xFFFFFFFF),
                    textAlign = TextAlign.Center,
                    letterSpacing = 0.8.sp,
                )
            )
        }
    }
}

@Composable
fun SocialLoginButton() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
    ) {

        SocialLoginBtn(
            icon = R.drawable.ic_google_sign_in,
            socialMediaName = stringResource(id = R.string.google),
            modifier = Modifier.weight(1f),
            isGoogle = true,
        )

        Spacer(modifier = Modifier.width(20.dp))

        SocialLoginBtn(
            icon = R.drawable.ic_apple_sign_in,
            socialMediaName = stringResource(id = R.string.apple),
            modifier = Modifier.weight(1f),
            isGoogle = false,
        )


    }
}

@Composable
fun SingUpButton() {
    Row {
        Text(
            text = stringResource(id = R.string.dont_have_account),
            style = TextStyle(
                fontSize = 14.sp,
                fontFamily = FontFamily(Font(R.font.gilroy_medium)),
                fontWeight = FontWeight(400),
                color = Color(0xFF8B8B97),
            )
        )
        Spacer(modifier = Modifier.width(6.dp))
        Text(
            text = stringResource(id = R.string.sign_up),
            style = TextStyle(
                fontSize = 14.sp,
                fontFamily = FontFamily(Font(R.font.gilroy_bold)),
                fontWeight = FontWeight(400),
                color = Color(0xFF048F6E),
            )
        )
    }

}

@Preview(showSystemUi = true)
@Composable
fun PreviewUI() {
    LogInUI_1()
}