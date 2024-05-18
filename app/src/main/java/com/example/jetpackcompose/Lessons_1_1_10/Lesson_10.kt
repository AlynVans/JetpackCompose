package com.example.jetpackcompose.Lessons_1_1_10

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


@Composable
@Preview
fun TextTest10() {
    val myColor: Color = Color(0xFFFFC107)
    val customModifier = Modifier
        .border(width = 2.dp, color = Color.DarkGray, shape= CircleShape)
        .clip(shape= CircleShape)
        .background(Color.LightGray)
        .padding(20.dp)
    Message("Hello METANIT.COM", customModifier)
}

@Composable
fun Message(text:String, textModifier: Modifier=Modifier){
    val defaultModifier = Modifier.fillMaxWidth().padding(10.dp)
    Text(text, defaultModifier.then(textModifier), fontSize = 28.sp, textAlign = TextAlign.Center)
}