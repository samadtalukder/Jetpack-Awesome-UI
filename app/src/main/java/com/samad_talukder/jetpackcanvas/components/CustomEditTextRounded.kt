package com.samad_talukder.jetpackcanvas.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.samad_talukder.jetpackcanvas.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomEditTextRounded(
    value: String,
    onValueChange: (String) -> Unit,
    hint: String,
    modifier: Modifier = Modifier,
    keyboardType: KeyboardType = KeyboardType.Text,
    imeAction: ImeAction = ImeAction.Done,
    autoCorrect: Boolean = false,
    isSingleLine: Boolean = false,
    containerColor: Color,
    textColor: Color,
    hintTextColor: Color,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    trailingIcon: @Composable (() -> Unit)? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
) {

    TextField(
        value = value,
        onValueChange = { onValueChange(it) },
        singleLine = isSingleLine,
        modifier = modifier
            .fillMaxWidth()
            .height(60.dp)
            .border(
                BorderStroke(width = 1.dp, color = Color(0xFFF1F1F4)),
                shape = RoundedCornerShape(30.dp)
            ),
        shape = RoundedCornerShape(30.dp),
        colors = TextFieldDefaults.textFieldColors(
            containerColor = containerColor,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            textColor = textColor,
            placeholderColor = hintTextColor
        ),

        visualTransformation = visualTransformation,
        leadingIcon = {
            leadingIcon?.invoke()
        },
        trailingIcon = {
            trailingIcon?.invoke()
        },

        keyboardOptions = KeyboardOptions(
            keyboardType = keyboardType,
            imeAction = imeAction,
            autoCorrect = autoCorrect,
        ),
        placeholder = {
            Text(
                text = hint,
                fontFamily = FontFamily(Font(R.font.nunito_medium)),
            )
        },
    )
}