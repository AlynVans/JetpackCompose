package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeFeatureApp()
                }
            }
        }
    }
}

@Composable
fun ComposeFeatureApp() {
    var selectedFeatureId by remember { mutableStateOf<Int?>(null) }
    val features = remember {
        listOf(
            ComposeFeature(1, "Base", "Азы"),
            ComposeFeature(2, "Bruh", "Примеры кнопок"),
            ComposeFeature(3, "Lists", "Работа со списками"),
            ComposeFeature(4,"Bruh","Bruh")
        )
    }

    if (selectedFeatureId == null) {
        FeatureListScreen(features = features, onFeatureSelected = { featureId ->
            selectedFeatureId = featureId
        })
    } else {
        FeatureDetailScreen(
            featureId = selectedFeatureId!!,
            onBackPressed = {
                selectedFeatureId = null
            }
        )
    }
}

data class ComposeFeature(val id: Int, val name: String, val description: String)