class bike: Vehicle() {

    override val numberOfWheels = 2

    override fun move(){
        a = 16
        println("Sit on the bike")
        println("Start moving")
    }
}