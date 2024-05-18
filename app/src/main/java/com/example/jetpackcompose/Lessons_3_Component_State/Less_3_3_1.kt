package com.example.jetpackcompose.Lessons_3_Component_State

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
@Preview
fun CompositionLocal() {
    Column {
        Composable12()
        // изменяем состояние для подветки компонента Composable21
        CompositionLocalProvider(LocalMessage provides "World") {
            Composable12()
        }
        Composable12()
        CompositionLocalProvider(LocalMessage provides "Bruh") {
            Composable22()
        }

    }
}

// локальное состояние
val LocalMessage = staticCompositionLocalOf { "Hello" }
val TestMessage = staticCompositionLocalOf { "Test"}

@Composable
fun Composable21() {
    Composable22()
}

// получаем состояние
@Composable
fun Composable22() {
    Text(LocalMessage.current, fontSize = 28.sp)
}

@Composable
fun Composable11() {
    Composable12()
}

@Composable
fun Composable12() {
    Text(LocalMessage.current, fontSize = 28.sp)
}
