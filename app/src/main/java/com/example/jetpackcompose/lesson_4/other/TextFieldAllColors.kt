package com.example.jetpackcompose.lesson_4.other

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/*
focusedTextColor: цвет, используемый для ввода текста этого текстового поля при фокусировке.

unfocusedTextColor: цвет, используемый для ввода текста этого текстового поля, когда он не сфокусирован

disabledTextColor: цвет, используемый для ввода текста этого текстового поля, когда он отключен.

errorTextColor: цвет, используемый для ввода текста этого текстового поля в состоянии ошибки.

focusedContainerColor: цвет контейнера текстового поля в фокусе.

unfocusedContainerColor: цвет контейнера текстового поля, когда он не сфокусирован.

disabledContainerColor: цвет контейнера текстового поля, когда он отключен.

errorContainerColor: цвет контейнера текстового поля в состоянии ошибки.

cursorColor: цвет курсора текстового поля

errorCursorColor: цвет курсора текстового поля в состоянии ошибки.

selectionColors: цвета, используемые при выборе входного текста этого текстового поля.

focusedIndicatorColor: цвет индикатора текстового поля при фокусировке.

unfocusedIndicatorColor: цвет индикатора текстового поля, когда оно не сфокусировано.

disabledIndicatorColor: цвет индикатора текстового поля, когда он отключен.

errorIndicatorColor: цвет индикатора текстового поля в состоянии ошибки.

focusedLeadingIconColor: цвет ведущего значка текстового поля в фокусе.

unfocusedLeadingIconColor: цвет ведущего значка текстового поля, когда он не сфокусирован.

disabledLeadingIconColor: цвет ведущего значка текстового поля, когда он отключен.

errorLeadingIconColor: цвет ведущего значка текстового поля в состоянии ошибки.

focusedTrailingIconColor: цвет конечного значка текстового поля в фокусе.

unfocusedTrailingIconColor: цвет конечного значка текстового поля, когда он не в фокусе.

disabledTrailingIconColor: цвет конечного значка текстового поля, когда он отключен.

errorTrailingIconColor: цвет конечного значка текстового поля в состоянии ошибки.

focusedLabelColor: цвет метки текстового поля при фокусировке.

unfocusedLabelColor: цвет метки текстового поля, когда оно не сфокусировано.

disabledLabelColor: цвет метки текстового поля, когда он отключен.

errorLabelColor: цвет метки текстового поля в состоянии ошибки.

focusedPlaceholderColor: цвет заполнителя текстового поля в фокусе.

unfocusedPlaceholderColor: цвет заполнителя текстового поля, когда он не сфокусирован.

disabledPlaceholderColor: цвет заполнителя текстового поля, когда он отключен.

errorPlaceholderColor: цвет заполнителя текстового поля в состоянии ошибки.

focusedSupportingTextColor: вспомогательный цвет текста текстового поля при фокусе.

unfocusedSupportingTextColor: вспомогательный цвет текста текстового поля, когда он не сфокусирован

disabledSupportingTextColor: вспомогательный цвет текста текстового поля, когда он отключен.

errorSupportingTextColor: вспомогательный цвет текста текстового поля в состоянии ошибки.

focusedPrefixColor: цвет префикса текстового поля в фокусе.

unfocusedPrefixColor: цвет префикса текстового поля, когда оно не сфокусировано.

disabledPrefixColor: цвет префикса текстового поля, когда он отключен.

errorPrefixColor: цвет префикса текстового поля в состоянии ошибки.

focusedSuffixColor: цвет суффикса текстового поля в фокусе.

unfocusedSuffixColor: цвет суффикса текстового поля, когда оно не сфокусировано.

disabledSuffixColor: цвет суффикса текстового поля, когда он отключен.

errorSuffixColor: цвет суффикса текстового поля в состоянии ошибки.
 */

@Composable
@Preview
fun TextFieldColorsTest() {

    Column {

        var message by remember { mutableStateOf("Hello") }
        TextField(
            message,
            { message = it },
            textStyle = TextStyle(fontSize = 28.sp),
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color(0xffeeeeee),
                unfocusedTextColor = Color(0xff888888),
                focusedContainerColor = Color.White,
                focusedTextColor = Color(0xff222222),
            )
        )

        Spacer(modifier = Modifier.height(15.dp))

        var messages by remember { mutableStateOf("Hello") }
        OutlinedTextField(
            messages,
            { messages = it },
            textStyle = TextStyle(fontSize = 30.sp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xff16a085), // цвет при получении фокуса
                unfocusedBorderColor = Color(0xffcccccc)  // цвет при отсутствии фокуса
            )
        )

    }
}