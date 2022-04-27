class dog (name: String,voice: String): Animal(name, voice) {
    override val maxAge = 20

    init {
        println("Об'єкт Dog")
    }

    override fun sleep(){
        super.sleep()
        println("$name is sleeping outside the house")
    }

    override fun eat(){
        println("$name is eating")
    }

    fun info () {
        println("Dog maxAge is $maxAge")
        println("Animal maxAge is" + super.maxAge)
    }
}