package com.samad_talukder.jetpackcanvas.ui.login

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Mail
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
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
import com.samad_talukder.jetpackcanvas.components.AppleSignInButton
import com.samad_talukder.jetpackcanvas.components.CustomBreak
import com.samad_talukder.jetpackcanvas.components.CustomDivider
import com.samad_talukder.jetpackcanvas.components.CustomEditTextRounded
import com.samad_talukder.jetpackcanvas.components.CustomRoundedButton
import com.samad_talukder.jetpackcanvas.components.CustomText
import com.samad_talukder.jetpackcanvas.components.FacebookSignInButton
import com.samad_talukder.jetpackcanvas.components.GoogleSignInButton
import com.samad_talukder.jetpackcanvas.ui.theme.ColorBlack
import com.samad_talukder.jetpackcanvas.ui.theme.ColorTeal80
import com.samad_talukder.jetpackcanvas.ui.theme.ColorWhite
import com.samad_talukder.jetpackcanvas.ui.theme.Purple40

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
        CustomBreak(height = 20.dp)

        CustomText(
            value = stringResource(id = R.string.login),
            textColor = ColorBlack,
            fontFamily = FontFamily(Font(R.font.nunito_bold)),
            fontWeight = FontWeight(600),
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
        )

        CustomBreak(height = 50.dp)

        EmailTextField(emailValue = email, onValueChange = { email = it })

        CustomBreak(height = 10.dp)

        PasswordTextField(passwordValue = password, onValueChange = { password = it })

        CustomText(
            value = stringResource(id = R.string.forgot_password),
            modifier = Modifier
                .padding(top = 8.dp, end = 20.dp)
                .fillMaxWidth(),
            textColor = Color(0xFF19998E),
            fontFamily = FontFamily(Font(R.font.nunito_medium)),
            fontWeight = FontWeight(400),
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
        GoogleSignInButton()

        CustomBreak(height = 10.dp)
        AppleSignInButton()

        CustomBreak(height = 10.dp)
        FacebookSignInButton()

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
        CustomDivider(
            color = Color(0xFFEEEFF2),
            width = 140.dp,
            thickness = 1.5.dp
        )

        CustomText(
            value = stringResource(id = R.string.or),
            textColor = Color(0xFF8B8B97),
            fontFamily = FontFamily(Font(R.font.gilroy_medium)),
            fontWeight = FontWeight(400),
            fontSize = 14.sp
        )

        CustomDivider(
            color = Color(0xFFEEEFF2),
            width = 140.dp,
            thickness = 1.5.dp
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
        containerColor = Color(0xFFF5F8FE),
        textColor = ColorBlack,
        hintTextColor = Color(0xFFBBC1C6),
        leadingIcon = {
            ShowLeadingIcon(Icons.Default.Lock)
        },
        trailingIcon = {
            val image =
                if (isPasswordVisible) Icons.Filled.Visibility else Icons.Filled.VisibilityOff
            IconButton(onClick = { isPasswordVisible = !isPasswordVisible }) {
                Icon(
                    imageVector = image,
                    contentDescription = null,
                    modifier = Modifier.padding(end = 10.dp),
                    tint = Color(0xFFBBC1C6)
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
        tint = Color(0xFFBBC1C6)
    )
}

@Composable
fun EmailTextField(emailValue: String, onValueChange: (String) -> Unit) {
    CustomEditTextRounded(
        value = emailValue,
        onValueChange = onValueChange,
        hint = stringResource(id = R.string.enter_email),
        keyboardType = KeyboardType.Email,
        containerColor = Color(0xFFF5F8FE),
        textColor = ColorBlack,
        hintTextColor = Color(0xFFBBC1C6),
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
            containerColor = ColorTeal80,
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
            value = stringResource(id = R.string.dont_have_account),
            textColor = Color(0xFF8B8B97),
            fontFamily = FontFamily(Font(R.font.gilroy_medium)),
            fontWeight = FontWeight(400),
            fontSize = 14.sp
        )

        CustomBreak(width = 6.dp)

        CustomText(
            value = stringResource(id = R.string.sign_up),
            textColor = ColorTeal80,
            fontFamily = FontFamily(Font(R.font.gilroy_bold)),
            fontWeight = FontWeight(400),
            fontSize = 14.sp,
        )
    }

}

@Preview(showSystemUi = true)
@Composable
fun PreviewLoginUI2() {
    LogInUI_2()
}