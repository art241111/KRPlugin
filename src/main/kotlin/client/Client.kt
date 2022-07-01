package client

import kotlinx.coroutines.flow.StateFlow

interface Client {
    val dataHandler: StateFlow<String>
    val isConnect: StateFlow<Boolean>

    fun send(message: String)
    suspend fun sendWithRequest(message:String): String

    fun connect()
    fun disconnect()
}
