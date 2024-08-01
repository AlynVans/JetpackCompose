package com.example.jetpackcompose.lesson_4_VisualComponents

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview
fun ProgressIndicatorTest() {
    var progress by remember { mutableStateOf(0.0f) }

    Column {
        Text("Статус: $progress", fontSize = 28.sp)
        Button(
            onClick = {
                if (progress >= 1f) {
                    progress = 0f
                } else {
                    progress += 0.1f
                }
            }
        ) { Text("Запустить", fontSize = 22.sp) }

        Spacer(modifier = Modifier.height(10.dp))

        CircularProgressIndicator(progress = progress)

        Spacer(modifier = Modifier.height(10.dp))

        Box { CircularProgressIndicator() }

        Spacer(modifier = Modifier.height(10.dp))

        LinearProgressIndicator(
            progress = progress,
            color = Color.Red,
            trackColor = Color.Yellow
        )

        Spacer(modifier = Modifier.height(10.dp))

        LinearProgressIndicator()

    }
}