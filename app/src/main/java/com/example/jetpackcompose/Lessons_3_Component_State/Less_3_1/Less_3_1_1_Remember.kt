package com.example.jetpackcompose.Lessons_3_Component_State.Less_3_1

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
@Preview
fun RememberState(){
    val message = remember{mutableStateOf("Hello METANIT.COM")}
    Text(
        text = message.value,
        fontSize = 25.sp,
        modifier = Modifier.clickable( onClick = { message.value = "Hello Work!" })
    )
}