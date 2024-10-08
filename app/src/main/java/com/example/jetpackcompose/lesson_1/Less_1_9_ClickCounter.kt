package com.example.jetpackcompose.lesson_1

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
@Preview(showBackground = true)
fun ClickCounter() {
    // Используем remember для сохранения состояния количества кликов
    val clickCount = remember { mutableStateOf(0) }

    Text(
        text = "Clicks: ${clickCount.value}",
        fontSize = 28.sp,
        modifier = Modifier.clickable(
            onClick = { clickCount.value += 1 } // Увеличиваем счетчик при клике
        )
    )
}