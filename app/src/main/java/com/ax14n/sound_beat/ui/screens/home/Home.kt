package com.ax14n.sound_beat.ui.screens.home

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
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ax14n.sound_beat.R
import com.ax14n.sound_beat.ui.components.DualImageLayout
import com.ax14n.sound_beat.ui.components.TextCustomized
import com.ax14n.sound_beat.ui.components.VinylList
import com.ax14n.sound_beat.ui.theme.FogGray
import com.ax14n.sound_beat.ui.theme.IndustrialGray
import com.ax14n.sound_beat.ui.theme.SoundbeatTheme
import com.ax14n.sound_beat.ui.theme.workbench

class Home : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SoundbeatTheme {
                HomeScreen()
            }
        }
    }

    @Composable
    private fun HomeScreen() {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .background(IndustrialGray)
                .fillMaxSize()
                .systemBarsPadding(),
            verticalArrangement = Arrangement.spacedBy(30.dp)
        ) {
            Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth()) {
                TextCustomized(
                    text = "SoundBeat!",
                    size = 40f,
                    fontFamily = workbench,
                    textDecoration = TextDecoration.Underline,
                )
            }
            DualImageLayout(
                leftImage1 = R.drawable.ic_launcher_foreground,
                leftImage2 = R.drawable.ic_launcher_foreground,
                rightImage = R.drawable.ic_launcher_foreground
            )

            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                VinylList(header = "¡En base a tus preferencias!", background = FogGray)
                Spacer(modifier = Modifier.height(12.dp))
                VinylList(header = "¡Rock!", background = FogGray)
                Spacer(modifier = Modifier.height(12.dp))
                VinylList(header = "¡Soul!", background = FogGray)
                Spacer(modifier = Modifier.height(12.dp))
                VinylList(header = "¡Bachata!", background = FogGray)
                Spacer(modifier = Modifier.height(12.dp))
                VinylList(header = "¡Merengue!", background = FogGray)
                Spacer(modifier = Modifier.height(12.dp))
                VinylList(header = "¡Bals!", background = FogGray)
                Spacer(modifier = Modifier.height(12.dp))
            }
        }
    }

    @Preview(showSystemUi = true)
    @Composable
    fun PreviewUI() {
        HomeScreen()
    }

}