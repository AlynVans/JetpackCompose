package com.example.jetpackcompose.lesson_2.Less_7
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
@Preview(showBackground = true)
fun LazyHorizGridTest_1() {
    val itemsList = (0..12).toList()  // Создаем список чисел от 0 до 12.

    LazyHorizontalGrid(
        rows = GridCells.Fixed(3),  // Задаем количество строк равным трем.
        modifier = Modifier.fillMaxSize()  // Modifier.fillMaxSize() заставляет сетку занять все доступное пространство.
    ) {
        items(itemsList) { item ->
            // Добавляем padding к каждому элементу, чтобы создать пространство между ними.
            Text(
                "Item $item",
                fontSize = 28.sp,
                color = Color.Red,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}
