import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Icon
import androidx.compose.runtime.*
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp

@Composable
@Preview
fun CheckIconBox() {
    var iconCheck by remember { mutableStateOf(false) }

    Icon(
        imageVector = if (iconCheck) Icons.Filled.CheckCircle else Icons.Filled.Notifications,
        contentDescription = if (iconCheck) "Выбрано" else "Не выбрано",
        modifier = Modifier
            .size(48.dp)
            .toggleable(
                value = iconCheck,
                onValueChange = { iconCheck = it },
                role = Role.Checkbox
            )
    )
}