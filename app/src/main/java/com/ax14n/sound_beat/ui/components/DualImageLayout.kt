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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ax14n.sound_beat.R

@Composable
fun DualImageLayout(
    leftImage1: Int, leftImage2: Int, rightImage: Int
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            modifier = Modifier.weight(1f), horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ImageCustomized(
                image = leftImage1,
                roundedCorner = 25.dp,
                borderSize = 2.dp,
                borderColor = Color.Black,
                width = 150.dp,
                height = 120.dp
            )
            Spacer(modifier = Modifier.height(16.dp))
            ImageCustomized(
                image = leftImage2,
                roundedCorner = 25.dp,
                borderSize = 2.dp,
                borderColor = Color.Black,
                width = 150.dp,
                height = 120.dp
            )
        }
        ImageCustomized(
            image = rightImage,
            roundedCorner = 25.dp,
            borderSize = 2.dp,
            borderColor = Color.Black,
            width = 180.dp,
            height = 256.dp
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewUI() {

    Column(
        modifier = Modifier.systemBarsPadding(),
    ) {
        DualImageLayout(
            leftImage1 = R.drawable.ic_launcher_foreground,
            leftImage2 = R.drawable.ic_launcher_foreground,
            rightImage = R.drawable.ic_launcher_foreground
        )

    }
}
