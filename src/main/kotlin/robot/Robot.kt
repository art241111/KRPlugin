package robot

interface Robot {
    val dataHandler: StateFlow<String>
    val isConnect: StateFlow<Boolean>

    fun send(message: String)
//    fun send(command: KCommand)
    suspend fun sendWithRequest(message:String): String
//    suspend fun sendWithRequest(command: Command): String

    fun connect()
    fun disconnect()
}
