package com.example.jetpackcompose.lesson_4_VisualComponents

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.Text
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.TextButton
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch

@Composable
@Preview
fun ModalNavigationDrawerTest() {
//    ModelNavigationDrawerShowCase1()
//    ModalNavigationDrawerShowCase2()
//    ModelNavigationDrawerShowCase3()
    ModalNavigationDrawerShowCase4()
}

@Composable
fun ModelNavigationDrawerShowCase1() {
    val drawerStateBruh = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    ModalNavigationDrawer(
        drawerState = drawerStateBruh,

        drawerContent = { Text("Menu", fontSize = 22.sp, color = Color.LightGray) },
        scrimColor = Color.DarkGray,

        content = {
            IconButton(onClick = {
                scope.launch { drawerStateBruh.open() }
            }) {
                Icon(Icons.Filled.Menu, "Меню")
            }

        }
    )
}

@Composable
fun ModalNavigationDrawerShowCase2() {
    val items = listOf("Home", "Contact", "About")
    val selectedItem = remember { mutableStateOf(items[0]) }
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            Column {
                items.forEach { item ->
                    TextButton(onClick = {
                        scope.launch { drawerState.close() }
                        selectedItem.value = item
                    },
                        colors = ButtonDefaults.buttonColors(contentColor = Color.LightGray, containerColor = Color.Transparent)) {
                        Text(item, fontSize = 22.sp)
                    }
                }
            }
        },
        scrimColor = Color.DarkGray,
        content={
            Column {
                IconButton(onClick = {
                    scope.launch {drawerState.open()}
                }, content = {
                    Icon(Icons.Filled.Menu, "Меню")
                })
                Text(selectedItem.value, fontSize = 28.sp)
            }
        }
    )
}

@Composable
fun ModelNavigationDrawerShowCase3() {
    val items = listOf("Home", "Contact", "About")
    var selectedItem by remember { mutableStateOf(items[0]) }
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet{
                items.forEach { item ->
                    TextButton(
                        onClick = {
                            scope.launch { drawerState.close() }
                            selectedItem = item
                        },
                    ) { Text(item, fontSize = 22.sp) }
                }
            }
        },
        content={
            Row{
                IconButton(onClick = {scope.launch {drawerState.open()}},
                    content = { Icon(Icons.Filled.Menu, "Меню") }
                )
                Text(selectedItem, fontSize = 28.sp)
            }
        }
    )
}

@Composable
fun ModalNavigationDrawerShowCase4(){
    val items = listOf("Home", "Contact", "About")
    val selectedItem = remember { mutableStateOf(items[0]) }
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet(
                drawerContainerColor = Color.DarkGray,
                drawerContentColor =  Color.LightGray
            ) {
                items.forEach { item ->
                    NavigationDrawerItem(
                        label= { Text(item, fontSize = 22.sp) },
                        selected = selectedItem.value==item,
                        onClick = {
                            scope.launch { drawerState.close() }
                            selectedItem.value = item
                        },
                        colors = NavigationDrawerItemDefaults.colors(
                            selectedContainerColor = Color.Transparent,
                            unselectedContainerColor = Color.Transparent,
                            selectedTextColor = Color.White,
                            unselectedTextColor = Color.LightGray
                        )
                    )
                }
            }
        },
        content={
            Row{
                IconButton(onClick = {scope.launch {drawerState.open()}},
                    content = { Icon(Icons.Filled.Menu, "Меню") }
                )
                Text(selectedItem.value, fontSize = 28.sp)
            }
        }
    )
}