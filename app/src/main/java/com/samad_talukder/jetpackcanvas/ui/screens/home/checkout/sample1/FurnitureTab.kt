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
fun FurnitureTab(
    onNextStep: () -> Unit
) {
    Column(modifier = Modifier.fillMaxSize()) {

        val furnitureItems = listOf(
            CheckoutDataItem("Bed", R.drawable.ic_furniture_bed),
            CheckoutDataItem("Bookshelf", R.drawable.ic_furniture_bookshelf),
            CheckoutDataItem("Cabinet", R.drawable.ic_furniture_cabinet),
            CheckoutDataItem("Chair", R.drawable.ic_furniture_chair),
            CheckoutDataItem("Clock", R.drawable.ic_furniture_clock),
            CheckoutDataItem("Closet", R.drawable.ic_furniture_closet),
            CheckoutDataItem("Desk Chair", R.drawable.ic_furniture_desk_chair),
            CheckoutDataItem("Desk Lamp", R.drawable.ic_furniture_desk_lamp),
            CheckoutDataItem("Desk", R.drawable.ic_furniture_desk),
            CheckoutDataItem("Dressing Table", R.drawable.ic_furniture_dressing_table)
        )

        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        ) {
            LazyColumn {
                items(furnitureItems) { (title, icon) ->
                    ItemCheckout(
                        title = title,
                        image = icon
                    )
                }
            }
        }

        CheckOutButton(
            btnTitle = "Next",
            onNextStep = onNextStep
        )

    }
}





