package com.example.jetpackcompose.lesson_4

import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Icon
import androidx.compose.material3.IconToggleButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp


@Composable
@Preview
fun IconButton() {
    var checked by remember { mutableStateOf(false) }
    Row(verticalAlignment = Alignment.CenterVertically) {
        IconToggleButton(checked = checked, onCheckedChange = { checked = it }) {
            Icon(
                imageVector = if (checked) Icons.Filled.Check else Icons.Filled.Info,
                contentDescription = "Информация о приложении",
                tint = if (checked) Color(0xFFEC407A) else Color(0xFFB0BEC5)
            )
        }
        Text(
            text = if (checked) "Выбрано" else "Не выбрано",
            fontSize = 28.sp
        )
    }
}