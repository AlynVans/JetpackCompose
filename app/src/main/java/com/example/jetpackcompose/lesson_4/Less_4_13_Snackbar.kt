import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch


@Composable
@Preview
fun SnackbarTest() {
//    ButtonWithSnackbar()
//    SnackbarHostStateTest()
//    SnackbarActionLabel()
//    CustomSnackbar()
    FullCustomSnackbar()
}






@Composable
fun ButtonWithSnackbar() {
    val snackbarHostState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()

    Scaffold(
        snackbarHost = { SnackbarHost(hostState = snackbarHostState) }
    ) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            Button(
                onClick = {
                    scope.launch {
                        snackbarHostState.showSnackbar("Это сообщение в Snackbar!")
                    }
                },
                modifier = Modifier.padding(16.dp)
            ) {
                Text("Показать Snackbar")
            }
        }
    }
}

@Composable
fun SnackbarHostStateTest(){
    val snackbarHostState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()
    val count = remember{ mutableStateOf(0) }
    Scaffold(
        snackbarHost = { SnackbarHost(snackbarHostState) },
        floatingActionButton = {
            FloatingActionButton(
                content = {Icon(Icons.Filled.Add, contentDescription = "Добавить")},
                onClick = {
                    scope.launch {
                        snackbarHostState.showSnackbar("Count: ${++count.value}")
                    }
                }
            )
        }
    ){
        Text("Count: ${count.value}", fontSize = 28.sp, modifier=Modifier.padding(it))
    }
}

@Composable
@Preview
fun SnackbarActionLabel(){
    val snackbarHostState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()
    val count = remember{ mutableStateOf(0) }
    Scaffold(
        snackbarHost = { SnackbarHost(snackbarHostState) },
        floatingActionButton = {
            FloatingActionButton(
                content = {Icon(Icons.Filled.Add, contentDescription = "Добавить")},
                onClick = {
                    scope.launch {
                        val result = snackbarHostState.showSnackbar(
                            "Текущее значение: ${count.value}",
                            actionLabel = "Подтвердить",
                            withDismissAction = true,
                            duration = SnackbarDuration.Short)
                        when (result) {
                            SnackbarResult.ActionPerformed -> { count.value++; }
                            SnackbarResult.Dismissed -> { snackbarHostState.showSnackbar("Действие отменено")}
                        }
                    }
                }
            )
        }
    ){
        Text("Count: ${count.value}", fontSize = 28.sp, modifier=Modifier.padding(it))
    }
}

@Composable
fun CustomSnackbar(){
    val snackbarHostState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()
    val count = remember{ mutableStateOf(0) }
    Scaffold(
        snackbarHost = {
            SnackbarHost(snackbarHostState){ data ->
                Snackbar(
                    snackbarData = data,
                    containerColor = Color.Green,
                    contentColor = Color.Blue,
                    actionOnNewLine =  true,
                    actionColor = Color.Yellow
                )
            }
        }
    ){
        Button(
            {
                scope.launch {
                    val result = snackbarHostState.showSnackbar("Count: ${count.value}", "Add", true)
                    if(result==SnackbarResult.ActionPerformed) count.value++
                }
            },
            Modifier.padding(it)
        ){ Text("Click", fontSize = 28.sp) }
    }
}

@Composable
fun FullCustomSnackbar(){
    val snackbarHostState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()
    val count = remember{ mutableStateOf(0) }
    Scaffold(
        snackbarHost = {
            SnackbarHost(snackbarHostState){ data ->
                Snackbar(
                    modifier = Modifier.padding(10.dp),
                    containerColor = Color.DarkGray,
                    contentColor = Color.LightGray,
                    action = {
                        TextButton(onClick={ data.performAction() }){
                            Text("OK", fontSize=22.sp, color=Color.LightGray)
                        }
                    },
                    dismissAction = {
                        TextButton(onClick={ data.dismiss() }){
                            Text("Отмена", fontSize=22.sp, color=Color.LightGray)
                        }
                    }
                ){ Text("Clicks: ${count.value}", fontSize=28.sp) }
            }
        }
    ){
        Button(
            {
                scope.launch {
                    val result = snackbarHostState.showSnackbar("")
                    if(result==SnackbarResult.ActionPerformed) count.value++
                }
            },
            Modifier.padding(it)
        ){ Text("Click", fontSize = 28.sp) }
    }
}