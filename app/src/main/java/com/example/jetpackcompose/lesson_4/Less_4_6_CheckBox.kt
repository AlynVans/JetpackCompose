package com.example.jetpackcompose.lesson_4

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview
fun CheckBoxTest(){
    var checkState by remember{ mutableStateOf(true) }

    Column {
        Row {
            Checkbox(checked = checkState,
                onCheckedChange = { checkState = it }
            )
            Text(
                if (checkState) "Selected" else "Unselected",
                fontSize = 28.sp,
                modifier = Modifier.padding(4.dp)
            )
        }

        Row {
            var checkedIndeterminateState by remember { mutableStateOf(ToggleableState.Indeterminate) }
            var checkboxText by remember { mutableStateOf("Indeterminate") }
            TriStateCheckbox(
                state = checkedIndeterminateState,
                onClick = {
                    checkedIndeterminateState = when (checkedIndeterminateState) {
                        ToggleableState.On -> {
                            checkboxText = "Unchecked"
                            ToggleableState.Off
                        }
                        ToggleableState.Off -> {
                            checkboxText = "Indeterminate"
                            ToggleableState.Indeterminate
                        }
                        ToggleableState.Indeterminate -> {
                            checkboxText = "Checked"
                            ToggleableState.On
                        }
                    }
                }
            )
            Text( text = checkboxText, fontSize = 28.sp, modifier = Modifier.padding(4.dp))
        }
    }
}
