import androidx.compose.runtime.Composable
import client.ClientsContext
import file.FilesContext
import note.NoteContext
import robot.RobotsContext
import window.WindowContext

interface KRPlugin {
    fun setWindowContext (windowContext: WindowContext) {}
    fun setRobotsContext(robotsContext: RobotsContext) {}
    fun setClientsContext(clientsContext: ClientsContext) {}
    fun setNoteContext(noteContext: NoteContext) {}
    fun setFilesContext(filesContext: FilesContext) {}

    @Composable
    fun content()


}