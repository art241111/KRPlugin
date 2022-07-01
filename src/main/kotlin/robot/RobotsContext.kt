package robot

interface RobotsContext {
    fun getRobotsName(): StateFlow<List<String>>
    fun getRobot(name: String) : Robot
    fun addRobot(onAddRobot: () -> Unit = {})
    fun deleteRobot(name: String)
    fun changeRobotName(oldName: String, newName: String)
}
