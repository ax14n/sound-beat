package com.ax14n.soundbeat.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ax14n.soundbeat.R

/**
 * Crea una presentación de vinilo a partir de la imagen de la canción y el
 * disco que sobresale por detrás.
 *
 * @param portada Imagen de la portada de la canción.
 * @param disc Imagen del disco que sobresale por detrás.
 */
@Composable
fun AlbumCoverWithDisc(
    portada: Int = R.drawable.portada1,
    disc: Int = R.drawable.vinyl
) {
    Row(Modifier.padding(end = 50.dp)) {

        Box(contentAlignment = Alignment.Center) {
            Image(
                painter = painterResource(id = disc),
                contentDescription = "Disco",
                modifier = Modifier
                    .offset(x = 50.dp)
                    .size(90.dp),
            )

            Image(
                painter = painterResource(id = portada),
                contentDescription = "Portada del álbum",
                modifier = Modifier.size(100.dp)
            )

        }
    }

}

@Preview(showSystemUi = true)
@Composable
fun DefaultPreview() {
    Column(verticalArrangement = Arrangement.spacedBy(7.dp)) {
        AlbumCoverWithDisc()
        AlbumCoverWithDisc()
        AlbumCoverWithDisc()
        AlbumCoverWithDisc()
        AlbumCoverWithDisc()
        AlbumCoverWithDisc()
        AlbumCoverWithDisc()
    }
}

