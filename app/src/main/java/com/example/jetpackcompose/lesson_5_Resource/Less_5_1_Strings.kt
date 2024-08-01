package com.example.jetpackcompose.lesson_5_Resource

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcompose.R

@Composable
@Preview
fun StringTest(){

    val resources = LocalContext.current.resources

    val itemsLangs = resources.getStringArray(R.array.languages)

    Column {

        Text(
            text = stringResource(id = R.string.Bruh)
        )
        Text(
            text = stringResource(id = R.string.user_data, "Alyn", 69, "Bruh")
        )
        Text(
            text = resources.getQuantityString(R.plurals.Bruhs, 7, 7)
        )
        Text(
            text = resources.getQuantityString(R.plurals.Bruhs, 2, 2)
        )

        for (item in itemsLangs) {
            Text(
                text = item
            )
        }

    }
}