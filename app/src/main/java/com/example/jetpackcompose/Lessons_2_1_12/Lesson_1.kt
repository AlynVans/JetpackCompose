package com.example.jetpackcompose.Lessons_2_1_12

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview
fun TextTest1() {
    val myColor: Color = Color(0xFFFFC107)
    Box(
        modifier = Modifier
            .background(Color.Red)
            .fillMaxSize(),
        contentAlignment = Alignment.Center,
    )
    {
        Box(
            modifier = Modifier
                .background(Color.DarkGray)
                .size(320.dp)
        )
        Box(
            modifier = Modifier
                .background(Color.LightGray)
                .size(280.dp)
        )
        Text("Hello METANIT.COM", fontSize = 28.sp, modifier = Modifier.padding(10.dp))
    }

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center)
    {
        Text(
            "TopStart", fontSize = 28.sp, modifier = Modifier
                .background(Color.Green)
                .align(Alignment.TopStart)
        )
        Text(
            "TopEnd", fontSize = 28.sp, modifier = Modifier
                .background(Color.Green)
                .align(Alignment.TopEnd)
        )
        Text(
            "Center", fontSize = 28.sp, modifier = Modifier
                .background(Color.Green)
                .align(Alignment.Center)
        )
        Text(
            "BottomStart", fontSize = 28.sp, modifier = Modifier
                .background(Color.Green)
                .align(Alignment.BottomStart)
        )
        Text(
            "BottomEnd", fontSize = 28.sp, modifier = Modifier
                .background(Color.Green)
                .align(Alignment.BottomEnd)
        )
    }
}