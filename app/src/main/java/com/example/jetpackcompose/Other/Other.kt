import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DemoTextOverflow() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            "Это очень длинный текст, который должен демонстрировать переполнение и обрезку. Это действительно очень-очень длинный текст, который должен выйти за пределы экрана.",
            modifier = Modifier,
            fontSize = 25.sp,
            color = Color.Red,
            overflow = TextOverflow.Clip,
            maxLines = 1
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            "Это очень длинный текст, который должен демонстрировать переполнение и обрезку. Это действительно очень-очень длинный текст, который должен выйти за пределы экрана.",
            modifier = Modifier,
            fontSize = 25.sp,
            color = Color.Red,
            overflow = TextOverflow.Ellipsis,
            maxLines = 1
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            "Это очень длинный текст, который должен демонстрировать переполнение и обрезку. Это действительно очень-очень длинный текст, который должен выйти за пределы экрана.",
            modifier = Modifier.width(200.dp),
            fontSize = 25.sp,
            color = Color.Red,
            overflow = TextOverflow.Visible,
            maxLines = 1
        )
    }
}