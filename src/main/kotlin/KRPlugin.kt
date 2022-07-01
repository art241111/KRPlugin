import androidx.compose.runtime.Composable
import client.ClientsContext
import file.FilesContext
import note.NoteContext
import robot.RobotsContext
import window.WindowContext

interface KRPlugin {
    @Composable
    fun content()

    fun init(
        windowContext: WindowContext,
        robotsContext: RobotsContext,
        clientsContext: ClientsContext,
        noteContext: NoteContext,
        filesContext: FilesContext,
    )
}