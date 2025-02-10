package com.ax14n.sound_beat.ui.components

import ImageCustomized
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.ax14n.sound_beat.R

private val vinylCenterURI = "android.resource://com.ax14n.sound_beat/${R.raw.vinyl_center}"

@Composable
fun ProfileImage(userImage: Int = R.drawable.kazuya, profilePhotoSize: Dp = 200.dp) {

    Box(
        contentAlignment = Alignment.Center
    ) {
        // Imagen del vinilo (con el centro recortado circularmente)
        ImageCustomized(
            image = userImage,
            width = profilePhotoSize,
            height = profilePhotoSize,
            circular = true,
            borderSize = 0.2.dp,
            borderColor = Color.Black,
            roundedCorner = 600.dp
        )
        ImageCustomized(image = vinylCenterURI, width = profilePhotoSize, height = profilePhotoSize)
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileImagePreview() {
    ProfileImage()
}

