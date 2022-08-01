package robot

interface RobotData {
    val backup: List<String>
    val robotType: String
    val serialNumber: String
    val axesCount: Int
    val uptimeController: Double
    val uptimeServo: Double
    val brakeCounter: Int
    val eStopCounter: Int
    val motorOnCounter: Int
    val motorsMoveTimes: List<Double?>
    val motorsMoveAngles: List<Double?>
}