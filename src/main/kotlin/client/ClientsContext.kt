package client

import kotlinx.coroutines.flow.StateFlow

interface ClientsContext {
    fun getClientsName(): StateFlow<List<String>>
    fun getClient(name: String) : Client
    fun addClient(onAddClient: () -> Unit = {})
    fun deleteClient(name: String)
    fun changeClientName(oldName: String, newName: String)
}
