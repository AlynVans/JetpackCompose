package com.example.jetpackcompose.lesson_1

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview(showBackground = true)
fun CustomModifiersPreview() {
    CustomModifiers()
}

// Функция с дефолтными модификаторами для текста
@Composable
fun DefaultModifier() {
    MessageWithDefaultModifier("TEXT1")
}

@Composable
fun MessageWithDefaultModifier(
    text: String, modifier: Modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp)
) {
    Text(text, modifier, fontSize = 28.sp, textAlign = TextAlign.Center)
}

// Функция с переменными модификаторами для текста
@Composable
fun VariableModifier() {
    val myModifier = Modifier
        .fillMaxWidth()
        .padding(10.dp)
        .border(width = 2.dp, color = Color.DarkGray)
        .background(Color.LightGray)
        .padding(20.dp)
    MessageWithCustomModifier("TEXT2", myModifier)
}

@Composable
fun MessageWithCustomModifier(
    text: String, modifier: Modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp)
) {
    Text(text, modifier, fontSize = 28.sp, textAlign = TextAlign.Center)
}

// Функция для объединения модификаторов
@Composable
fun CustomModifiers() {
    val customModifier = Modifier
        .border(width = 2.dp, color = Color.DarkGray, shape = CircleShape)
        .clip(shape = CircleShape)
        .background(Color.LightGray)
        .padding(20.dp)
    MessageWithCombinedModifier("TEXT3", customModifier)
}

@Composable
fun MessageWithCombinedModifier(text: String, modifier: Modifier = Modifier) {
    val defaultModifier = Modifier
        .fillMaxWidth()
        .padding(10.dp)
    Text(text, defaultModifier.then(modifier), fontSize = 28.sp, textAlign = TextAlign.Center)
}