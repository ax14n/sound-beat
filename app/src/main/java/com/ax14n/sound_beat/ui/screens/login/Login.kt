package com.ax14n.sound_beat.ui.screens.login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ax14n.sound_beat.ui.components.FormScreen
import com.ax14n.sound_beat.ui.theme.SoundbeatTheme

/**
 * Clase registro perteneciente a la aplicación.
 */
class Login : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SoundbeatTheme {
                LoginScreen()
            }
        }
    }


    @Composable
    fun LoginScreen() {
        Box(
            modifier = Modifier
                .border(
                    width = 3.dp,
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color(0xFFFF8C00),  // Naranja quemado (claro pero profundo)
                            Color(0xFFCD5C5C),  // Rojo oscuro (vibrante pero más profundo)
                            Color(0xFFFFD700)   // Amarillo dorado (retro, pero no tan brillante)
                        ),
                        start = Offset(0f, 0f),  // Empieza desde la esquina superior izquierda
                        end = Offset(1000f, 1000f)  // Termina en la esquina inferior derecha
                    ),
                    shape = RectangleShape  // Forma rectangular
                )
                .background(
                    brush = Brush.radialGradient(
                        colors = listOf(
                            Color(0xFFF5DEB3),  // Beige suave (claro pero más oscuro)
                            Color(0xFFFF8C00),  // Naranja quemado (retro y cálido)
                            Color(0xFFCD5C5C)   // Rojo oscuro (más profundo pero cálido)
                        ),
                        center = Offset(500f, 500f),  // Centro del gradiente radial
                        radius = 1000f  // Alcance del gradiente
                    )
                )


        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                FormScreen(headerText = "SoundBeat!",
                    emailHint = "Introduce your email",
                    passwordHint = "Introduce your password",
                    buttonText = "Registrarse",
                    linkText = "Aún no te has registrado?",
                    buttonAction = {
                        // TODO: Agregar lógica de registro.
                    },
                    linkAction = {
                        // TODO: Agregar lógica de navegar.
                    })
            }
        }
    }

    @Preview(showSystemUi = true)
    @Composable
    fun PreviewUI() {
        LoginScreen()
    }

}


