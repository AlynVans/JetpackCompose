package com.example.jetpackcompose.Lessons_2_1_12.Lesson_2_2_Example

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
@Preview
fun Ex_Alignment() {
    Column(horizontalAlignment = Alignment.End, modifier = Modifier.fillMaxSize())
    {
        Text("Kotlin", fontSize = 28.sp)
        Text("Java", fontSize = 28.sp)
        Text("JavaScript", fontSize = 28.sp)
        Text("Python", fontSize = 28.sp)
    }
}