package com.example.jetpackcompose.lesson_4

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
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
fun SwitchTest(){
    var checkedState by remember { mutableStateOf(false) }
    var textColor by remember { mutableStateOf(Color.Unspecified) }
    Column {

        Switch(
            checked = checkedState,
            onCheckedChange = { checkedState = it }
        )
        
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                "Цвет Purple40",
                fontSize = 22.sp,
                color = textColor,
                modifier = Modifier.padding(8.dp, 0.dp)
            )
            Switch(
                checked = checkedState,
                onCheckedChange = {
                    checkedState = it
                    if (checkedState) textColor = Color(0xFF6650a4)
                    else textColor = Color.Unspecified
                },
                colors = SwitchDefaults.colors(
                    checkedThumbColor = Color(0xFFC62828),
                    checkedTrackColor = Color(0xFFE57373),
                    uncheckedThumbColor = Color(0xFFEF9A9A),
                    uncheckedTrackColor = Color(0xFFFFEBEE)
                )
            )
        }
    }
}

/*
checkedThumbColor: цвет бегунка в отмеченном состоянии

checkedTrackColor: цвет переключателя в отмеченном состоянии

checkedBorderColor: цвет границы переключателя при отмеченном состоянии

uncheckedThumbColor: цвет бегунка в неотмеченном состоянии

uncheckedTrackColor: цвет переключателя в неотмеченном состоянии

uncheckedBorderColor: цвет границы переключателя при неотмеченном состоянии

disabledCheckedTrackColor: цвет переключателя в отмеченном состоянии, когда он недоступен для взаимодействия

disabledUncheckedTrackColor: цвет переключателя в неотмеченном состоянии, когда он недоступен для взаимодействия

disabledCheckedThumbColor: цвет бегунка в отмеченном состоянии, когда переключатель недоступен для взаимодействия

disabledUncheckedThumbColor: цвет бегунка в неотмеченном состоянии, когда переключатель недоступен для взаимодействия
 */