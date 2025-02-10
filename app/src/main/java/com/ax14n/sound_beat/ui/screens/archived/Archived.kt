package com.ax14n.sound_beat.ui.screens.archived

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ax14n.sound_beat.R
import com.ax14n.sound_beat.ui.components.DualImageLayout2
import com.ax14n.sound_beat.ui.components.PlaylistlList
import com.ax14n.sound_beat.ui.theme.SoundbeatTheme

class Archived : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SoundbeatTheme {

            }
        }
    }

    @Composable
    private fun ArchivedScreen() {
        val gifUri1 = "android.resource://com.ax14n.sound_beat/${R.raw.caset}"
        val gifUri2 = "android.resource://com.ax14n.sound_beat/${R.raw.like}"
        val gifUri3 = "android.resource://com.ax14n.sound_beat/${R.raw.submit}"

        Column(
            modifier = Modifier.systemBarsPadding(),
            Arrangement.spacedBy(30.dp)
        ) {
            DualImageLayout2(
                topImage = gifUri1,
                bottomLeftImage = gifUri2,
                bottomRightImage = gifUri3
            )
            PlaylistlList(header = "¡Tus playlist!")
        }
    }

    @Preview(showSystemUi = true)
    @Composable
    fun PreviewUI() {
        ArchivedScreen()
    }

}