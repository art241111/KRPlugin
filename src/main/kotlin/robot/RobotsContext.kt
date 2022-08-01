package robot

interface RobotsContext {
    /**
     * Checks whether such a robot exists in the database and whether it is connected.
     *
     * @return null - If the robot is not connected or there is no database.
     * @return robot - If there is a robot under the knees in the database.
     * This method should be used in init if the plugin can be reloaded regardless of the platform.
     */
    fun isConnected(ip: String, port: Int): Robot?

    /**
     * Connects to the robot via a specific ip and port.
     **/
    fun connect(ip: String, port: Int): Robot

    /**
     * Opens an additional window that will be responsible for selecting the connection option.
     **/
    fun connect(): Robot

    fun disconnect(ip: String, port: Int, endMessage: String = "")
    fun disconnect()
}
