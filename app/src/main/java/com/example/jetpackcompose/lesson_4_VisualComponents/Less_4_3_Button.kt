package com.example.jetpackcompose.lesson_4_VisualComponents

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview
fun ButtonTest() {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
    ) {
        Button(
            onClick = {},
            modifier = Modifier.padding(10.dp),
        )
        {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("Самая", fontSize = 18.sp)
                Text("странная и бесполезная", fontSize = 18.sp)
                Text("кнопка", fontSize = 18.sp)
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        var bruh by remember { mutableStateOf("40") }
        Button(
            onClick = { bruh = "Bruh" },
            modifier = Modifier.padding(10.dp),
        ) {
            Text(bruh, fontSize = 28.sp)
        }

        Button(

            onClick = {},
            shape = CircleShape,     // прямоугольная кнопка
            modifier = Modifier.padding(10.dp)
        ) { Text("Button 1", fontSize = 28.sp) }

        Button(
            onClick = {},
            shape = RoundedCornerShape(15.dp),  // округлая кнопка
            modifier = Modifier.padding(10.dp)
        ) { Text("Button 2", fontSize = 28.sp) }

        Button(
            onClick = {},
            shape = CutCornerShape(8.dp),     // прямоугольная кнопка
            modifier = Modifier.padding(10.dp)
        ) { Text("Button 1", fontSize = 28.sp) }

        Button(
            onClick = {},
            shape = RoundedCornerShape(topStart = 16.dp, bottomEnd = 16.dp),
            modifier = Modifier.padding(10.dp)
        ) { Text("Button 1", fontSize = 28.sp) }

        Button(
            onClick = {},
            modifier = Modifier.padding(10.dp),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 2.dp,
                pressedElevation = 12.dp,
                hoveredElevation = 8.dp,
                focusedElevation = 6.dp
            )
        ) {
            Text("Кнопка с заметной elevation", fontSize = 18.sp)
        }

        var isElevated by remember { mutableStateOf(false) }
        Button(
            onClick = { isElevated = !isElevated },
            modifier = Modifier.padding(10.dp),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = if (isElevated) 8.dp else 2.dp
            )
        ) {
            Text(if (isElevated) "Высокая кнопка" else "Обычная кнопка")
        }
        Button(
            onClick = { /* действие */ },
            modifier = Modifier.padding(10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue,
                contentColor = Color.White,
                disabledContainerColor = Color.Gray,
                disabledContentColor = Color.LightGray
            )
        ) {
            Text("Кнопка")
        }
        Button(
            onClick = {},
            modifier = Modifier.padding(10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.LightGray,
                contentColor = Color.Black
            ),
            border = BorderStroke(3.dp, Color.DarkGray)
        ) { Text("Click", fontSize = 28.sp)
        }

        OutlinedButton(
            onClick = { /* действие при нажатии */ },
            modifier = Modifier
                .padding(10.dp)
        ) {
            Text("Outlined Button")
        }

        OutlinedButton(
            onClick = { /* действие */ },
            modifier = Modifier.padding(10.dp),
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = Color.Blue,
            ),
            border = BorderStroke(2.dp, Color.Blue)
        ) {
            Text("Custom Outlined Button")
        }
        Row {
            Button(onClick = { /* основное действие */ },
                modifier = Modifier
                    .padding(10.dp)
            ) {
                Text("Сохранить")
            }
            OutlinedButton(onClick = { /* второстепенное действие */ },
                modifier = Modifier
                    .padding(10.dp)
            ) {
                Text("Отменить")
            }
        }
        TextButton( onClick = {},
            modifier = Modifier
                .padding(10.dp),
        ){
            Text("Hello", fontSize = 28.sp)
        }
    }
}