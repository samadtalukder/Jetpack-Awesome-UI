package com.samad_talukder.jetpackcanvas.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomEditText(
    value: String,
    onValueChange: (String) -> Unit,
    placeHolderText: String,
    modifier: Modifier = Modifier,
    keyboardType: KeyboardType = KeyboardType.Text,
    imeAction: ImeAction = ImeAction.Done,
    autoCorrect: Boolean = false,
    isSingleLine: Boolean = false,
    containerColor: Color,
    textColor: Color,
    placeholderColorColor: Color,
    roundedCornerShape: RoundedCornerShape,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    trailingIcon: @Composable (() -> Unit)? = null,
) {

    TextField(
        value = value,
        onValueChange = { onValueChange(it) },
        singleLine = isSingleLine,
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp),
        colors = TextFieldDefaults.textFieldColors(
            containerColor = containerColor,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            textColor = textColor,
            placeholderColor = placeholderColorColor
        ),
        shape = roundedCornerShape,
        keyboardOptions = KeyboardOptions(
            keyboardType = keyboardType,
            imeAction = imeAction,
            autoCorrect = autoCorrect,
        ),
        visualTransformation = visualTransformation,
        placeholder = { Text(text = placeHolderText) },
        trailingIcon = { trailingIcon?.invoke() },

    )
}