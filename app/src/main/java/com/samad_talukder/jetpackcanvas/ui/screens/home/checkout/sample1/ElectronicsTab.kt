/**
 *  Copyright (C) 2025. Samad Talukder (https://github.com/samadtalukder/)
 */
package com.samad_talukder.jetpackcanvas.ui.screens.home.checkout.sample1

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.samad_talukder.jetpackcanvas.R
import com.samad_talukder.jetpackcanvas.ui.screens.home.checkout.sample1.components.CheckOutButton
import com.samad_talukder.jetpackcanvas.ui.screens.home.checkout.sample1.components.ItemCheckout
import com.samad_talukder.jetpackcanvas.ui.screens.home.checkout.sample1.model.CheckoutDataItem

@Composable
fun ElectronicsTab(
    onNextStep: () -> Unit
) {
    Column(modifier = Modifier.fillMaxSize()) {

        val electronicsItems = listOf(
            CheckoutDataItem("Air Conditioner", R.drawable.ic_electronics_air_conditioner),
            CheckoutDataItem("Micro Wave", R.drawable.ic_electronics_microwave),
            CheckoutDataItem("Gas Stove", R.drawable.ic_electronics_gas_stove),
            CheckoutDataItem("Fridge", R.drawable.ic_electronics_fridge),
        )

        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        ) {
            LazyColumn {
                items(electronicsItems) { (title, icon) ->
                    ItemCheckout(title = title, image = icon)
                }
            }
        }

        CheckOutButton(
            btnTitle = "Next",
            onNextStep = onNextStep
        )
    }
}

