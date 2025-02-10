package com.ax14n.sound_beat.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun TextCustomized(
    text: String = "Hello, World!",
    size: Float = 12f,
    textDecoration: TextDecoration = TextDecoration.None,
    fontFamily: FontFamily = FontFamily.Default,
    color: Color = Color.Black,
    onClick: () -> Unit = {},
    width: Dp = Int.MAX_VALUE.dp,
    lines: Int = 1
) {
    Text(
        text = text,
        textDecoration = textDecoration,
        fontSize = size.sp,
        fontFamily = fontFamily,
        color = color,
        modifier = Modifier
            .clickable(onClick = onClick)
            .width(width),
        maxLines = lines
    )
}