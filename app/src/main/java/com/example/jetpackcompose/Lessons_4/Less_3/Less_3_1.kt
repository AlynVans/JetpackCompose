package com.example.jetpackcompose.Lessons_4.Less_3

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoyaltyScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Placeholder for the image
        Box(
            modifier = Modifier
                .height(200.dp)
                .fillMaxWidth()
                .padding(bottom = 24.dp),
            contentAlignment = Alignment.Center
        ) {

        }

        // Text "Лоялист"
        Text(
            text = "Лоялист",
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            color = Color.Black
        )

        // Subtext
        Text(
            text = "Все заведения в одном месте и под твоим контролем!",
            fontSize = 16.sp,
            color = Color.Gray,
            modifier = Modifier.padding(top = 8.dp, bottom = 24.dp)
        )

        // Authorization button
        Button(
            onClick = { /* TODO: Handle click */ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
        ) {
            Text(text = "Авторизация")
        }

        // Registration button
        Button(
            onClick = { /* TODO: Handle click */ },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Регистрация")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLoyaltyScreen() {
    LoyaltyScreen()
}
