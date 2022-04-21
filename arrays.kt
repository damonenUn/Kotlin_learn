fun main () {
    var list: Array<Int> = arrayOf(11, 12, 13, 14, 15)
    var names: Array<String> = arrayOf("Oleksa", "Oleh", "Yura")
    var names1 = arrayOf(true, false)

//    println(list.get(0))
//    println(list[0])
//    println(list[2])

//    println(names.get(2))
//    println(names[0])
//    println(names[2])

//    names[0] = "Petro"
//    println(names[0])
//    list[2] = 18
//    println(list[2])

//    names.set(0, "Petro")
//    println(names[0])

//    println(list.size)
//    println(names.size)

//    for (i in names){
//        println(i)
//    }

//    names.forEach { i ->
//        if (i == "Oleksa") print("Hello,")
//        println(i) }

//    list.forEach { i ->
//        if (i < 15 ) println("That number is less than 15")
//        else println("That number is greater or equal to 15")
//    }

    names.forEachIndexed { index, element ->
        println("$element has index $index")
    }

}
