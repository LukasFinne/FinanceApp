import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import kotlinx.coroutines.launch
import se.finne.finance.ClientServer

@Composable
fun App() {

    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }
        var responseStatus by remember { mutableStateOf("") }
        val scope = rememberCoroutineScope()
        StartScreen(responseStatus) {
            scope.launch {
                val response = ClientServer().greet()
                responseStatus = response
            }

        }

    }
}