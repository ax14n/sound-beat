package com.ax14n.sound_beat.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import com.ax14n.sound_beat.ui.theme.Scarlet
import com.ax14n.sound_beat.ui.theme.workbench

@Composable
fun FormScreen(
    headerText: String,
    emailHint: String,
    passwordHint: String,
    buttonText: String,
    linkText: String? = null, // Opcional: Si quieres agregar un link como "Login here!"
    buttonAction: () -> Unit,
    linkAction: (() -> Unit)? = null // Acción del link si lo necesitas
) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        CreateCard(
            headerText = headerText,
            emailHint = emailHint,
            passwordHint = passwordHint,
            buttonText = buttonText,
            buttonAction = buttonAction,
            linkText = linkText,
            linkAction = linkAction
        )
    }
}

@Composable
fun CreateCard(
    headerText: String,
    emailHint: String,
    passwordHint: String,
    buttonText: String,
    buttonAction: () -> Unit,
    linkText: String?,
    linkAction: (() -> Unit)?
) {
    Card(
        modifier = Modifier
            .padding(horizontal = 30.dp, vertical = 180.dp)
            .fillMaxWidth()
            .fillMaxHeight(), elevation = CardDefaults.elevatedCardElevation()
    ) {
        CardContent(
            headerText = headerText,
            emailHint = emailHint,
            passwordHint = passwordHint,
            buttonText = buttonText,
            buttonAction = buttonAction,
            linkText = linkText,
            linkAction = linkAction
        )
    }
}

@Composable
fun CardContent(
    headerText: String,
    emailHint: String,
    passwordHint: String,
    buttonText: String,
    buttonAction: () -> Unit,
    linkText: String?,
    linkAction: (() -> Unit)?
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 40.dp, horizontal = 20.dp),
        verticalArrangement = Arrangement.spacedBy(1.dp) // Espaciado entre los elementos
    ) {
        // Centrar el header
        Row(
            modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center
        ) {
            TextCustomized(
                text = headerText,
                size = 40f,
                fontFamily = workbench,
                textDecoration = TextDecoration.Underline
            )
        }
        Spacer(modifier = Modifier.height(40.dp))

        TextCustomized(text = emailHint, size = 15f)
        Spacer(modifier = Modifier.height(10.dp))
        TextFieldCustomized()
        Spacer(modifier = Modifier.height(40.dp))

        TextCustomized(text = passwordHint, size = 15f)
        Spacer(modifier = Modifier.height(10.dp))
        TextFieldCustomized()
        Spacer(modifier = Modifier.height(10.dp))

        // Si el texto del link está disponible, muéstralo
        linkText?.let {
            Row(
                modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End
            ) {
                TextCustomized(
                    text = it,
                    textDecoration = TextDecoration.Underline,
                    size = 15f,
                    color = Scarlet,
                    onClick = {
                        linkAction?.invoke()
                    }
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
        }

        Row(
            modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center
        ) {
            ButtonCustomized(text = buttonText) {
                buttonAction()
            }
        }
    }
}
