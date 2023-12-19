package com.samad_talukder.jetpackcanvas.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.samad_talukder.jetpackcanvas.R

@Composable
fun SocialLoginBtn(
    modifier: Modifier = Modifier,
    @DrawableRes icon: Int,
    socialMediaName: String,
    isGoogle: Boolean = false,
) {

    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .height(56.dp)
            .border(
                width = 1.dp,
                color = if (isGoogle) Color(0xFFDD4B39) else Color(0xFF333333),
                shape = RoundedCornerShape(size = 11.dp)
            )
    ) {
        Image(
            painter = painterResource(id = icon),
            contentDescription = null,
            contentScale = ContentScale.None
        )
        Spacer(modifier = Modifier.width(14.dp))
        Text(
            text = socialMediaName,
            style = TextStyle(
                fontSize = 16.sp,
                lineHeight = 16.sp,
                fontFamily = FontFamily(Font(R.font.gilroy_bold)),
                fontWeight = FontWeight(400),
                color = if (isGoogle) Color(0xFFDD4B39) else Color(0xFF16162E),
                letterSpacing = 0.8.sp,
            )
        )
    }
}