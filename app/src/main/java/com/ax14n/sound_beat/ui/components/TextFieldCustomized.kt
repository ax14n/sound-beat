package com.ax14n.sound_beat.ui.components

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun TextFieldCustomized() {
    var texto by remember { mutableStateOf("") } // Estado para el contenido

    TextField(
        value = texto, // Texto actual
        onValueChange = { texto = it }, // Cambios en el texto
        label = { Text("Escribe algo...") },
        singleLine = true,
        shape = androidx.compose.foundation.shape.RoundedCornerShape(30.dp), // Bordes redondeados
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color.White,
            unfocusedContainerColor = Color.White
        ),
        maxLines = 1
    )
}
