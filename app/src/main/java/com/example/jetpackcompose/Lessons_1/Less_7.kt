package com.example.jetpackcompose.Lessons_1

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview(showBackground = true)
fun ClipTest() {

    Column {
        Text(
            "TEXT1",
            fontSize = 28.sp,
            modifier = Modifier
                .padding(10.dp)
                .clip(shape = RoundedCornerShape(30.dp))
                .background(Color.LightGray)
                .padding(15.dp)
        )

        Text(
            "TEXT2",
            fontSize = 28.sp,
            modifier = Modifier
                .padding(10.dp)
                .clip(shape = RoundedCornerShape(30.dp))
                .border(width = 2.dp, color = Color.DarkGray, shape = RoundedCornerShape(30.dp))
                .background(Color.LightGray)
                .padding(15.dp)
        )

        Text(
            "TEXT3",
            fontSize = 28.sp,
            modifier = Modifier
                .padding(10.dp)     // отступ от границ контейнера
                .background(Color.DarkGray)
                .padding(25.dp)    // отступ от границ фрагмента
                .clip(shape = RectangleShape)
                .border(width = 2.dp, color = Color.White)
                .background(Color.LightGray)
                .padding(20.dp)     // отступ между границей во фрагменте и текстом
        )
    }
}