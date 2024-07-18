package com.example.jetpackcompose

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FeatureListScreen(features: List<ComposeFeature>, onFeatureSelected: (Int) -> Unit) {
    LazyColumn {
        items(features) { feature ->
            FeatureListItem(feature = feature, onClick = { onFeatureSelected(feature.id) })
        }
    }
}

@Composable
fun FeatureListItem(feature: ComposeFeature, onClick: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(16.dp)
    ) {
        Text(text = feature.name, style = MaterialTheme.typography.headlineSmall)
        Text(text = feature.description, style = MaterialTheme.typography.bodyMedium)
    }
    Divider()
}
