package client

import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow

interface Client {
    val ip: String
    val port: Int

    val dataHandler: SharedFlow<String>
    val isConnect: StateFlow<Boolean>

    fun send(message: String)
//    fun send(command: KCommand)
//    suspend fun sendWithRequest(message:String): String
//    suspend fun sendWithRequest(command: Command): String
}
