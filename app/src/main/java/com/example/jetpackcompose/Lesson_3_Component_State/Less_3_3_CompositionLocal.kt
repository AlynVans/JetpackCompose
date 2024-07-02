package com.example.jetpackcompose.Lesson_3_Component_State

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.tooling.preview.Preview

val LocalUserName = compositionLocalOf { "Гость" }

@Composable
@Preview
fun SimpleApp() {
    Column {
        Greeting()        // Используем значение по умолчанию

        CompositionLocalProvider(LocalUserName provides "Алиса") {         //  Новое значение
            Greeting()
        }
        CompositionLocalProvider(LocalUserName provides "Alyn") {          //  Новое значение
            Greeting()
        }
    }
}

@Composable
fun Greeting() {
    val username = LocalUserName.current     // Получаем текущее значение LocalUserName
    Text("Привет, $username!")
}
