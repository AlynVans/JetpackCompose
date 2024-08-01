package com.example.jetpackcompose.lesson_4_VisualComponents.other

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
@Preview
fun CheckBoxTest() {
    var checkState by remember { mutableStateOf(true) }

    Column {
        Checkbox(
            checked = checkState,
            onCheckedChange = { checkState = it },
            colors = CheckboxDefaults.colors(
                checkedColor = Color.Red,
                uncheckedColor = Color.Green,
                checkmarkColor = Color.Blue,
            )
        )

        Spacer(modifier = Modifier.height(10.dp))

        Checkbox(
            checked = checkState,
            onCheckedChange = { checkState = it },
            enabled = false,
            colors = CheckboxDefaults.colors(
                disabledCheckedColor = Color.DarkGray,
                disabledUncheckedColor = Color.Cyan,
                disabledIndeterminateColor = Color.Yellow
            )
        )
    }
}