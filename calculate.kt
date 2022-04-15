fun main () {
    println("Hi my dear!")

    while(true){
        println("Print the first number")

        val first = readLine()?.toDoubleOrNull()

        println("Print the second number")

        val second = readLine()?.toDoubleOrNull()

        println("Print your operator (+, -, /, *")

        val operator = readLine()


        if (first == null || second == null || operator.isNullOrEmpty()) {
            println("Wrong combination")
        }else {
            val result = calculate (first, second, operator)
            println("Result is $result")
        }
    }
}

fun calculate (fir: Double, sec: Double, op: String):Double {
    var res = 0.0
    when (op) {
        "+" -> res = fir + sec
        "-" -> res = fir - sec
        "/" -> res = fir / sec
        "*" -> res = fir * sec
    }
    return res
}
