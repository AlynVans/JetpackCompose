package com.example.jetpackcompose.lesson_2.Less_2

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
@Preview(showBackground = true)
fun Ex_ColumnScope() {
    Column(modifier = Modifier.fillMaxSize())
    {
        Text("Start", fontSize = 28.sp, modifier = Modifier.align(Alignment.Start))
        Text("Center", fontSize = 28.sp, modifier = Modifier.align(Alignment.CenterHorizontally))
        Text("End", fontSize = 28.sp, modifier = Modifier.align(Alignment.End))
    }
}