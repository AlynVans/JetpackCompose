package com.example.jetpackcompose.Lessons_2.Less_7

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.background
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview(showBackground = true)
fun Less_7_3_LazyVertGrid() {
    val langs = listOf(
        ProgrammingLanguage("Kotlin", 0xff16a085),
        ProgrammingLanguage("C++", 0xfff39c12),
        ProgrammingLanguage("Python", 0xffc71585),
        ProgrammingLanguage("Java", 0xff4682b4),
        ProgrammingLanguage("JavaScript", 0xffffd700),
        ProgrammingLanguage("Ruby", 0xffdc143c),
        ProgrammingLanguage("Go", 0xff00ced1),
        ProgrammingLanguage("Swift", 0xff8a2be2),
        ProgrammingLanguage("Kotlin", 0xffff6347),
        ProgrammingLanguage("PHP", 0xff40e0d0),
        ProgrammingLanguage("Rust", 0xffdaa520),
        ProgrammingLanguage("TypeScript", 0xff008080),
        ProgrammingLanguage("C#", 0xff6a5acd),
        ProgrammingLanguage("Scala", 0xffb22222),
        ProgrammingLanguage("Perl", 0xffdeb887),
        ProgrammingLanguage("Haskell", 0xffbdb76b),
        ProgrammingLanguage("Lua", 0xffff4500),
        ProgrammingLanguage("Elixir", 0xff2e8b57),
        ProgrammingLanguage("Dart", 0xff7b68ee),
        ProgrammingLanguage("Clojure", 0xff3cb371),
        ProgrammingLanguage("F#", 0xff800000)
    )
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.Center
    ){
        items(langs) {lang ->
            Column(Modifier.padding(8.dp), horizontalAlignment = Alignment.CenterHorizontally){
                Box(Modifier.size(100.dp).background(Color(lang.hexColor)))
                Text(lang.name, fontSize = 24.sp,modifier= Modifier.padding(5.dp))
            }
        }
    }
}
data class ProgrammingLanguage(val name: String, val hexColor: Long)