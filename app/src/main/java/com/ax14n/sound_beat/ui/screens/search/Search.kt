package com.ax14n.sound_beat.ui.screens.search

import ImageCustomized
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ax14n.sound_beat.R
import com.ax14n.sound_beat.ui.components.TextFieldCustomized
import com.ax14n.sound_beat.ui.components.VinylSearched
import com.ax14n.sound_beat.ui.theme.FogGray
import com.ax14n.sound_beat.ui.theme.IndustrialGray
import com.ax14n.sound_beat.ui.theme.SoundbeatTheme

class Search : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SoundbeatTheme {

            }
        }
    }

    @Composable
    private fun SearchScreen() {
        Column(
            modifier = Modifier
                .systemBarsPadding()
                .background(IndustrialGray)
                .fillMaxSize()
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .background(FogGray)
                    .fillMaxWidth()
                    .padding(
                        bottom = 10.dp, start = 10.dp, end = 0.dp, top = 10.dp
                    )  // Agrega padding al contenedor Row
            ) {
                TextFieldCustomized()
                Spacer(modifier = Modifier.padding(start = 20.dp))
                ImageCustomized(
                    image = R.drawable.search, height = 30.dp, width = 30.dp
                )
            }
            Spacer(modifier = Modifier.padding(top = 10.dp))
            Column(
                verticalArrangement = Arrangement.spacedBy(10.dp),
                modifier = Modifier
                    .padding(start = 10.dp)
                    .verticalScroll(rememberScrollState())
            ) {

                VinylSearched(title = "Abbey Road", author = "The Beatles")
                VinylSearched(title = "The Dark Side of the Moon", author = "Pink Floyd")
                VinylSearched(title = "Back in Black", author = "AC/DC")
                VinylSearched(title = "Led Zeppelin IV", author = "Led Zeppelin")
                VinylSearched(title = "Thriller", author = "Michael Jackson")
                VinylSearched(title = "The Wall", author = "Pink Floyd")
                VinylSearched(title = "Hotel California", author = "Eagles")
                VinylSearched(title = "Rumours", author = "Fleetwood Mac")
                VinylSearched(title = "Born to Run", author = "Bruce Springsteen")
                VinylSearched(
                    title = "The Velvet Underground & Nico", author = "The Velvet Underground"
                )
                VinylSearched(title = "The Joshua Tree", author = "U2")
                VinylSearched(title = "White Album", author = "The Beatles")
                VinylSearched(title = "Purple Rain", author = "Prince")
                VinylSearched(title = "Highway to Hell", author = "AC/DC")
                VinylSearched(title = "Nevermind", author = "Nirvana")
                VinylSearched(title = "The Queen Is Dead", author = "The Smiths")
                VinylSearched(title = "Exile on Main St.", author = "The Rolling Stones")
                VinylSearched(title = "The Clash", author = "The Clash")
                VinylSearched(
                    title = "Bridge Over Troubled Water", author = "Simon & Garfunkel"
                )
                VinylSearched(title = "Master of Puppets", author = "Metallica")
                VinylSearched(title = "21", author = "Adele")
                VinylSearched(
                    title = "The Rise and Fall of Ziggy Stardust", author = "David Bowie"
                )
                VinylSearched(title = "Back to Black", author = "Amy Winehouse")
                VinylSearched(title = "Pet Sounds", author = "The Beach Boys")
                VinylSearched(title = "Goodbye Yellow Brick Road", author = "Elton John")
                VinylSearched(title = "Lover", author = "Taylor Swift")
                VinylSearched(title = "Born in the U.S.A.", author = "Bruce Springsteen")
                VinylSearched(title = "Abbey Road", author = "The Beatles")
                VinylSearched(title = "London Calling", author = "The Clash")
                VinylSearched(
                    title = "In the Court of the Crimson King", author = "King Crimson"
                )
            }
        }
    }

    @Preview(showSystemUi = true)
    @Composable
    fun SearchScreenUI() {
        SearchScreen()
    }

}