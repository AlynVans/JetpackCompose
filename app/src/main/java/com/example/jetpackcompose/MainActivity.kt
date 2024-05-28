package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.jetpackcompose.Lessons_1.ScreenElementExperiment
import com.example.jetpackcompose.Lessons_2_1_12.TestText4


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScreenElementExperiment()
        }
    }
}

