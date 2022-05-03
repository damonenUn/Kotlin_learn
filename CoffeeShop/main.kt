import kotlin.system.exitProcess

fun main () {

    val kievCoffeeShop = KievCoffeeShop(3.0, 5.0, 2.50)
    val berlinCoffeeShop = BerlinCoffeeShop(9.0, 2.0, 6.50)
    var currentCoffeeShop: CoffeeShop

    while (true) {
        println("Hi, choose your city ;)")
        println("1.Kiev\n2.Berlin\n\n0.Exit...")

        currentCoffeeShop = when (readLine()) {
            "1" -> kievCoffeeShop
            "2" -> kievCoffeeShop
            "0" -> break
            else -> {
                println("error")
                continue
            }
        }
        chooseDrikn(currentCoffeeShop)
    }
}

private fun chooseDrikn(currentCoffeeShop: CoffeeShop) {
    println("Choose your drink")
    println("1.Americano\n2.Cappuccino\n3.Latte\n\n0.Show Statistics")

    when (readLine()) {
        "1" -> {
            currentCoffeeShop.makeAmericano()
            askForBiscuits(currentCoffeeShop)
        }
        "2" -> {
            currentCoffeeShop.makeCappuccino()
            askForBiscuits(currentCoffeeShop)
        }
        "3" -> {
            currentCoffeeShop.makeLatte()
            askForBiscuits(currentCoffeeShop)
        }
        "0" -> currentCoffeeShop.showStatistics()
        else -> {
            println("error")
            exitProcess(1)
        }
    }
}

private fun askForBiscuits (currentCoffeeShop: CoffeeShop){
    if (currentCoffeeShop is Biscuits){
        println("Would you like to buy biscuits?")
        println("1.yes\n2.No")

        val isBiscuits = readLine()
        if (isBiscuits == "1")
            currentCoffeeShop.sellBiscuits()
    }
}






