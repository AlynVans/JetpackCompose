package com.example.jetpackcompose.lesson_4_VisualComponents

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview
fun ToggleableTest() {
    var checked by remember { mutableStateOf(true) }

    Column(
        modifier = Modifier
            .padding(20.dp)
    ) {
        Text(
            modifier = Modifier.toggleable(
                value = checked,    // value это первое состояние toggleable функции,
                onValueChange = {
                    checked = it    // а it это вротое состояние
                }),
            text = checked.toString(),
            fontSize = 30.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier.toggleable(  // можно прописать всем элементам, чтобы все было кликабельным
                value = checked,
                onValueChange = { checked = it })
        ) {
            Box(
                modifier = Modifier
                    .padding(10.dp)
                    .size(30.dp)
                    .background(Color.Black)
                    .padding(1.dp)
                    .background(
                        if (checked) Color.Black
                        else Color.White
                    )
                    .toggleable(  // А можно только отдельным элементам, чтобы можно было нажимать только на них
                        value = checked,
                        onValueChange = {
                            checked = it
                        })
            )
            Text(checked.toString(), fontSize = 30.sp)
        }
    }
}