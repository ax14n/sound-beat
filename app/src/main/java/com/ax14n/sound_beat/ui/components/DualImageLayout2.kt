package com.ax14n.sound_beat.ui.components

import ImageCustomized
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ax14n.sound_beat.R

@Composable
fun DualImageLayout2(
    topImage: Any, bottomLeftImage: Any, bottomRightImage: Any
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
    ) {
        // Imagen grande en la parte superior
        ImageCustomized(
            image = topImage,
            roundedCorner = 25.dp,
            borderSize = 2.dp,
            borderColor = Color.Black,
            width = 404.dp,
            height = 256.dp
        )
        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(30.dp) // Espacio de 30dp entre las imágenes
        ) {
            ImageCustomized(
                image = bottomLeftImage,
                roundedCorner = 25.dp,
                borderSize = 2.dp,
                borderColor = Color.Black,
                width = 160.dp,
                height = 120.dp
            )

            ImageCustomized(
                image = bottomRightImage,
                roundedCorner = 25.dp,
                borderSize = 2.dp,
                borderColor = Color.Black,
                width = 160.dp,
                height = 120.dp
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewDualImageLayout() {

    val gifUri1 = "android.resource://com.ax14n.sound_beat/${R.raw.caset}"
    val gifUri2 = "android.resource://com.ax14n.sound_beat/${R.raw.like}"
    val gifUri3 = "android.resource://com.ax14n.sound_beat/${R.raw.submit}"

    Column(
        modifier = Modifier.systemBarsPadding(),
    ) {
        DualImageLayout2(
            topImage = gifUri1,
            bottomLeftImage = gifUri2,
            bottomRightImage = gifUri3
        )
    }
}
