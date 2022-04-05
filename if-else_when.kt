fun main () {
    var dayOfWeek = "Saturday"
    var age = 18
    var name = "Oleksa"

    if (age >= 75){
        println("You’re too old")
    } else if (age >= 18){
        println("Welcome")
    } else {
        println("Sorry")
    }

    if (name == "Oleksa" || name == "Ostap" && age in 18..75){
        println("You are cool")
    } else if (name == "Yura"){
        println("Oh my Goodness")
    } else {
        println("Sorry")
    }

    when (dayOfWeek){
        "Sunday" -> println("Today is sunday")
        "Monday" -> println("Today is monday")
        "Tuesday" -> println("Today is tuesday")
        "Wednesday" -> println("Today is wednesday")
        "Thursday" -> println("Today is thursday")
        "Friday" -> println("Today is friday")
        else -> println("Weekend")
    }
}
