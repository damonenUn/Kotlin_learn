class car: Vehicle(), Moveable, StopAble{

    override val numberOfWheels = 4
    override val speed: Double = 200.0

    override fun move(){
        a++

        println("Sit in the car")
        println("Start moving")
    }

    override fun stop() {
        println("Stopping")
    }

    override fun info(){
        println("Some info")
    }

}