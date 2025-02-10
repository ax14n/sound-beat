package com.ax14n.sound_beat.ui.screens.register

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
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
class Register : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SoundbeatTheme {
                RegisterScreen()
            }
        }
    }


    @Composable
    fun RegisterScreen() {
        Column(
            modifier = Modifier
                .border(
                    width = 4.dp, brush = Brush.linearGradient(
                        colors = listOf(
                            Color(0xFFFF00FF),  // Magenta neón (retro, estilo 80s)
                            Color(0xFF00FFFF),  // Cian (neón)
                            Color(0xFFFF4500)   // Naranja rojo (retro, estilo neón)
                        ), start = Offset(0f, 0f),  // Empieza en la esquina superior izquierda
                        end = Offset(1000f, 1000f)  // Termina en la esquina inferior derecha
                    ), shape = RectangleShape  // Forma rectangular
                )
                .background(
                    brush = Brush.radialGradient(
                        colors = listOf(
                            Color(0xFFFFD700),  // Amarillo dorado (retro)
                            Color(0xFFFF4500),  // Naranja rojizo
                            Color(0xFF8B0000)   // Rojo oscuro (retro)
                        ), center = Offset(500f, 500f),  // Centro del gradiente radial
                        radius = 1200f  // Alcance del gradiente
                    )
                )
        ) {
            FormScreen(headerText = "SoundBeat!",
                emailHint = "Introduce your email",
                passwordHint = "Introduce your password",
                buttonText = "Registrarse",
                linkText = "Ya tienes cuenta?",
                buttonAction = {
                    // TODO: Agregar lógica de registro.
                },
                linkAction = {
                    // TODO: Agregar lógica de navegar.
                })
        }
    }


    @Preview(showSystemUi = true)
    @Composable
    fun PreviewUI() {
        RegisterScreen()
    }

}


