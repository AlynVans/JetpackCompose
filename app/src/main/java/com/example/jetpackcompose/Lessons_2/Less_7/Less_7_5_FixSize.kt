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
fun Less_7_5_FixSize() {
    val langs = listOf(
        ProgrammingLanguage5("Kotlin", 0xff16a085),
        ProgrammingLanguage5("C++", 0xfff39c12),
        ProgrammingLanguage5("Python", 0xffc71585),
        ProgrammingLanguage5("Java", 0xff4682b4),
        ProgrammingLanguage5("JavaScript", 0xffffd700),
        ProgrammingLanguage5("Ruby", 0xffdc143c),
        ProgrammingLanguage5("Go", 0xff00ced1),
        ProgrammingLanguage5("Swift", 0xff8a2be2),
        ProgrammingLanguage5("Kotlin", 0xffff6347),
        ProgrammingLanguage5("PHP", 0xff40e0d0),
        ProgrammingLanguage5("Rust", 0xffdaa520),
        ProgrammingLanguage5("TypeScript", 0xff008080),
        ProgrammingLanguage5("C#", 0xff6a5acd),
        ProgrammingLanguage5("Scala", 0xffb22222),
        ProgrammingLanguage5("Perl", 0xffdeb887),
        ProgrammingLanguage5("Haskell", 0xffbdb76b),
        ProgrammingLanguage5("Lua", 0xffff4500),
        ProgrammingLanguage5("Elixir", 0xff2e8b57),
        ProgrammingLanguage5("Dart", 0xff7b68ee),
        ProgrammingLanguage5("Clojure", 0xff3cb371),
        ProgrammingLanguage5("F#", 0xff800000)
    )
    LazyVerticalGrid(
        columns = GridCells.FixedSize(size=140.dp),
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.Center
    ){
        items(langs) {lang ->
            Column(Modifier.padding(7.dp), horizontalAlignment = Alignment.CenterHorizontally){
                Box(Modifier.size(100.dp).background(Color(lang.hexColor)))
                Text(lang.name, fontSize = 24.sp)
            }
        }
    }
}
data class ProgrammingLanguage5(val name: String, val hexColor: Long)