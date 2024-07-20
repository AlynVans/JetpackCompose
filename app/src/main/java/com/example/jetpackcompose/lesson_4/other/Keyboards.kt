package com.example.jetpackcompose.lesson_4.other

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview

fun KeyboardsTest() {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {

        //TEXT
        var text by remember { mutableStateOf("") }

        TextField(
            text,
            { text = it },
            textStyle = TextStyle(fontSize = 28.sp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text
            )
        )

        Text(text, fontSize = 28.sp, modifier = Modifier.padding(10.dp))

        Spacer(modifier = Modifier.height(10.dp))

        // ASCII
        var ascii by remember { mutableStateOf("") }

        TextField(
            ascii,
            { ascii = it },
            textStyle = TextStyle(fontSize = 28.sp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Ascii
            )
        )

        Text(ascii, fontSize = 28.sp, modifier = Modifier.padding(10.dp))

        Spacer(modifier = Modifier.height(10.dp))

        // NUMBER
        var number by remember { mutableStateOf("") }

        TextField(
            number,
            { number = it },
            textStyle = TextStyle(fontSize = 28.sp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number
            )
        )

        Text(number, fontSize = 28.sp, modifier = Modifier.padding(10.dp))

        Spacer(modifier = Modifier.height(10.dp))

        // PASSWORD NUMBER
        var passnumber by remember { mutableStateOf("") }

        TextField(
            passnumber,
            { passnumber = it },
            textStyle = TextStyle(fontSize = 28.sp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.NumberPassword
            )
        )

        Text(passnumber, fontSize = 28.sp, modifier = Modifier.padding(10.dp))

        Spacer(modifier = Modifier.height(10.dp))

        // PASSWORD
        var pass by remember { mutableStateOf("") }

        TextField(
            pass,
            { pass = it },
            textStyle = TextStyle(fontSize = 28.sp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            )
        )

        Text(pass, fontSize = 28.sp, modifier = Modifier.padding(10.dp))

        Spacer(modifier = Modifier.height(10.dp))

        //PHONE
        var phone by remember { mutableStateOf("") }

        TextField(
            phone,
            { phone = it },
            textStyle = TextStyle(fontSize = 28.sp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Phone
            )
        )

        Text(phone, fontSize = 28.sp, modifier = Modifier.padding(10.dp))

        Spacer(modifier = Modifier.height(10.dp))

        // URL
        var url by remember { mutableStateOf("") }

        TextField(
            url,
            { url = it },
            textStyle = TextStyle(fontSize = 28.sp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Uri
            )
        )

        Text(url, fontSize = 28.sp, modifier = Modifier.padding(10.dp))

        Spacer(modifier = Modifier.height(10.dp))

        //MAIL
        var mail by remember { mutableStateOf("") }

        TextField(
            mail,
            { mail = it },
            textStyle = TextStyle(fontSize = 28.sp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email
            )
        )

        Text(mail, fontSize = 28.sp, modifier = Modifier.padding(10.dp))

        Spacer(modifier = Modifier.height(10.dp))


    }
}