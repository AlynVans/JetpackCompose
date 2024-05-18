package com.example.jetpackcompose.Lessons_2_1_12.Lessons2_6_Example

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
@Preview
fun TestText261(){
    val langs = listOf("Kotlin", "Java", "JavaScript", "Python", "C#", "C++", "Rust")
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(5.dp)
    ){
        item { Text("Языки программирования", fontSize = 29.sp) }
        itemsIndexed(langs){index,lang -> Text(lang, fontSize = 23.sp,
            modifier=Modifier.background(
                if(index%2==0) Color(0xffdddddd) else Color.Transparent
            ).padding(8.dp).fillMaxWidth())}
    }
}