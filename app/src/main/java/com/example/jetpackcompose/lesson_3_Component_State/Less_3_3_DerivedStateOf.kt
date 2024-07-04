package com.example.jetpackcompose.lesson_3_Component_State

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview
fun DerivedStateOfTest() { // автоматически обновляемое значение, зависящее от других состояний.
    val counter = remember { mutableStateOf(0) }
    val double = remember { derivedStateOf { counter.value * 2 } } // предотвращает избыточные перерасчеты и перекомпозиции в Compose.
    Column {
        Text(
            "Counter: ${counter.value}",
            Modifier.padding(8.dp).clickable { counter.value++ },
            fontSize = 28.sp
        )
        Text("Double: ${double.value}", Modifier.padding(8.dp), fontSize = 28.sp)
    }
}