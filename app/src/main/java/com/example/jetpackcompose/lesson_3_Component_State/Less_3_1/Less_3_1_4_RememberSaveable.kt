package com.example.jetpackcompose.lesson_3_Component_State.Less_3_1

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

@Composable
@Preview
fun RememberSaveableTest(){
    var value by rememberSaveable{mutableStateOf("Hello METANIT.COM")}

    Text(
        text = value,
        fontSize = 28.sp,
        modifier = Modifier.clickable( onClick = { value = "Hello Work!"})
    )
}