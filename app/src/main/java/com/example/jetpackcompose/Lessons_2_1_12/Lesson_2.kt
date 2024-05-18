package com.example.jetpackcompose.Lessons_2_1_12

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview
fun TextTest2() {
    Column(
        modifier = Modifier
            .height(550.dp)
    ) {
        Text("Kotlin", fontSize = 28.sp)
        Text("Java", fontSize = 28.sp)
        Text("JavaScript", fontSize = 28.sp)
        Text("Python", fontSize = 28.sp)
    }
}