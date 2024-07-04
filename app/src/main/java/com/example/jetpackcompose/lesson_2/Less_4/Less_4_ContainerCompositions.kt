package com.example.jetpackcompose.lesson_2.Less_4

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview(showBackground = true)
fun ContainerCompositions() {
    val langs = listOf(
        Language("Kotlin", 0xff16a085),
        Language("Java", 0xff2980b9),
        Language("JavaScript", 0xffe74c3c),
        Language("Python", 0xffd35400)
    )
    Column {
        for (lang in langs) {
            Row(modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()) {
                Box(modifier = Modifier
                    .size(50.dp)
                    .background(Color(lang.hexColor)))
                Text(text = lang.name, fontSize = 28.sp, modifier = Modifier.padding(10.dp))
            }
        }
    }
}

data class Language(val name: String, val hexColor: Long)