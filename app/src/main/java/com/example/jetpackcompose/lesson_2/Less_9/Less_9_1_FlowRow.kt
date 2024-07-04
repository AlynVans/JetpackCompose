
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalLayoutApi::class)
@Composable
@Preview(showBackground = true)
fun FlowRowTest_1() {
    val rects = listOf(
        Rect1(50f,0xff16a085), Rect1(100f,0xff8e44ad),
        Rect1(75f,0xff2980b9), Rect1(125f,0xff2c3e50),
        Rect1(100f,0xfff39c12), Rect1(75f,0xff27ae60),
        Rect1(50f,0xffd35400), Rect1(110f,0xfff6b93b),
        Rect1(100f,0xff0a3d62), Rect1(75f,0xffb71540)
    )
    FlowRow(Modifier.fillMaxSize(), maxItemsInEachRow = 5){
        rects.forEach { rect ->
            Box(
                Modifier.size(Dp(rect.width), 100.dp).padding(5.dp).background(Color(rect.hexColor))
            )
        }
    }
}

data class Rect1(val width: Float, val hexColor: Long)