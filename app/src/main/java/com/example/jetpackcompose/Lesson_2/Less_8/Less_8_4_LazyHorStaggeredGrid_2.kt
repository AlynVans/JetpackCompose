package com.example.jetpackcompose.Lesson_2.Less_8

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlin.random.Random


@Composable
@Preview(showBackground = true)
fun LazyHorizontalStaggeredGridTest_2() {

    LazyHorizontalStaggeredGrid(
        rows = StaggeredGridCells.Fixed(3),
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(8.dp),
        horizontalItemSpacing = 8.dp,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ){
        items(50) {_ ->
            Box(Modifier
                .fillMaxHeight()
                .width(Random.nextInt(50, 200).dp)
                .background(Color(
                    Random.nextInt(255),
                    Random.nextInt(255),
                    Random.nextInt(255),
                    255
                ))
            )
        }
    }
}
