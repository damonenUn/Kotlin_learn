class train: Moveable, StopAble{
    override val speed: Double = 300.0

    override fun stop(){
        println("I am stopping")
    }

    override fun move () {
        println("Start moving2")
    }
}