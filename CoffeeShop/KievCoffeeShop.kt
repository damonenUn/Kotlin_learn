class KievCoffeeShop ( americanoPrice: Double,  cappuccinoPrice: Double, lattePrice: Double):
    CoffeeShop(americanoPrice, cappuccinoPrice, lattePrice), Biscuits {


    override fun makeAmericano() {
        americanoCount++
        println("Thank you for your order americano in Kiev")
    }

    override fun makeCappuccino() {
        cappuccinoCount++
        println("Thank you for your order Cappuccino in Kiev")
    }

    override fun makeLatte() {
        latteCount++
        println("Thank you for your order Latte in Kiev")
    }

    override fun sellBiscuits() {
        println("Talke your biscuits")
    }
}