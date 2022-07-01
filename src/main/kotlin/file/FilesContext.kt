package file

interface FilesContext {
    fun saveFile(fileName: String, text: String)
    fun loadFile(fileName: String): String
}
