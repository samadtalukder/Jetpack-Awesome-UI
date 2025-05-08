/**
 *  Copyright (C) 2025. Samad Talukder (https://github.com/samadtalukder/)
 */
package com.samad_talukder.jetpackcanvas.ui.screens.home.layout

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.samad_talukder.jetpackcanvas.R

@Composable
fun ConstraintLayoutBasicScreen() {
    ConstraintLayout(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.surface)
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        val (
            gradientBg,
            profileImage, notificationIcon,
            greetingMsg, askingMsg, urgentCare, doctorImage,
            bottomSheetCard, ourServicesText,
            consultationIcon, medicinesIcon, ambulanceIcon,
            consultationText, medicinesText, ambulanceText
        ) = createRefs()

        /* Guideline */
        val horizontalCenterGuideLine = createGuidelineFromTop(0.45f)

        Image(
            painter = painterResource(id = R.drawable.gradient_bg),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .alpha(0.8f)
                .constrainAs(gradientBg) {
                    top.linkTo(parent.top)
                    end.linkTo(parent.end)
                    start.linkTo(parent.start)
                    bottom.linkTo(horizontalCenterGuideLine)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )

        /* Chain */
        val topGuideLine = createGuidelineFromTop(16.dp)
        val startGuideLine = createGuidelineFromStart(16.dp)
        val endGuideLine = createGuidelineFromEnd(16.dp)

        createHorizontalChain(profileImage, notificationIcon, chainStyle = ChainStyle.SpreadInside)

        Image(
            painter = painterResource(id = R.drawable.ic_profile),
            contentDescription = null,
            modifier = Modifier
                .constrainAs(profileImage) {
                    top.linkTo(topGuideLine)
                }
                .padding(start = 16.dp)
                .size(42.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.ic_notification),
            contentDescription = null,
            modifier = Modifier
                .constrainAs(notificationIcon) {
                    top.linkTo(profileImage.top)
                    bottom.linkTo(profileImage.bottom)
                }
                .padding(end = 16.dp)
                .size(42.dp)
        )

        /* Barrier */
        val greetingBarrier = createEndBarrier(
            greetingMsg, askingMsg
        )

        val userName = "Loren epsum"
        val greetingMessage = "Welcome! \n$userName"

        Text(
            text = greetingMessage,
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onSurface,
            modifier = Modifier.constrainAs(greetingMsg) {
                top.linkTo(profileImage.bottom, margin = 32.dp)
                start.linkTo(startGuideLine)
            }
        )

        Text(
            text = "How is it going today?",
            color = Color.Gray,
            modifier = Modifier.constrainAs(askingMsg) {
                top.linkTo(greetingMsg.bottom, 16.dp)
                start.linkTo(greetingMsg.start)
            }
        )

        Image(
            painter = painterResource(id = R.drawable.ic_apple_sign_in),
            contentDescription = "",
            modifier = Modifier
                .constrainAs(urgentCare) {
                    top.linkTo(askingMsg.bottom, margin = 32.dp)
                    start.linkTo(askingMsg.start)
                    end.linkTo(askingMsg.end)
                }
                .size(width = 100.dp, height = 60.dp)
        )

        Image(
            painterResource(id = R.drawable.doctor_team),
            contentDescription = "",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .constrainAs(doctorImage) {
                    top.linkTo(notificationIcon.bottom, margin = 8.dp)
                    start.linkTo(greetingBarrier)
                    end.linkTo(notificationIcon.end, margin = 8.dp)
                    bottom.linkTo(horizontalCenterGuideLine)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )

        Card(
            elevation = CardDefaults.cardElevation(8.dp),
            shape = RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp),
            modifier = Modifier.constrainAs(bottomSheetCard) {
                top.linkTo(horizontalCenterGuideLine, margin = (-4).dp)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                bottom.linkTo(parent.bottom)
                width = Dimension.fillToConstraints
                height = Dimension.fillToConstraints
            }
        ) {}

        Text(
            text = "Our services",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onSurface,
            modifier = Modifier.constrainAs(ourServicesText) {
                top.linkTo(bottomSheetCard.top, margin = 24.dp)
                start.linkTo(bottomSheetCard.start, margin = 16.dp)
            }
        )

        createHorizontalChain(
            consultationIcon,
            medicinesIcon,
            ambulanceIcon,
            chainStyle = ChainStyle.Spread
        )

        Image(
            painterResource(id = R.drawable.ic_google_logo),
            contentDescription = "",
            modifier = Modifier
                .constrainAs(consultationIcon) {
                    top.linkTo(ourServicesText.bottom, margin = 16.dp)
                }
                .size(50.dp)
        )

        Image(
            painterResource(id = R.drawable.ic_google_logo),
            contentDescription = "",
            modifier = Modifier
                .constrainAs(medicinesIcon) {
                    top.linkTo(consultationIcon.top)
                    bottom.linkTo(consultationIcon.bottom)
                }
                .size(50.dp)
        )

        Image(
            painterResource(id = R.drawable.ic_google_logo),
            contentDescription = "",
            modifier = Modifier
                .constrainAs(ambulanceIcon) {
                    top.linkTo(consultationIcon.top)
                    bottom.linkTo(consultationIcon.bottom)
                }
                .size(50.dp)
        )

        Text(
            text = "Consultation",
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.constrainAs(consultationText) {
                top.linkTo(consultationIcon.bottom, 12.dp)
                start.linkTo(consultationIcon.start)
                end.linkTo(consultationIcon.end)
            }
        )

        Text(
            text = "Medicines",
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.constrainAs(medicinesText) {
                top.linkTo(consultationText.top)
                start.linkTo(medicinesIcon.start)
                end.linkTo(medicinesIcon.end)
            }
        )

        Text(
            text = "Ambulance",
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.constrainAs(ambulanceText) {
                top.linkTo(consultationText.top)
                start.linkTo(ambulanceIcon.start)
                end.linkTo(ambulanceIcon.end)
            }
        )

        val (
            appointmentText, seeAllText,
            appointmentItemCard,
            appointmentDateText,
            appointmentDateIcon, appointmentDate, appointmentOptions,
            appointmentDivider,
            appointmentDoctorProfileImage, appointmentDoctorName,
            appointmentDoctorBranch
        ) = createRefs()

        Text(
            text = "Appointment",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onSurface,
            modifier = Modifier.constrainAs(appointmentText) {
                top.linkTo(consultationText.bottom, margin = 30.dp)
                start.linkTo(startGuideLine)
            }
        )
        Text(
            text = "See All",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Blue,
            modifier = Modifier.constrainAs(seeAllText) {
                top.linkTo(appointmentText.top)
                end.linkTo(endGuideLine)
            }
        )
        Card(
            elevation = CardDefaults.cardElevation(8.dp),
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier.constrainAs(appointmentItemCard) {
                top.linkTo(appointmentText.bottom, margin = 16.dp)
                start.linkTo(appointmentText.start)
                end.linkTo(endGuideLine)
                bottom.linkTo(appointmentDoctorProfileImage.bottom, margin = (-16).dp)
                width = Dimension.fillToConstraints
                height = Dimension.fillToConstraints
            }
        ) {
            /*Box(
                modifier = Modifier
                    .padding(top = 16.dp, bottom = 16.dp)
                    .wrapContentSize(Alignment.TopStart)
                    .fillMaxHeight()
                    .background(Color(0xAA4D94FF))

            ) {
                Spacer(modifier = Modifier.width(10.dp))
            }*/
        }

        Text(
            text = "Appointment date",
            color = Color.Gray,
            modifier = Modifier.constrainAs(appointmentDateText) {
                top.linkTo(appointmentItemCard.top, 16.dp)
                start.linkTo(appointmentItemCard.start, 24.dp)
            }
        )

        Image(
            painter = painterResource(id = R.drawable.ic_notification),
            contentDescription = "",
            modifier = Modifier
                .constrainAs(appointmentDateIcon) {
                    top.linkTo(appointmentDateText.bottom, margin = 8.dp)
                    start.linkTo(appointmentDateText.start)
                }
                .size(24.dp)
        )

        Text(
            text = "Mon Nov 7 | 8:00 - 8:30 AM",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onSurface,
            modifier = Modifier.constrainAs(appointmentDate) {
                top.linkTo(appointmentDateIcon.top)
                start.linkTo(appointmentDateIcon.end, 4.dp)
            }
        )

        Image(
            painter = painterResource(id = R.drawable.ic_filter_list),
            contentDescription = "",
            modifier = Modifier
                .constrainAs(appointmentOptions) {
                    end.linkTo(appointmentItemCard.end, margin = 8.dp)
                    top.linkTo(appointmentDateText.top)
                    bottom.linkTo(appointmentDate.bottom)
                }
                .size(30.dp)
        )

        HorizontalDivider(
            modifier = Modifier
                .constrainAs(appointmentDivider) {
                    top.linkTo(appointmentDate.bottom, margin = 16.dp)
                    start.linkTo(appointmentDateIcon.start)
                    end.linkTo(appointmentOptions.end)
                    width = Dimension.fillToConstraints
                }
                .alpha(0.5f),
            thickness = (0.5f).dp,
            color = Color.Gray)

        Image(
            painter = painterResource(id = R.drawable.ic_apple_sign_in),
            contentDescription = "",
            modifier = Modifier
                .constrainAs(appointmentDoctorProfileImage) {
                    top.linkTo(appointmentDivider.bottom, margin = 16.dp)
                    start.linkTo(appointmentDivider.start)
                }
                .size(40.dp)
        )

        Text(
            text = "Dr. Rıdvan TORU",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onSurface,
            modifier = Modifier.constrainAs(appointmentDoctorName) {
                top.linkTo(appointmentDoctorProfileImage.top)
                start.linkTo(appointmentDoctorProfileImage.end, 12.dp)
            }
        )
        Text(
            text = "Dentist",
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Gray,
            modifier = Modifier.constrainAs(appointmentDoctorBranch) {
                top.linkTo(appointmentDoctorName.bottom, margin = 2.dp)
                start.linkTo(appointmentDoctorName.start)
            }
        )

    }
}

@Preview
@Composable
private fun PreviewConstraintLayoutBasicScreen() {
    ConstraintLayoutBasicScreen()
}

