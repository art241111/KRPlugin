package parameters

interface ParametersContext {
    fun load(name: String)
    fun save(name: String, content: String)
}