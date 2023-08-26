import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.bimabagaskhoro.moviekmp.MovieApp

fun main() {
    application {
        Window(
            title = "Movie App Kmp",
            onCloseRequest = ::exitApplication
        ) {
            MovieApp()
        }
    }
}