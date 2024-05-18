import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.background
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview
fun Less_2_7_2_Grid() {
    val langs = listOf(
        Language("Kotlin", 0xff16a085),
        Language("Java", 0xff2980b9),
        Language("JavaScript", 0xff8e44ad),
        Language("Python", 0xff2c3e50),
        Language("Rust", 0xffd35400),
        Language("C#", 0xff27ae60),
        Language("C++", 0xfff39c12),
        Language("Go", 0xff1abc9c)
    )
    LazyHorizontalGrid(
        rows = GridCells.Fixed(2),
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.Center
    ) {
        items(langs) { lang ->
            Column(
                Modifier
                    .padding(8.dp)
                    .size(125.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    Modifier
                        .size(100.dp)
                        .background(Color(lang.hexColor)))
                Text(lang.name, fontSize = 24.sp, modifier = Modifier.padding(5.dp))
            }
        }
    }
}

data class Language(val name: String, val hexColor: Long)