package com.ax14n.sound_beat.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.ax14n.sound_beat.ui.theme.FancyPink

@Composable
fun ButtonCustomized(
    text: String = "¡Hola, soy un botón!",
    containerColor: Color = FancyPink,
    contentColor: Color = Color.Black,
    horizontalPadding: Dp = 60.dp,
    shadow: Dp = 8.dp,
    ejecutar: () -> Unit
) {
    Button(colors = ButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = containerColor,
        disabledContentColor = contentColor
    ), modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = horizontalPadding, vertical = 0.dp)
        .shadow(
            shadow, shape = RoundedCornerShape(16.dp)
        ), // Sombra suave con bordes redondeados
        onClick = {
            ejecutar()
        }) {
        Text(text)
    }
}