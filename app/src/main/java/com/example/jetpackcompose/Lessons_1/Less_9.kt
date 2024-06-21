package com.example.jetpackcompose.Lessons_1

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
@Preview(showBackground = true)
fun ClickTest() {
    val count = remember { mutableStateOf(0) }

    Text(
        "Clicks: ${count.value}",
        fontSize = 28.sp,
        modifier = Modifier
            .clickable(onClick = { count.value += 1 })
    )
}