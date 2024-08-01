package com.example.jetpackcompose.lesson_4_VisualComponents

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview
fun TextFieldTest() {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .padding(10.dp)

    ) {
        TextField(
            value = "Hello Мир", onValueChange = { /* Здесь логика обработки изменений */ }
        )

        Spacer(modifier = Modifier.height(16.dp))

        var message by remember { mutableStateOf("") }

        Column {
            TextField(
                value = message,
                textStyle = TextStyle(fontSize = 25.sp),
                onValueChange = { bruhText -> message = bruhText } // Здесь можно написать любое название
            )
            Text(message, fontSize = 28.sp, modifier = Modifier.padding(10.dp))
        }

        Spacer(modifier = Modifier.height(16.dp))

        var phone by remember{mutableStateOf("")}

        TextField(
            phone,
            {phone = it},
            textStyle = TextStyle(fontSize =  28.sp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)
        )

        Text(phone, fontSize = 28.sp, modifier = Modifier.padding(10.dp))

        Spacer(modifier = Modifier.height(16.dp))

        var messages by remember{mutableStateOf("")}

        TextField(
            messages,
            {messages = it},
            textStyle = TextStyle(fontSize =  28.sp),
            leadingIcon = { Icon(Icons.Filled.Check, contentDescription = "Проверено") },
            trailingIcon = { Icon(Icons.Filled.Info, contentDescription = "Дополнительная информация") }
        )

        Spacer(modifier = Modifier.height(16.dp))

        var test by remember{mutableStateOf("")}

        TextField(
            test,
            {test = it},
            textStyle = TextStyle(fontSize =  28.sp),
            placeholder = {
                Text(
                    "Hello Work!",
                    style = TextStyle(color = Color.Gray, fontStyle = FontStyle.Italic, fontSize = 28.sp)
                )

            }
        )

        TextField(
            value = message,
            onValueChange = { message = it },
            textStyle = TextStyle(fontSize = 28.sp),
            placeholder = {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = null,
                        tint = Color.Gray
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        "Поиск...",
                        style = TextStyle(color = Color.Gray, fontStyle = FontStyle.Italic)
                    )
                }
            }
        )

    }
}