package com.example.jetpackcompose.lesson_5_Resource

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.R

@Composable
@Preview
fun ColorsTest() {
    Text(
        text = "Hello METANIT.COM",
        fontSize = 26.sp,
        color = colorResource(R.color.textViewFontColor),
        modifier = Modifier
            .padding(20.dp)
            .fillMaxWidth()
            .background(colorResource(R.color.textViewBackColor))
            .padding(50.dp)
    )
}