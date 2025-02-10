package com.ax14n.sound_beat.ui.screens.profile

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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ax14n.sound_beat.R
import com.ax14n.sound_beat.ui.components.ProfileImage
import com.ax14n.sound_beat.ui.components.ProfileImagePreview
import com.ax14n.sound_beat.ui.components.TextCustomized
import com.ax14n.sound_beat.ui.theme.FogGray
import com.ax14n.sound_beat.ui.theme.IndustrialGray
import com.ax14n.sound_beat.ui.theme.SoundbeatTheme
import com.ax14n.sound_beat.ui.theme.jaro

private const val PLAYLISTS_REALIZADAS = 0

class Profile : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SoundbeatTheme {

            }
        }
    }

    @Composable
    private fun ProfileScreen() {
        Column(
            modifier = Modifier
                .background(IndustrialGray)
                .systemBarsPadding()
                .fillMaxSize()
        ) {
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp)
                        .background(FogGray)
                ) {
                    TextCustomized(
                        text = "Playlist(s) realizadas: $PLAYLISTS_REALIZADAS",
                        fontFamily = jaro,
                        size = 16f
                    )
                    TextCustomized(
                        text = "Genero más escuchado: Rock",
                        fontFamily = jaro,
                        size = 16f
                    )
                }
                Spacer(Modifier.padding(top = 10.dp))
                Column(
                    modifier = Modifier
                        .background(FogGray)
                        .fillMaxWidth()
                        .padding(vertical = 15.dp),
                    verticalArrangement = Arrangement.spacedBy(15.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    ProfileImage(userImage = R.drawable.default_vinyl)
                    TextCustomized(
                        text = "AX14N",
                        fontFamily = jaro,
                        size = 40f
                    )
                }
            }

        }
    }

    @Preview(showSystemUi = true)
    @Composable
    fun PreviewProfileUI() {
        ProfileScreen()
    }

}