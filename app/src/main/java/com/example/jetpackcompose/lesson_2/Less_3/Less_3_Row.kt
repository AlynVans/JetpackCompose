package com.example.jetpackcompose.lesson_2.Less_3

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview(showBackground = true)
fun RowTest() {

    Row {
        Box(
            modifier = Modifier
                .background(Color.Red)
                .height(150.dp)
                .width(100.dp)
        )
        Box(
            modifier = Modifier
                .background(Color.DarkGray)
                .height(150.dp)
                .width(100.dp)
        )
        Box(
            modifier = Modifier
                .background(Color.Blue)
                .height(150.dp)
                .width(100.dp)
        )
    }

    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly)
    {
        Box(
            modifier = Modifier
                .padding(top = 180.dp)
                .background(Color.Red)
                .height(150.dp)
                .width(100.dp)
        )
        Box(
            modifier = Modifier
                .padding(top = 180.dp)
                .background(Color.DarkGray)
                .height(150.dp)
                .width(100.dp)
        )
        Box(
            modifier = Modifier
                .padding(top = 180.dp)
                .background(Color.Blue)
                .height(150.dp)
                .width(100.dp)
        )
    }

    Row {
        Box(
            modifier = Modifier
                .padding(top = 450.dp)
                .background(Color.Red)
                .height(150.dp)
                .weight(1f)
        )
        Box(
            modifier = Modifier
                .padding(top = 450.dp)
                .background(Color.DarkGray)
                .height(150.dp)
                .width(150.dp)
        )
        Box(
            modifier = Modifier
                .padding(top = 450.dp)
                .background(Color.Blue)
                .height(150.dp)
                .weight(2f)
        )
    }

    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    )
    {
        Text(
            "Top",
            fontSize = 28.sp,
            modifier = Modifier
                .background(Color.Yellow)
                .align(Alignment.Top)
        )
        Text(
            "CenterVertically",
            fontSize = 28.sp,
            modifier = Modifier
                .background(Color.Yellow)
                .align(Alignment.CenterVertically)
        )
        Text(
            "Bottom",
            fontSize = 28.sp,
            modifier = Modifier
                .background(Color.Yellow)
                .align(Alignment.Bottom)
        )
    }
}