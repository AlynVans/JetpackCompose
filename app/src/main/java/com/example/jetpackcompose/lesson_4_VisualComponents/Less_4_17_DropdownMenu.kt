package com.example.jetpackcompose.lesson_4_VisualComponents

import androidx.compose.foundation.layout.Box
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Divider
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp

@Composable
@Preview

fun DropdownMenuTest() {
    var expanded by remember { mutableStateOf(false) }
    Box {
        IconButton(onClick = { expanded = true }) {
            Icon(Icons.Default.MoreVert, contentDescription = "Показать меню")
        }
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            offset = DpOffset(x = 50.dp, y = 40.dp)
        ) {
            DropdownMenuItem(
                onClick = {},
                text = { Text("Скопировать") }
            )
            DropdownMenuItem(
                onClick = { },
                text = { Text("Вставить") }
            )
            Divider()
            DropdownMenuItem(
                onClick = { },
                text = { Text("Настройки") }
            )
        }
    }
}

/*
expanded: значение типа Boolean, которое устанавливает, будет ли меню отображаться (значение true) или будет скрыто (значение false)

onDismissRequest: представляет функцию-обработчик типа () -> Unit, которая вызывается, когда пользователь нажимает на область вне меню для его закрытия

modifier: представляет объект Modifier, который определяет модификаторы кнопки

offset: объект типа DpOffset, который определяет смещения позиции меню относительно положения по умолчанию. По умолчанию равно DpOffset(0.dp, 0.dp)

scrollState: значение типа ScrollState, которое применяется для настройки вертикальной прокрутки элементов.

properties: объект типа PopupProperties, который задает дополнительные свойства меню. По умолчанию равно PopupProperties(focusable = true)

shape: форма меню в виде объекта Shape.

containerColor: цвет контейнера.

tonalElevation: эффект анимации при нажатии на элемент меню.

shadowElevation: высота тени.

border: параметры границы в виде объекта BorderStroke.

content: содержимое меню в виде столбца компонентов. Обычно представляет набор компонентов типа DropdownMenuItem.
 */