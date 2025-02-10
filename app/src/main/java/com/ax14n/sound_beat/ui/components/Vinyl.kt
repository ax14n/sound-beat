package com.ax14n.sound_beat.ui.components

import ImageCustomized
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ax14n.sound_beat.R

@Preview
@Composable
fun Vinyl(
    imagen: Int = R.drawable.default_vinyl,
    title: String = "Soundbeat - WARNING!",
    titleFont: FontFamily = FontFamily.Default,
    author: String = "SoundBeat",
    authorFont: FontFamily = FontFamily.Default,
) {
    Column {
        ImageCustomized(
            image = imagen,
            borderColor = Color.Companion.Red,
            roundedCorner = 0.dp,
            borderSize = 0.dp,
            height = 90.dp,
            width = 90.dp
        )
        TextCustomized(text = title, size = 20f, width = 90.dp, fontFamily = titleFont)
        TextCustomized(text = author, size = 12f, width = 90.dp, fontFamily = authorFont)
    }
}