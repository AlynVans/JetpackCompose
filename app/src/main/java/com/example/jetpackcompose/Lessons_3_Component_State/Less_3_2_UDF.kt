package com.example.jetpackcompose.Lessons_3_Component_State

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

@Composable
@Preview
fun UDFTest() { // Unidirectional Data Flow
    Counter()
}

@Composable
fun Counter() {
    val clicksState = rememberSaveable { mutableStateOf(0) }
    val onClicksChange = { value: Int ->
        clicksState.value = value
    }
    Column {
        Text(text = "Clicks: ${clicksState.value}", fontSize = 28.sp)
        Increment(clicksState.value, onClicksChange)
    }
}

@Composable
fun Increment(clicks: Int, onClicksChange: (Int) -> Unit) {
    Text(
        text = "+",
        fontSize = 36.sp,
        modifier = Modifier
            .clickable(onClick = { onClicksChange(clicks + 1) })
            .border(1.dp, Color.DarkGray)
            .padding(10.dp, 0.dp)
    )
}