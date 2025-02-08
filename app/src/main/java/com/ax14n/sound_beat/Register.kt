package com.ax14n.sound_beat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
                .fillMaxSize()
                .paint(
                    painterResource(id = R.mipmap.retro_computer_foreground),
                    contentScale = ContentScale.FillHeight
                ),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            CreateCard()
        }
    }

    @Composable
    fun CreateCard() {
        Card(
            modifier = Modifier
                .padding(horizontal = ANCHO_REGISTER, vertical = ALTURA_REGISTER)
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            CardContent()
        }
    }

    @Composable
    fun CardContent() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 40.dp, horizontal = 20.dp)
        ) {
            CreateText("SoundBeat", 40f, TextAlign.Center, TextDecoration.Underline)
            CreateText("Register", 19f, TextAlign.Start, null)
            CreateText("Introduce your email", 14f, TextAlign.Start, null, 0.1.dp)
            MiCampoDeTexto()
            CreateText("Introduce your password", 14f, TextAlign.Start, null, 0.1.dp)
            MiCampoDeTexto()
            Button(modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 60.dp, vertical = 0.dp),
                onClick = {
                    /* TODO: IMPLEMENTAR LÓGICA DE BOTÓN */
                }) {
                Text("Registrarse")
            }
        }
    }


    @Composable
    private fun CreateText(
        text: String,
        size: Float,
        position: TextAlign?,
        textDecoration: TextDecoration?,
        spacer: Dp = 20.dp
    ) {
        Text(
            modifier = Modifier.fillMaxWidth(),
            textAlign = position,
            text = text,
            textDecoration = textDecoration,
            fontSize = size.sp
        )
        Spacer(modifier = Modifier.height(spacer))
    }

    @Composable
    fun MiCampoDeTexto(spacer: Dp = 20.dp) {
        var texto by remember { mutableStateOf("") } // Estado para el contenido

        TextField(
            value = texto, // Texto actual
            onValueChange = { texto = it }, // Cambios en el texto
            label = { Text("Escribe algo...") }, // Etiqueta flotante
            modifier = Modifier.fillMaxWidth(), // Ocupar ancho completo
            singleLine = true // Para evitar múltiples líneas
        )
        Spacer(modifier = Modifier.height(spacer))
    }


    @Preview(showSystemUi = true)
    @Composable
    fun PreviewUI() {
        RegisterScreen()
    }

    companion object CONSTANTES {
        private val ALTURA_REGISTER: Dp = 130.dp
        private val ANCHO_REGISTER: Dp = 30.dp
    }

}


