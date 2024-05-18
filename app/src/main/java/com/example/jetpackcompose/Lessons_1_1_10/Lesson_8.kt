package com.example.jetpackcompose.Lessons_1_1_10

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview
fun TextTest8() {
    val myColor: Color = Color(0xFFFFC107)
    Text(
        "Hello METANIT.COM",
        fontSize = 28.sp,
        modifier = Modifier
            .padding(20.dp)
            .shadow(4.dp, shape = CircleShape)
            .padding(20.dp)
    )
}