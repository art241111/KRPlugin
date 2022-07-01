package client

import kotlinx.coroutines.flow.StateFlow
import robot.Robot

interface ClientsContext {
    fun getClientsName(): List<String>
    fun getClient(name: String) : Client
    fun addClient(name: String, ip:String, port: Int)
    fun deleteClient(name: String)
    fun changeClientName(oldName: String, newName: String)
}
