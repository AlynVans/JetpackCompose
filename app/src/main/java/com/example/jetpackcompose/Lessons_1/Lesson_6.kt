package com.example.jetpackcompose.Lessons_1

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview
fun BorderShapeTest() {

    Column {
        Text(
            "TEXT1",
            fontSize = 69.sp,
            modifier = Modifier
                .padding(10.dp)     // отступы между границей компонента и границами контейнера
                .border(width = 2.dp, color = Color.Red)
                .padding(10.dp)     // отступы между границей и содержимым компонента
        )
        Text(
            "TEXT2",
            fontSize = 69.sp,
            modifier = Modifier
                .padding(top = 150.dp)
                .border(width = 2.dp, color = Color.Green, shape = RoundedCornerShape(30.dp))
                .padding(10.dp)
        )
    }
}