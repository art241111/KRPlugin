package note

interface NoteContext {
    fun addNote(name: String, text: String)
    fun addNote(note: Note)
    fun addTextToNote(editNoteName: String, text: String)
    fun getNotes(): Note
}
