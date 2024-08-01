import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview
fun PinCodeApp() {
    var pin by remember { mutableStateOf("") }
    var isError by remember { mutableStateOf(false) }
    var message by remember { mutableStateOf("") }
    val correctPin = "1234" // Пример правильного ПИН-кода

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        PinDisplay(pin, isError)
        Text(
            text = message,
            color = if (isError) Color.Red else Color.Green,
            modifier = Modifier.padding(16.dp)
        )
        Keypad(
            onKeyPress = { digit ->
                if (pin.length < 4) {
                    pin += digit
                    isError = false
                    message = ""
                }
                if (pin.length == 4) {
                    if (pin == correctPin) {
                        message = "ПИН-код верный!"
                        isError = false
                    } else {
                        message = "Неверный ПИН-код. Попробуйте снова."
                        isError = true
                        pin = ""
                    }
                }
            },
            onDelete = {
                if (pin.isNotEmpty()) {
                    pin = pin.dropLast(1)
                    isError = false
                    message = ""
                }
            }
        )
    }
}

@Composable
fun PinDisplay(pin: String, isError: Boolean) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        repeat(4) { index ->
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .background(
                        when {
                            isError -> Color.Red
                            index < pin.length -> Color.Black
                            else -> Color.LightGray
                        },
                        CircleShape
                    )
            )
        }
    }
}

@Composable
fun Keypad(onKeyPress: (String) -> Unit, onDelete: () -> Unit) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        for (row in 0..2) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                for (col in 1..3) {
                    val number = row * 3 + col
                    KeypadButton(number.toString(), onClick = { onKeyPress(number.toString()) })
                }
            }
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            KeypadButton("", onClick = {})
            KeypadButton("0", onClick = { onKeyPress("0") })
            KeypadButton("⌫", onClick = onDelete)
        }
    }
}

@Composable
fun KeypadButton(text: String, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = Modifier.size(80.dp),
        shape = CircleShape
    ) {
        Text(
            text = text,
            fontSize = 24.sp,
            textAlign = TextAlign.Center
        )
    }
}