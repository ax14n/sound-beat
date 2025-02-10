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

val defaultList: List<Playlist> = listOf(
    Playlist(image = R.drawable.premium_vinyl, title = "Rock Clásico", tracks = 25),
    Playlist(image = R.drawable.premium_vinyl, title = "Pop Hits", tracks = 40),
    Playlist(image = R.drawable.premium_vinyl, title = "Jazz Relax", tracks = 18),
    Playlist(image = R.drawable.default_vinyl, title = "Electrónica", tracks = 32),
    Playlist(image = R.drawable.premium_vinyl, title = "Reggae Vibes", tracks = 22),
    Playlist(image = R.drawable.default_vinyl, title = "Hip-Hop Legends", tracks = 30),
    Playlist(image = R.drawable.default_vinyl, title = "Heavy Metal", tracks = 27),
    Playlist(image = R.drawable.premium_vinyl, title = "Acústico", tracks = 15)
)

@Composable
fun PlaylistlList(
    playlists: List<Playlist> = defaultList,
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
            items(playlists) { playlist ->
                Playlist(
                    imagen = playlist.image,
                    title = playlist.title,
                    tracks = playlist.tracks,
                    titleFont = jaro,
                    authorFont = jaro
                )
            }
        }
    }
}

// Datos de cada disco
data class Playlist(val image: Int, val title: String, val tracks: Int)

// Vista previa con datos de prueba
@Preview
@Composable
fun PreviewPlaylistList() {
    PlaylistlList(playlists = defaultList)
}
