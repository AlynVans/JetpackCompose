package com.example.jetpackcompose.lesson_4

import androidx.compose.foundation.BorderStroke
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview
fun AlertDialogTest() {
    val openDialog = remember { mutableStateOf(false) }
    val buttonColors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray, contentColor = Color.LightGray)
    Button({ openDialog.value = true }, colors = buttonColors) {
        Text("Удалить", fontSize = 22.sp)
    }
    if (openDialog.value) {
        AlertDialog(
            onDismissRequest = { openDialog.value = false},
            title = { Text(text = "Подтверждение действия") },
            text = { Text("Вы действительно хотите удалить выбранный элемент?") },
            confirmButton = {
                Button({ openDialog.value = false }, colors = buttonColors, border = BorderStroke(1.dp, Color.LightGray)) {
                    Text("Удалить", fontSize = 22.sp)
                }
            },
            dismissButton = {
                Button(
                    onClick = { openDialog.value = false }, colors = buttonColors, border = BorderStroke(1.dp, Color.LightGray)) {
                    Text("Отмена", fontSize = 22.sp)
                }
            },
            containerColor = Color.DarkGray,
            titleContentColor = Color.LightGray,
            textContentColor = Color.LightGray,
            iconContentColor = Color.LightGray
        )
    }
}

/*
onDismissRequest: представляет функцию типа () -> Unit, которая выполняется, когда пользователь пытается закрыть диалоговое окно, нажав на область вне окна или на кнопку Назад.

confirmButton: представляет функцию типа () -> Unit, в которой устанавливается кнопка подтверждения действия.

modifier: объект типа Modifier, который задает модификаторы компонента

dismissButton: представляет функцию типа () -> Unit, в которой устанавливается кнопка отмены действия.

icon: иконка, которая отображается над заголовков или текстом

title: устанавливает заголовок диалогового окна

text: устанавливает текст диалогового окна

shape: устанавливает форму диалогового окна в виде объекта Shape

containerColor: устанавливает фоновый цвет окна

iconContentColor: устанавливает цвет для иконки

titleContentColor: устанавливает цвет заголовка окна

textContentColor: устанавливает цвет текста окна

tonalElevation: устанавливает эффект анимации

properties: дополнительные свойства для настройки окна, которые представляют объект DialogProperties
 */