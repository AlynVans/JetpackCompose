package com.example.jetpackcompose.lesson_4.Buttons

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color

@Composable
fun CustomButton() {
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()
    val isHovered by interactionSource.collectIsHoveredAsState()

    val backgroundColor = when {
        isPressed -> Color(0xFF0000AA) // Темно-синий
        isHovered -> Color(0xFF8080FF) // Светло-синий
        else -> Color.Blue
    }

    Button(
        onClick = { /* действие */ },
        colors = ButtonDefaults.buttonColors(
            containerColor = backgroundColor,
            contentColor = Color.White
        ),
        interactionSource = interactionSource
    ) {
        Text("Кастомная кнопка")
    }
}