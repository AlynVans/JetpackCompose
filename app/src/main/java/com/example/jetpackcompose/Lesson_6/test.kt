
import androidx.compose.foundation.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import com.example.jetpackcompose.R

@Composable
@Preview
fun imagine(){
    Image(
        bitmap = ImageBitmap.imageResource(R.drawable.prog_cat),
        contentDescription = "Зимний лес"
    )
}