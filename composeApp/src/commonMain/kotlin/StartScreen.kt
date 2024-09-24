import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.*


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun StartScreen(title: String, onClick: () -> Unit,){

    val list by remember { mutableStateOf(mutableListOf("Text #1", "Text #2")) }
    Scaffold(topBar = {
        TopAppBar(title = { Text("Compose App") })
    }) {
        Row {
            LazyColumn {
                items(list) {
                    ListItem {
                        Text(text = it)
                    }
                }
                item {
                    Column {
                        Text(text = title)
                        Button(onClick = {
                            list.add("Text #3")
                            onClick()
                        }) {
                            Text("Click me")
                        }
                    }
                }
            }

        }

    }

}