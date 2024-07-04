package com.example.jetpackcompose.lesson_2.Less_13

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalFoundationApi::class)
@Composable
@Preview(showBackground = true)
fun StickyHeaderTest() {
    val phones = listOf(
        "Akbarjon BruhPhone 69 Pro Ultra Max",
        "Apple iPhone 15 Pro",
        "Realme 11 PRO",
        "Google Pixel 5",
        "Samsung Galaxy S24 Ultra",
        "Google Pixel 6",
        "Samsung Galaxy S21 FE",
        "Apple iPhone 14",
        "Apple iPhone 13",
        "Apple iPhone 12",
        "Samsung Galaxy S22",
        "Samsung Galaxy S22 Ultra",
        "Samsung Galaxy S23",
        "Samsung Galaxy S23 Ultra",
        "Apple iPhone 15 Pro Max",
        "Xiaomi Redmi Note 12",
        "Xiaomi Redmi 12",
        "Apple iPhone 13",
        "Google Pixel 6",
        "Apple iPhone 14",
        "Realme C30s",
        "Realme Note 50",
        "Xiaomi Redmi Note 10",
        "Xiaomi Redmi Note 10 Pro",
        "Xiaomi Redmi Note 10S",
        "Xiaomi Redmi Note 11",
        "Xiaomi Redmi Note 11 Pro"
    )

    val groups = phones.groupBy { it.substringBefore(" ") }

    LazyColumn(
        contentPadding = PaddingValues(5.dp)
    ) {
        groups.forEach { (brand, models) ->
            stickyHeader {
                Text(
                    text = brand,
                    fontSize = 28.sp,
                    color = Color.White,
                    modifier = Modifier
                        .background(Color.Gray)
                        .padding(5.dp)
                        .fillMaxWidth()
                )
            }
            items(models) { model ->
                Text(
                    text = model,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(horizontal = 5.dp, vertical = 2.dp)
                )
            }
        }
    }
}
