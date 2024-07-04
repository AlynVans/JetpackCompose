package com.example.jetpackcompose.lesson_2.Less_10

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview(showBackground = true)
fun IntrinsicSizeTest() {

    Column(Modifier.padding(5.dp)) {
        Text("Hello METANIT.COM", Modifier.padding(start = 5.dp), fontSize = 28.sp)
        Box(
            Modifier
                .height(10.dp)
                .fillMaxWidth()
                .background(Color.Blue)
        )
    }

    Column(
        Modifier
            .padding(start = 5.dp, top = 69.dp)
            .width(IntrinsicSize.Max)
    ) {
        Text("Bruh Metanit", Modifier.padding(start = 5.dp), fontSize = 32.sp)
        Box(
            Modifier
                .height(15.dp)
                .fillMaxWidth()
                .background(Color.Red)
        )
    }

    Column(
        Modifier
            .padding(start = 5.dp, top = 169.dp)
            .width(IntrinsicSize.Min)
    ) {
        Text("Epic Bruh Predator Akbarxon", Modifier.padding(start = 5.dp), fontSize = 36.sp)
        Box(
            Modifier
                .height(15.dp)
                .fillMaxWidth()
                .background(Color.Green)
        )
    }
}
