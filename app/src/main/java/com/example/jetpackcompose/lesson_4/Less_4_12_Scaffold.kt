package com.example.jetpackcompose.lesson_4

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
@Preview
fun ScaffoldTest() {
//    ScaffoldShowCase1()
//    ScaffoldShowCase2()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldShowCase1() {
    Scaffold(
        topBar = {
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
                    IconButton({ }) { Icon(Icons.Filled.Info, contentDescription = "О приложении") }
                    IconButton({ }) { Icon(Icons.Filled.Search, contentDescription = "Поиск") }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.DarkGray,
                    titleContentColor = Color.LightGray,
                    navigationIconContentColor = Color.LightGray,
                    actionIconContentColor = Color.LightGray
                )
            )
        },
        bottomBar = {
            BottomAppBar(
                containerColor = Color.DarkGray,
                contentColor = Color.LightGray
            ) {
                IconButton(onClick = { }) {
                    Icon(
                        Icons.Filled.Favorite,
                        contentDescription = "Избранное"
                    )
                }
                Spacer(Modifier.weight(1f, true))
                IconButton(onClick = { }) {
                    Icon(
                        Icons.Filled.Info,
                        contentDescription = "Справка"
                    )
                }
            }
        }
    ) {
        Text("Bruh Bruh Bruh", fontSize = 28.sp, modifier = Modifier.padding(it))
    }
}


@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun ScaffoldShowCase2() {
    var isAdded by remember { mutableStateOf(false) }
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Bruh", fontSize = 22.sp) },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.DarkGray,
                    titleContentColor = Color.LightGray
                )
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                content = {
                    if (isAdded) Icon(Icons.Filled.Clear, contentDescription = "Удалить")
                    else Icon(Icons.Filled.Add, contentDescription = "Добавить")
                },
                onClick = { isAdded = !isAdded }
            )
        },
        floatingActionButtonPosition = FabPosition.End
    ) {
        Text(
            if (isAdded) "Товар добавлен" else "Корзина пуста",
            fontSize = 28.sp,
            modifier = Modifier.padding(it)
        )
    }
}