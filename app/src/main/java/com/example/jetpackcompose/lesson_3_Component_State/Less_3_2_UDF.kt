package com.example.jetpackcompose.lesson_3_Component_State

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

@Composable
@Preview
fun UDFTest() { // Unidirectional Data Flow
    Counter()
}

@Composable
fun Counter() {
    var clicks by rememberSaveable { mutableStateOf(0) }

    Column {
        Text(text = "Clicks: $clicks", fontSize = 28.sp)
        Increment(clicks) { newValue ->
            clicks = newValue
        }
    }
}

@Composable
fun Increment(clicks: Int, onClicksChange: (Int) -> Unit) {
    Text(
        text = "+",
        fontSize = 36.sp,
        modifier = Modifier
            .clickable { onClicksChange(clicks + 1) }
            .border(1.dp, Color.Red)
            .padding(10.dp, 0.dp)
    )
}