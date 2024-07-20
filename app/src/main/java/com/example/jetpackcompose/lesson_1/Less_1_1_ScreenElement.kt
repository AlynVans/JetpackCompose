package com.example.jetpackcompose.lesson_1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview(showBackground = true)
fun ScreenElementTest() {
    val myColor = Color(0xFFFFC107) // Задаем цвет

    Text(
        text = "back",
        fontSize = 69.sp, // Размер шрифта
        modifier = Modifier
            .padding(
                start = 20.dp,
                top = 40.dp,
                bottom = 30.dp,
                end = 5.dp
            ) // Отступы
            .background(Color.Red) // Цвет фона
            .fillMaxSize() // Размер элемента
    )

    Text(
        text = "Bruh1",
        fontSize = 40.sp, // Размер шрифта
        modifier = Modifier
            .background(Color.Blue) // Цвет фона
            .padding(0.dp) // Отступы (по умолчанию)
            .width(300.dp) // Ширина элемента
            .fillMaxHeight(0.6f) // Высота элемента (относительная)
    )

    val innerPadding = PaddingValues(
        top = 30.dp,
        start = 115.dp
    ) // Шаблон отступов

    Text(
        text = "Bruh2",
        fontSize = 40.sp, // Размер шрифта
        modifier = Modifier
            .padding(innerPadding) // Применение шаблона отступов
            .background(myColor) // Цвет фона
            .height(300.dp) // Высота элемента
            .fillMaxWidth(0.5f) // Ширина элемента (относительная)
    )

    Text(
        text = "Bruh3",
        fontSize = 40.sp, // Размер шрифта
        modifier = Modifier
            .padding(vertical = 90.dp) // Вертикальные отступы
            .background(Color.Cyan) // Цвет фона
            .size(300.dp) // Размер элемента (ширина и высота)
    )
}
