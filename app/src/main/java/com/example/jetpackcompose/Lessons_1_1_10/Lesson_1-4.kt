package com.example.jetpackcompose.Lessons_1_1_10

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import androidx.compose.ui.unit.sp

@Composable
@Preview
fun TextTest() {
    val myColor: Color = Color(0xFFFFC107)
    Text(
        "back",
        fontSize = 69.sp,
        modifier = Modifier
            .padding(start = 20.dp, top=40.dp, bottom = 30.dp, end = 5.dp)
            .background(Color.Red)
            .fillMaxSize()

    )
    Text(
        "Bruh1",
        fontSize = 40.sp,
        modifier = Modifier
            .background(Color.Blue)
            .padding()
            .width(300.dp)
            .fillMaxHeight(0.6f)
    )
    val innerPadding = PaddingValues(top = 30.dp, start = 115.dp) //Шаблон
    Text(
        "Bruh2",
        fontSize = 40.sp,
        modifier = Modifier
            .padding(innerPadding) //шаблон
            .background(myColor)
            .height(300.dp)
            .fillMaxWidth(0.5f)

    )
    Text(
        "Bruh3",
        fontSize = 40.sp,
        modifier = Modifier
            .padding(vertical = 90.dp)
            .background(Color.Cyan)
            .size(300.dp)

    )
}