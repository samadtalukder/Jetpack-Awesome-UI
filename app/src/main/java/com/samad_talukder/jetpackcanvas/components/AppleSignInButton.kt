package com.samad_talukder.jetpackcanvas.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material3.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.samad_talukder.jetpackcanvas.R
import com.samad_talukder.jetpackcanvas.ui.theme.ColorBlack

@Composable
fun AppleSignInButton() {
    OutlinedButton(
        onClick = {},
        border = BorderStroke(1.dp, Color(0xFFEEEFF2)),
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
            .padding(horizontal = 20.dp),
        content = {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {

                Icon(
                    tint = Color.Unspecified,
                    painter = painterResource(id = R.drawable.ic_apple_logo),
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )

                CustomText(
                    value = stringResource(id = R.string.sign_in_with_apple),
                    textColor = ColorBlack,
                    fontFamily = FontFamily(Font(R.font.gilroy_bold)),
                    fontSize = 16.sp,
                )
                Icon(
                    tint = Color.Transparent,
                    imageVector = Icons.Default.MailOutline,
                    contentDescription = null,
                )
            }
        })
}