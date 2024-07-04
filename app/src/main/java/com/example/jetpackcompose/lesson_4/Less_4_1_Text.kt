package com.example.jetpackcompose.lesson_4

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.text.style.TextGeometricTransform
import androidx.compose.ui.text.style.TextIndent
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp

@Composable
@Preview
fun TextTest() {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            "Hello Jetpack Cumpose - 1",
            fontSize = 25.sp,
        )
        Text(
            "Hello Jetpack Cumpose - 2",
            fontSize = 6.em,
        )
        Text(
            "Hello Jetpack Cumpose - 3",
            fontSize = 25.sp,
            color = Color.Red,
        )
        Text(
            "Hello Jetpack Cumpose - 4",
            fontSize = 25.sp,
            color = Color(red = 0x44, green = 0x55, blue = 0x88, alpha = 0xFF)
        )
        Text(
            "Hello Jetpack Cumpose - 5",
            fontSize = 25.sp,
            color = Color.Red,
            fontStyle = FontStyle.Normal,
        )
        Text(
            "Hello Jetpack Cumpose - 6",
            fontSize = 25.sp,
            color = Color.Red,
            fontStyle = FontStyle.Italic,
        )
        Text(
            "Hello Jetpack Cumpose - 7",
            fontSize = 25.sp,
            color = Color.Red,
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Bold,
        )
        Text(
            "Hello Jetpack Cumpose - 7",
            fontSize = 25.sp,
            color = Color.Red,
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.W700,
        )
        Text(
            "Hello Jetpack Cumpose - 8",
            fontSize = 25.sp,
            color = Color.Red,
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight(700),
        )
        Text(
            "Hello Jetpack Cumpose - 9",
            fontSize = 25.sp,
            color = Color.Red,
            fontFamily = FontFamily.Default,
        )
        Text(
            "Hello Jetpack Cumpose - 10",
            fontSize = 25.sp,
            color = Color.Red,
            fontFamily = FontFamily.Monospace,
        )
        Text(
            "Hello Jetpack Cumpose - 11",
            fontSize = 25.sp,
            color = Color.Red,
            fontFamily = FontFamily.Serif,
        )
        Text(
            "Hello Jetpack Cumpose - 12",
            fontSize = 25.sp,
            color = Color.Red,
            fontFamily = FontFamily.SansSerif,
        )
        Text(
            "Hello Jetpack Cumpose - 13",
            fontSize = 25.sp,
            color = Color.Red,
            fontFamily = FontFamily.Cursive,
        )
        Text(
            "Hello Jetpack Cumpose - 14",
            fontSize = 25.sp,
            color = Color.Red,
            letterSpacing = 6.9.sp,
        )
        Text(
            "Hello Jetpack Cumpose - 15",
            fontSize = 25.sp,
            color = Color.Red,
            letterSpacing = 1.1.em,
        )
        Text(
            "Hello Jetpack Cumpose - 16",
            fontSize = 25.sp,
            color = Color.Red,
            textDecoration = TextDecoration.None
        )
        Text(
            "Hello Jetpack Cumpose - 17",
            fontSize = 25.sp,
            color = Color.Red,
            textDecoration = TextDecoration.LineThrough,
        )
        Text(
            "Hello Jetpack Cumpose - 18",
            fontSize = 25.sp,
            color = Color.Red,
            textDecoration = TextDecoration.Underline,
        )
        Text(
            "Hello Jetpack Cumpose - 19",
            modifier = Modifier.fillMaxWidth(1f),
            fontSize = 25.sp,
            color = Color.Red,
            textAlign = TextAlign.Center
        )
        Text(
            "Hello Jetpack Cumpose - 20",
            modifier = Modifier.fillMaxWidth(3f),
            fontSize = 25.sp,
            color = Color.Red,
            textAlign = TextAlign.Justify
        )
        Text(
            "Hello Jetpack Cumpose - 21",
            modifier = Modifier.fillMaxWidth(1f),
            fontSize = 25.sp,
            color = Color.Red,
            textAlign = TextAlign.Left
        )
        Text(
            "Hello Jetpack Cumpose - 22",
            modifier = Modifier.fillMaxWidth(1f),
            fontSize = 25.sp,
            color = Color.Red,
            textAlign = TextAlign.Right
        )
        Text(
            "Hello Jetpack Cumpose - 23",
            modifier = Modifier.fillMaxWidth(1f),
            fontSize = 25.sp,
            color = Color.Red,
            textAlign = TextAlign.Start
        )
        Text(
            "Hello Jetpack Cumpose - 24",
            modifier = Modifier.fillMaxWidth(1f),
            fontSize = 25.sp,
            color = Color.Red,
            textAlign = TextAlign.End
        )
        Text(
            "Hello Jetpack Cumpose - 25 1234567890",
            fontSize = 25.sp,
            color = Color.Red,
            overflow = TextOverflow.Clip,
            softWrap = false,
        )
        Text(
            "Hello Jetpack Cumpose - 26 1234567890",
            fontSize = 25.sp,
            color = Color.Red,
            overflow = TextOverflow.Ellipsis,
            softWrap = false,
        )
        Text(
            "Hello Jetpack Cumpose - 27 1234567890",
            fontSize = 25.sp,
            color = Color.Red,
            overflow = TextOverflow.Visible,
            softWrap = false,
        )
        Text(
            "Hello Jetpack Cumpose - 28",
            fontSize = 25.sp,
            color = Color.Red,
            style = TextStyle(textGeometricTransform = TextGeometricTransform(2.5f, -1.5f))
        )
        Text(
            "Hello Jetpack Cumpose - 29",
            fontSize = 25.sp,
            color = Color.Red,
            style = TextStyle(shadow = Shadow(Color.Blue, Offset(25.0f, 25.0f), 7.0f))
        )
        Text(
            text = "Hello Jetpack Compose - 30",
            fontSize = 25.sp,
            color = Color.Red,
            style = TextStyle(textDirection = TextDirection.Ltr)
        )
        Text(
            text = "Наконец-то я закончил работу над этим файлом, я не думал что такая простая тема займёт у меня целый день, в основном это потому что я ленивый ну и ограничения ClaudeAi",
            fontSize = 25.sp,
            color = Color.Red,
            style = TextStyle(textIndent = TextIndent(50.sp, 25.sp))
        )
    }
}