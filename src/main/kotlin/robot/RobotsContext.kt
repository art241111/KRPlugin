package robot

interface RobotsContext {
    fun getRobotsName(): List<String>
    fun getRobot(name: String) : Robot
    fun addRobot(name: String, ip:String, port: Int)
    fun deleteRobot(name: String)
    fun changeRobotName(oldName: String, newName: String)
}
