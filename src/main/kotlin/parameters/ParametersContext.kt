package parameters

interface ParametersContext {
    fun load(name: String): String
    fun save(name: String, content: String)
}