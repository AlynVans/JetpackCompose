package com.example.jetpackcompose.Lessons_2.Less_6

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview(showBackground = true)
fun LazyRowTest() {
    val langs = listOf(
        Language("Kotlin", 0xff16a085),
        Language("Java", 0xff2980b9),
        Language("JavaScript", 0xffd35400),
        Language("Python", 0xff2c3e50)
    )
    LazyRow {
        items(langs) { lang ->
            Column(Modifier.padding(8.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                Box(Modifier.size(100.dp).background(Color(lang.hexColor)))
                Text(lang.name, fontSize = 24.sp, modifier = Modifier.padding(8.dp))
            }
        }
    }
}

data class Language(val name:String, val hexColor: Long)