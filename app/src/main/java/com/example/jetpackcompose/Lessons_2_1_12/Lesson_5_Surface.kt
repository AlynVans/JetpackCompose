package com.example.jetpackcompose.Lessons_2_1_12

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
@Preview
fun TestText5(){
    val langs = listOf("Kotlin", "Java", "JavaScript", "Python")
    Surface(
        Modifier.fillMaxSize(),
        contentColor = Color.LightGray,
        color = Color.DarkGray
    ) {
        Column {
            Text("Языки программирования", fontSize = 28.sp)
            for (lang in langs) {
                Text(lang, fontSize = 22.sp)
            }
        }
    }
}