package com.example.jetpackcompose.lesson_4.Other

import android.annotation.SuppressLint
import androidx.compose.animation.core.*
import androidx.compose.foundation.gestures.awaitFirstDown
import androidx.compose.foundation.gestures.waitForUpOrCancellation
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

enum class ButtonState { Pressed, Idle }

@Composable
fun SquishyButton(
    onClick: () -> Unit,
    onLongClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    content: @Composable RowScope.() -> Unit
) {
    var buttonState by remember { mutableStateOf(ButtonState.Idle) }
    val scale by animateFloatAsState(
        targetValue = if (buttonState == ButtonState.Pressed) 0.70f else 1f,
        animationSpec = spring(dampingRatio = Spring.DampingRatioMediumBouncy)
    )

    Button(
        onClick = onClick,
        modifier = modifier
            .squishyClickable(
                enabled = enabled,
                onLongClick = onLongClick,
                onStateChange = { buttonState = it }
            )
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            },
        enabled = enabled,
        content = content
    )
}

@SuppressLint("ModifierFactoryUnreferencedReceiver")
fun Modifier.squishyClickable(
    enabled: Boolean = true,
    onLongClick: () -> Unit,
    onStateChange: (ButtonState) -> Unit
) = composed {
    val coroutineScope = rememberCoroutineScope()

    pointerInput(enabled) {
        coroutineScope {
            if (enabled) {
                while (true) {
                    awaitPointerEventScope {
                        val down = awaitFirstDown(requireUnconsumed = false)
                        onStateChange(ButtonState.Pressed)

                        val longPressJob = launch {
                            delay(1000)  // Задержка для определения долгого нажатия
                            onLongClick()
                        }

                        waitForUpOrCancellation()
                        longPressJob.cancel()
                        onStateChange(ButtonState.Idle)
                    }
                }
            }
        }
    }
}

@Composable
fun ButtonExample() {
    var clickCount by remember { mutableStateOf(0) }
    var longClickCount by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        SquishyButton(
            onClick = { clickCount++ },
            onLongClick = { longClickCount++ }
        ) {
            Text("Squishy Button")
        }

        Text("Clicks: $clickCount")
        Text("Long clicks: $longClickCount")
    }
}