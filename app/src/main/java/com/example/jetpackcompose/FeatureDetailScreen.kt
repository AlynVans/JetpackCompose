package com.example.jetpackcompose

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.jetpackcompose.lesson_1.BorderShapeTest
import com.example.jetpackcompose.lesson_1.ClickCounter
import com.example.jetpackcompose.lesson_1.ClipTest
import com.example.jetpackcompose.lesson_1.CustomModifiersPreview
import com.example.jetpackcompose.lesson_1.ScreenElementTest
import com.example.jetpackcompose.lesson_1.ShadowTest
import com.example.jetpackcompose.lesson_1.TextScrollTest

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FeatureDetailScreen(featureId: Int, onBackPressed: () -> Unit) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Функция $featureId") },
                navigationIcon = {
                    IconButton(onClick = onBackPressed) {
                        Icon(Icons.Filled.ArrowBack, contentDescription = "Назад")
                    }
                }
            )
        }
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            when (featureId) {
                1 -> ScreenElementTest()
                2 -> TextScrollTest()
                3 -> BorderShapeTest()
                4 -> ClipTest()
                5 -> ShadowTest()
                6 -> ClickCounter()
                7 -> CustomModifiersPreview()

                // Здесь будут добавлены другие функции по мере их создания
                else -> Text("Функция $featureId еще не реализована")
            }
        }
    }
}
