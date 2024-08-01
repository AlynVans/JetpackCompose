import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.FilterQuality
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.R

@Composable
@Preview
fun SampleImage() {
    Image(
        painter = painterResource(id = R.drawable.mem),
        contentDescription = "Пример изображения",
        modifier = Modifier
            .size(200.dp)
            .clip(RoundedCornerShape(16.dp))
            .border(2.dp, Color.Gray, RoundedCornerShape(16.dp)),
        contentScale = ContentScale.Crop,
        alignment = Alignment.Center,
        alpha = 0.8f,
        colorFilter = ColorFilter.tint(Color.Red.copy(alpha = 0.5f))
    )
    val bitmap = ImageBitmap.imageResource(id = R.drawable.mem)
    Image(
        bitmap = bitmap,
        contentDescription = "Пример растрового изображения",
        modifier = Modifier
            .size(200.dp)
            .clip(CircleShape)
            .border(2.dp, Color.Blue, CircleShape),
        contentScale = ContentScale.FillBounds,
        alignment = Alignment.TopCenter,
        alpha = 0.9f,
        colorFilter = ColorFilter.lighting(
            multiply = Color.Yellow,
            add = Color.Red
        ),
        filterQuality = FilterQuality.High
    )
    val vector = ImageVector.vectorResource(id = R.drawable.search)
    Image(
        imageVector = vector,
        contentDescription = "Пример векторного изображения",
        modifier = Modifier
            .size(150.dp)
            .background(Color.LightGray)
            .padding(8.dp),
        contentScale = ContentScale.Fit,
        alignment = Alignment.BottomEnd,
        alpha = 1f,
        colorFilter = ColorFilter.tint(
            color = Color.Green,
            blendMode = BlendMode.Multiply
        )
    )
}

/*
bitmap: объект типа ImageBitmap, которое собственно представляет изображение для отрисовки

contentDescription: представляет строковое описание для изображения, которое применяется сервисами accessibility в служебных целях

modifier: представляет объект Modifier, который определяет модификаторы компонента

alignment: представляет объект типа Alignment, которое задает выравнивание изображения. Значение по умолчанию - Alignment.Center.

contentScale: объект типа ContentScale, который принцип масштабирования изображения. По умолчанию равно ContentScale.Fit

Может принимать следующие значения:

ContentScale.Crop: масштабирует изображение с сохранением аспектного отношения (отношение высоты и ширины) таким образом, что ширина и высота оказываются равными или больше сторон контейнера.

ContentScale.FillBounds: неравномерно масштабирует изображение для полного заполнения пространства контейнера.

ContentScale.FillHeight: масштабирует изображение с сохранением аспектного отношения таким образом, что высота изображения равна высоте контейнера.

ContentScale.FillWidth: масштабирует изображение с сохранением аспектного отношения таким образом, что ширина изображения равна ширине контейнера.

ContentScale.Fit: масштабирует изображение с сохранением аспектного отношения (отношение высоты и ширины) таким образом, что ширина и высота оказываются равными или меньше сторон контейнера.

ContentScale.Inside: масштабирует изображение с сохранением аспектного отношения (отношение высоты и ширины) таким образом, чтобы вместить изображение внутри контейнера, если ширина и(или) высота изобажения больше ширины и(или) высоты контейнера.

ContentScale.None: масштабирование отсутствует

alpha: задает прозрачность изображения в виде значения типа Float

colorFilter: устанавливает применяемые к изображению цветовые фильтры в виде объекта ColorFilter

filterQuality: задает алгоритм выборки пикселей из изображения. Представляет объект типа FilterQuality и по умолчанию имеет значение FilterQuality.Low
 */