package com.example.jetpackcompose.lesson_4

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
fun TopAppBarTest() {

    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {
        TopAppBar(
            title = { Text("Bruh", fontSize = 22.sp) },
            navigationIcon = {
                IconButton({ }) {
                    Icon(
                        Icons.Filled.Menu,
                        contentDescription = "Меню"
                    )
                }
            },
            actions = {
                IconButton({}) { Icon(Icons.Filled.Lock, contentDescription = "Bruh") }
                IconButton({ }) { Icon(Icons.Filled.Info, contentDescription = "О приложении") }
                IconButton({ }) { Icon(Icons.Filled.Search, contentDescription = "Поиск") }
                IconButton({}) { Icon(Icons.Filled.Lock, contentDescription = "Bruh") }
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.DarkGray,
                scrolledContainerColor = Color.Yellow,
                titleContentColor = Color.Green,
                navigationIconContentColor = Color.Red,
                actionIconContentColor = Color.Blue,
            )
        )
        BottomAppBar (
            containerColor = Color.DarkGray,
            contentColor = Color.Blue,
        ){
            IconButton(onClick = { }) {
                Icon(Icons.Filled.Menu, contentDescription = "Меню")
            }
            Spacer(Modifier.weight(1f))
            IconButton(onClick = { }) {
                Icon(Icons.Filled.Info, contentDescription = "О приложении")
            }
            IconButton(onClick = { }) {
                Icon(Icons.Filled.Search, contentDescription = "Поиск")
            }
        }
    }
}