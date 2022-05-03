class BerlinCoffeeShop (americanoPrice: Double, cappuccinoPrice: Double, lattePrice: Double):
    CoffeeShop(americanoPrice, cappuccinoPrice, lattePrice) {


    override fun makeAmericano() {
        americanoCount++
        println("Thank you for your order americano in Berlin")
    }

    override fun makeCappuccino() {
        cappuccinoCount++
        println("Thank you for your order Cappuccino in Berlin")
    }

    override fun makeLatte() {
        latteCount++
        println("Thank you for your order Latte in Berlin")
    }
}