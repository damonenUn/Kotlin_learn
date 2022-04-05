fun main(){

    var a = 7
    var b = 5
    var result = summa(a,b)
    println(result)

    var work: String = Oleg(10, 7 )
    println(work)

    Ostap(10, 10 )

}

fun summa (param1: Int, param2: Int): Int{
    return param1 + param2
}

fun Ostap (money:Int, time:Int) {
    println("Do a job")
    println("Buy a book")
    println("Have a meeting")
    println("$money and $time")
}
fun Oleg (money:Int, time:Int):String {
    println("Read a book")
    println("Make an exercise")
    println("Have a speech")
    println("$money and $time")
    return "The work is done/ I win"
}
