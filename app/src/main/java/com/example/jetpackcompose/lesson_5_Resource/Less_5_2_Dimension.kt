package com.example.jetpackcompose.lesson_5_Resource

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcompose.R

@Composable
@Preview
fun DimensionTest(){

    Box(
        Modifier.width(dimensionResource(R.dimen.width))
            .height(dimensionResource(R.dimen.height))
            .padding(dimensionResource(R.dimen.padding))
            .background(Color.DarkGray)
    )
}