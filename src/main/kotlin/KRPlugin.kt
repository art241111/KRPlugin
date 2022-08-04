import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.ImageBitmap
import client.ClientsContext
import file.FilesContext
import note.NoteContext
import org.jetbrains.skia.Bitmap
import parameters.ParametersContext
import robot.RobotsContext
import window.WindowContext

interface KRPlugin {
    fun setWindowContext(windowContext: WindowContext) {}
    fun setRobotsContext(robotsContext: RobotsContext) {}
    fun setClientsContext(clientsContext: ClientsContext) {}
    fun setNoteContext(noteContext: NoteContext) {}
    fun setFilesContext(filesContext: FilesContext) {}
    fun setParameterContext(parametersContext: ParametersContext) {}

    @Composable
    fun content()

    fun getPluginImage(): ImageBitmap? = null
}