package com.ax14n.sound_beat.ui.components

import ImageCustomized
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ax14n.sound_beat.R
import com.ax14n.sound_beat.ui.theme.FogGray
import com.ax14n.sound_beat.ui.theme.jaro

private val vinylURI = "android.resource://com.ax14n.sound_beat/${R.raw.vinyl}"

/**
 * Tamaño del vinilo.
 */
private val VINYL_SIZE = 100.dp

/**
 * Distancia que sobresale el disco que se ubica detrás del vinilo.
 */
private val DISK_DISTANCE = 50.dp

/**
 * Distancia intermedia de separación del texto y el vinilo.
 */
private val TEXT_DISTANCE = 70.dp

/**
 * Tamaño del texto del título del vinilo.
 */
private const val TEXT_HEADER_SIZE = 25f

/**
 * Tamaño del texto del autor del vinilo
 */
private const val TEXT_AUTHOR_SIZE = 20f

@Preview
@Composable
fun VinylSearched(
    imagen: Int = R.drawable.default_vinyl,
    title: String = "Sound-beat - WARNING!",
    titleFont: FontFamily = FontFamily.Default,
    author: String = "Sound-beat",
    authorFont: FontFamily = FontFamily.Default,
) {
    Row(
        modifier = Modifier
            .background(FogGray)
            .padding(vertical = 10.dp, horizontal = 10.dp)
            .fillMaxWidth()
    ) {
        Box {
            Row(modifier = Modifier.offset(x = DISK_DISTANCE)) {
                ImageCustomized(
                    image = vinylURI, height = VINYL_SIZE, width = VINYL_SIZE
                )
            }
            ImageCustomized(
                image = imagen, height = VINYL_SIZE, width = VINYL_SIZE
            )
        }
        Spacer(modifier = Modifier.width(TEXT_DISTANCE))
        Column {
            TextCustomized(text = title, size = TEXT_HEADER_SIZE, fontFamily = jaro)
            TextCustomized(text = author, size = TEXT_AUTHOR_SIZE, fontFamily = jaro)
        }
    }

}

