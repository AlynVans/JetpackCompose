package com.example.jetpackcompose.lesson_2.Less_8

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlin.random.Random

@Composable
@Preview(showBackground = true)
fun LazyVerticalStaggeredGridTest_2() {

LazyVerticalStaggeredGrid(
columns = StaggeredGridCells.Fixed(3),  // 3 столбца
modifier = Modifier.fillMaxSize(),
contentPadding = PaddingValues(8.dp),
horizontalArrangement = Arrangement.spacedBy(8.dp),
verticalItemSpacing = 8.dp
) {
    items(50) { _ ->
        Box(
            Modifier
                .fillMaxWidth()
                .height(Random.nextInt(50, 200).dp)
                .background(
                    Color(
                        Random.nextInt(255),
                        Random.nextInt(255),
                        Random.nextInt(255),
                        255
                    )
                )
        )
    }
}
}
