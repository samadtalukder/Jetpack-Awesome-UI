/**
 *  Copyright (C) 2025. Samad Talukder (https://github.com/samadtalukder/)
 */
package com.samad_talukder.jetpackcanvas.ui.screens.home.dashboard.food.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.samad_talukder.jetpackcanvas.R
import com.samad_talukder.jetpackcanvas.ui.components.CustomImage
import com.samad_talukder.jetpackcanvas.ui.components.CustomText
import com.samad_talukder.jetpackcanvas.ui.theme.RestaurantGrayTextColor
import com.samad_talukder.jetpackcanvas.ui.theme.RestaurantTextColor


@Composable
fun ItemRestaurants(
    modifier: Modifier = Modifier,
    restaurantName: String,
    restaurantImage: Int,
    restaurantRating: String,
    restaurantDeliveryTime: String,
    foodIngredients: String,
) {
    Column(
        modifier = modifier,
    ) {

        CustomImage(
            modifier = Modifier
                .fillMaxWidth()
                .height(220.dp)
                .clip(RoundedCornerShape(14.dp)),
            imgSrc = restaurantImage,
            contentScale = ContentScale.FillBounds
        )


        CustomText(
            modifier = Modifier.padding(top = 10.dp),
            text = restaurantName,
            fontWeight = FontWeight.Normal,
            fontSize = 20.sp,
            textColor = RestaurantTextColor
        )

        CustomText(
            modifier = Modifier.padding(top = 4.dp),
            text = foodIngredients,
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp,
            textColor = RestaurantGrayTextColor
        )

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp),
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                CustomImage(
                    modifier = Modifier
                        .size(24.dp),
                    imgSrc = R.drawable.ic_star,
                )
                Spacer(modifier = Modifier.width(6.dp))
                CustomText(
                    text = restaurantRating,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    textColor = RestaurantTextColor
                )
            }

            Spacer(modifier = Modifier.width(16.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                CustomImage(
                    modifier = Modifier
                        .size(24.dp),
                    imgSrc = R.drawable.ic_delivery,
                )
                Spacer(modifier = Modifier.width(6.dp))
                CustomText(
                    text = "Free",
                    fontWeight = FontWeight.Normal,
                    fontSize = 14.sp,
                    textColor = RestaurantTextColor
                )
            }
            Spacer(modifier = Modifier.width(16.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                CustomImage(
                    modifier = Modifier
                        .size(24.dp),
                    imgSrc = R.drawable.ic_clock,
                )
                Spacer(modifier = Modifier.width(6.dp))
                CustomText(
                    text = restaurantDeliveryTime,
                    fontWeight = FontWeight.Normal,
                    fontSize = 14.sp,
                    textColor = RestaurantTextColor
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun PreviewItemRestaurants() {
    ItemRestaurants(
        restaurantName = "Rose garden restaurant",
        restaurantImage = R.drawable.img_restaurant_bg,
        restaurantRating = "4.7",
        restaurantDeliveryTime = "20 min",
        foodIngredients = "Burger - Chiken - Riche - Wings",
    )
}