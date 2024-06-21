package com.example.jetpackcompose.Lessons_1

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview(showBackground = true)
fun ShadowTest() {

    Column {

        Text(
            "TEXT1",
            fontSize = 28.sp,
            modifier = Modifier
                .padding(20.dp)
                .shadow(3.dp)
                .padding(15.dp)
        )

        Text(
            "TEXT2",
            fontSize = 28.sp,
            modifier = Modifier
                .padding(20.dp)
                .shadow(4.dp, shape = CircleShape)
                .padding(20.dp)
        )
    }
}