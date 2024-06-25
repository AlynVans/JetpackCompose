import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalLayoutApi::class)
@Composable
@Preview(showBackground = true)
fun FlowColumnTest_2() {
    val langs = listOf(
        Language2("Kotlin", 0xff16a085),
        Language2("Java", 0xff2980b9),
        Language2("JavaScript", 0xff8e44ad),
        Language2("Python", 0xff2c3e50),
        Language2("Rust", 0xffd35400),
        Language2("C#", 0xff27ae60),
        Language2("C++", 0xfff39c12),
        Language2("Go", 0xff1abc9c)
    )
    FlowColumn(Modifier.fillMaxSize(), maxItemsInEachColumn = 3) {
        langs.forEach { lang ->
            Column(
                Modifier
                    .padding(7.dp)
                    .size(115.dp, 140.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    Modifier
                        .size(100.dp)
                        .background(Color(lang.hexColor)))
                Text(lang.name, fontSize = 22.sp, modifier = Modifier.padding(5.dp))
            }
        }
    }
}

data class Language2(val name: String, val hexColor: Long)