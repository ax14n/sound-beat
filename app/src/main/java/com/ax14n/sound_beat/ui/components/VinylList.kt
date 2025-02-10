package com.ax14n.sound_beat.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ax14n.sound_beat.R
import com.ax14n.sound_beat.ui.theme.jaro

val sampleVinyls = listOf(
    VinylData(R.drawable.default_vinyl, "Soundbeat - WARNING!", "SoundBeat"),
    VinylData(R.drawable.premium_vinyl, "Lo-Fi Chill", "DJ Relax"),
    VinylData(R.drawable.premium_vinyl, "Retro Vibes", "Synthwave Crew"),
    VinylData(
        R.drawable.default_vinyl, "Montí Groove", "The Montí DJ"
    ),
    VinylData(R.drawable.default_vinyl, "Ocean Waves", "Blue Sky Sounds"),
    VinylData(R.drawable.default_vinyl, "Classic Rock Anthems", "The Legends Band"),
    VinylData(R.drawable.premium_vinyl, "Vintage Jazz", "Smooth Vibes Collective"),
    VinylData(R.drawable.premium_vinyl, "Electronic Dreams", "DJ Electronica")
)


@Composable
fun VinylList(
    vinyls: List<VinylData> = sampleVinyls,
    header: String = "Default Header",
    background: Color = Color.Transparent
) {
    Column {
        TextCustomized(
            text = header, size = 20f, fontFamily = jaro
        )
        Spacer(
            modifier = Modifier.height(5.dp)
        ) // Espaciado entre la columna y la imagen de la derecha
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .background(background)
                .padding(top = 10.dp, bottom = 10.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp) // Espaciado entre los elementos
        ) {
            items(vinyls) { vinyl ->
                Vinyl(
                    imagen = vinyl.image,
                    title = vinyl.title,
                    author = vinyl.author,
                    titleFont = jaro,
                    authorFont = jaro
                )
            }
        }
    }
}

// Datos de cada disco
data class VinylData(val image: Int, val title: String, val author: String)

// Vista previa con datos de prueba
@Preview
@Composable
fun PreviewVinylList() {
    VinylList(vinyls = sampleVinyls)
}
