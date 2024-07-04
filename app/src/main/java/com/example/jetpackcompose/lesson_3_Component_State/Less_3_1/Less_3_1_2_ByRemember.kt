package com.example.jetpackcompose.lesson_3_Component_State.Less_3_1

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

@Composable
@Preview
fun ByRememberStateTest() {
    var message by remember { mutableStateOf("Hello METANIT.COM") } //Но если поставить by то можно будет сразу обращаться к перемменным
    Text(
        text = message,
        fontSize = 28.sp,
        modifier = Modifier.clickable(onClick = { message = "Hello Word" })
    )
}