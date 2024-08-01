package com.example.jetpackcompose.lesson_4_VisualComponents

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview

fun SelectableTest() {
    Column {

        var selectedText by remember { mutableStateOf(true) }
        Text(
            text = selectedText.toString(),
            fontSize = 30.sp,
            modifier = Modifier.selectable(
                selected = selectedText,
                onClick = { selectedText = !selectedText }
            )
        )

        val colors = listOf(Color.Red, Color.Yellow, Color.Green)
        var selectedColorOption by remember { mutableStateOf(colors[0]) }
        Column(modifier = Modifier.padding(20.dp)) {
            Box(
                Modifier
                    .padding(10.dp)
                    .size(100.dp)
                    .background(color = selectedColorOption)
            )

            colors.forEach { colorBruh ->
                val selected = selectedColorOption == colorBruh
                Box(
                    Modifier
                        .padding(8.dp)
                        .size(60.dp)
                        .background(color = colorBruh)
                        .selectable(
                            selected = selected,
                            onClick = { selectedColorOption = colorBruh }
                        )
                        .border(
                            width = if (selected) 3.dp else 0.dp,
                            color = Color.Black
                        )
                )
            }
        }

        val langs = listOf(
            Language("Kotlin", 0xff16a085),
            Language("Java", 0xff2980b9),
            Language("JavaScript", 0xffe74c3c),
            Language("Python", 0xffd35400)
        )
        var selectedOption by remember { mutableStateOf(langs[0]) }
        Column {

            Row(
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    Modifier
                        .padding(10.dp)
                        .size(100.dp)
                        .background(color = Color(selectedOption.hexColor))
                )
                Text(
                    text = selectedOption.name,
                    fontSize = 36.sp,
                    modifier = Modifier.padding(10.dp),

                    )
            }

            for (lang in langs) {
                val selected = selectedOption == lang
                Row(
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxWidth()
                        .selectable(selected = selected, onClick = { selectedOption = lang }),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        Modifier
                            .padding(8.dp)
                            .size(60.dp)
                            .background(Color(lang.hexColor))
                            .border(
                                width = if (selected) {
                                    8.dp
                                } else {
                                    2.dp
                                },
                                color = Color.Black
                            )
                    )
                    Text(text = lang.name, fontSize = 28.sp)
                }
            }
        }
    }
}

data class Language(val name: String, val hexColor: Long)
