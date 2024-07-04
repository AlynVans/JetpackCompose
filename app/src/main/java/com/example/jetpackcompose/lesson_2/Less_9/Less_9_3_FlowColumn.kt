import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowColumn
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
fun FlowColumnTest_1() {
    val rects = listOf(
        Rect(50f, 0xff16a085), Rect(100f, 0xff8e44ad),
        Rect(75f, 0xff2980b9), Rect(125f, 0xff2c3e50),
        Rect(100f, 0xfff39c12), Rect(75f, 0xff27ae60),
        Rect(50f, 0xffd35400), Rect(110f, 0xfff6b93b),
        Rect(100f, 0xff0a3d62), Rect(75f, 0xffb71540)
    )
    FlowColumn(Modifier.fillMaxSize(), maxItemsInEachColumn = 4) {
        rects.forEach { rect ->
            Box(
                Modifier
                    .size(100.dp, Dp(rect.height))
                    .padding(5.dp)
                    .background(Color(rect.hexColor))
            )
        }
    }
}

data class Rect(val height: Float, val hexColor: Long)