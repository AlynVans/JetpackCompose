package com.example.jetpackcompose.lesson_2.Less_1

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
@Preview(showBackground = true)
fun BoxTest() {

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
                .size(260.dp)
        )
        Text("TEXT - TEXT", fontSize = 38.sp, modifier = Modifier.padding(10.dp))
    }

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center)
    {
        Text(
            "TopS", fontSize = 28.sp, modifier = Modifier
                .background(Color.Green)
                .align(Alignment.TopStart)
        )

        Text(
            "TopC", fontSize = 28.sp, modifier = Modifier
                .background(Color.Yellow)
                .align(Alignment.TopCenter)
        )

        Text(
            "TopE", fontSize = 28.sp, modifier = Modifier
                .background(Color.Green)
                .align(Alignment.TopEnd)
        )

        Text(
            "CenterS", fontSize = 28.sp, modifier = Modifier
                .background(Color.Green)
                .align(Alignment.CenterStart)
        )

        Text(
            "Center", fontSize = 28.sp, modifier = Modifier
                .background(Color.Yellow)
                .align(Alignment.Center)
        )

        Text(
            "CenterE", fontSize = 28.sp, modifier = Modifier
                .background(Color.Green)
                .align(Alignment.CenterEnd)
        )

        Text(
            "BottomS", fontSize = 28.sp, modifier = Modifier
                .background(Color.Green)
                .align(Alignment.BottomStart)
        )

        Text(
            "BottomC", fontSize = 28.sp, modifier = Modifier
                .background(Color.Yellow)
                .align(Alignment.BottomCenter)
        )

        Text(
            "BottomE", fontSize = 28.sp, modifier = Modifier
                .background(Color.Green)
                .align(Alignment.BottomEnd)
        )
    }
}