import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import coil3.request.ImageRequest
import coil3.request.crossfade
import com.ax14n.sound_beat.R

@Preview
@Composable
fun ImageCustomized(
    image: Any = R.drawable.ic_launcher_foreground,
    roundedCorner: Dp = 0.dp,
    borderSize: Dp = 0.dp,
    borderColor: Color = Color(0x00FFFFFF),
    width: Dp = 50.dp,
    height: Dp = 50.dp,
    circular: Boolean = false
) {

    var modifier: Modifier = Modifier
        .clip(RoundedCornerShape(roundedCorner))
        .border(borderSize, borderColor, RoundedCornerShape(roundedCorner))
        .size(width = width, height = height)

    if (circular) modifier = modifier.clip(CircleShape)

    if (image is Int) {
        // Usar imagen de recursos locales
        Image(
            painter = painterResource(id = image),
            contentDescription = "Imagen",
            modifier = modifier
        )
    } else if (image is String) {
        // Usar imagen desde una URL o URI (Coil 3)
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(image)  // Usar URL del GIF o imagen
                .crossfade(true)  // Hacer un efecto de transición suave
                .build(),
            contentDescription = "Imagen",
            contentScale = ContentScale.FillBounds, // 🔥 Estira el GIF o imagen para ocupar todo el espacio
            modifier = modifier
        )
    }
}
