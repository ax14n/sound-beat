package com.ax14n.sound_beat.ui.screens.settings

import ImageCustomized
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import com.ax14n.sound_beat.ui.components.ButtonCustomized
import com.ax14n.sound_beat.ui.components.TextCustomized
import com.ax14n.sound_beat.ui.theme.FogGray
import com.ax14n.sound_beat.ui.theme.IndustrialGray
import com.ax14n.sound_beat.ui.theme.SoundbeatTheme
import com.ax14n.sound_beat.ui.theme.jaro

class Settings : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SoundbeatTheme {
                SettingsScreen()
            }
        }
    }

    @Composable
    private fun SettingsScreen() {
        val gifUri1 = "android.resource://com.ax14n.sound_beat/${R.raw.universe}"

        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .background(IndustrialGray)
                .systemBarsPadding()
                .padding(horizontal = 20.dp)
                .fillMaxSize(), Arrangement.spacedBy(15.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                ImageCustomized(image = R.drawable.back_arrow, height = 35.dp, width = 35.dp)
                TextCustomized(text = "change whatever you like!", fontFamily = jaro, size = 23f)
            }
            ImageCustomized(image = gifUri1, height = 250.dp, width = 375.dp, roundedCorner = 20.dp)
            TextCustomized(text = "Settings", fontFamily = jaro, size = 23f)
            ButtonCustomized(
                text = "Configuración 1",
                horizontalPadding = 0.dp,
                containerColor = FogGray,
                shadow = 0.dp
            ) { }
            ButtonCustomized(
                text = "Configuración 2",
                horizontalPadding = 0.dp,
                containerColor = FogGray,
                shadow = 0.dp
            ) { }
            ButtonCustomized(
                text = "Opciones Avanzadas",
                horizontalPadding = 0.dp,
                containerColor = FogGray,
                shadow = 0.dp
            ) { }
            ButtonCustomized(
                text = "Preferencias",
                horizontalPadding = 0.dp,
                containerColor = FogGray,
                shadow = 0.dp
            ) { }
            ButtonCustomized(
                text = "Personalizar",
                horizontalPadding = 0.dp,
                containerColor = FogGray,
                shadow = 0.dp
            ) { }
            ButtonCustomized(
                text = "Modo Oscuro",
                horizontalPadding = 0.dp,
                containerColor = FogGray,
                shadow = 0.dp
            ) { }
            ButtonCustomized(
                text = "Notificaciones",
                horizontalPadding = 0.dp,
                containerColor = FogGray,
                shadow = 0.dp
            ) { }
            ButtonCustomized(
                text = "Guardar Cambios",
                horizontalPadding = 0.dp,
                containerColor = FogGray,
                shadow = 0.dp
            ) { }
            ButtonCustomized(
                text = "Seguridad",
                horizontalPadding = 0.dp,
                containerColor = FogGray,
                shadow = 0.dp
            ) { }
            ButtonCustomized(
                text = "Privacidad",
                horizontalPadding = 0.dp,
                containerColor = FogGray,
                shadow = 0.dp
            ) { }
            ButtonCustomized(
                text = "Accesibilidad",
                horizontalPadding = 0.dp,
                containerColor = FogGray,
                shadow = 0.dp
            ) { }
            ButtonCustomized(
                text = "Idioma",
                horizontalPadding = 0.dp,
                containerColor = FogGray,
                shadow = 0.dp
            ) { }
            ButtonCustomized(
                text = "Sonido y Vibración",
                horizontalPadding = 0.dp,
                containerColor = FogGray,
                shadow = 0.dp
            ) { }
            ButtonCustomized(
                text = "Red y Conexiones",
                horizontalPadding = 0.dp,
                containerColor = FogGray,
                shadow = 0.dp
            ) { }
            ButtonCustomized(
                text = "Almacenamiento",
                horizontalPadding = 0.dp,
                containerColor = FogGray,
                shadow = 0.dp
            ) { }
            ButtonCustomized(
                text = "Restablecer Configuración",
                horizontalPadding = 0.dp,
                containerColor = FogGray,
                shadow = 0.dp
            ) { }

        }
    }

    @Preview(showSystemUi = true)
    @Composable
    fun PreviewSettingsUI() {
        SettingsScreen()
    }

}