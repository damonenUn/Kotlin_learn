abstract class Animal(val name: String, protected val voice: String) {
    open val maxAge = 100

    init {
        println("Обєкт animal")
    }

    fun makeVoice () {
        println(voice)
    }

    open fun sleep(){
        println("$name is sleeping")
    }

    abstract fun eat ()
}