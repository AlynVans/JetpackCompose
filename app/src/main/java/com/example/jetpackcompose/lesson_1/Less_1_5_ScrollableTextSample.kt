package com.example.jetpackcompose.lesson_1

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview(showBackground = true)
fun TextScrollTest() {

    val text = "What is Lorem Ipsum?\n" +
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.\n" +
            "\n" +
            "..............."

    // Текст с горизонтальным скроллом
    Text(
        text = text,
        fontSize = 22.sp,
        modifier = Modifier.horizontalScroll(ScrollState(115)) // Поддержка горизонтального скролла, ScrollState(115) - Значение начала просмотра
    )

    // Текст с вертикальным и горизонтальным скроллом
    val repeatedText = text.repeat(15)
    Text(
        text = repeatedText,
        fontSize = 22.sp,
        modifier = Modifier
            .padding(top = 80.dp)
            .verticalScroll(rememberScrollState())
            .horizontalScroll(rememberScrollState())
    )
}
