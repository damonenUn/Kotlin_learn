fun main () {

//    val s = "Hello world"
//
//    println(s.first())
//    println(s.last())

//    val cardNumber = "1234 5678 9876 5432"
//    println(cardNumber.startsWith("1234")) // true
//    println(cardNumber.endsWith("5431")) // false

//    val a = "Ukraine"
//    println("The lenght of \"Ukraine\" \nis ${a.length}")

//    val name = "Oleksa"

//    val newName = name.capitalize()
//    val newName = name.decapitalize()

//    val newName = name.toUpperCase()
//    val newName = name.toLowerCase()
//    println(newName)

//    val name = "\n"
//    val name1 = "    "
//    println(name.isEmpty())
//    println(name1.isBlank())

//    val name = "  Oleksa  "
//    val newName = name.trimStart()
//    val newName = name.trimEnd()
//    val newName = name.trim()
//    println(newName)

    // replace
    // split

//    val s = "Fuck friday fuck fuck"
//    val newS = s.toLowerCase().replace("fuck","****")
//    println(newS)

//    val list = "Book, Chess, pencil"
//    var ar = list.split(",")
//    println(ar)

    println("Enter your name")

    val name = readLine() // null

    if (name?.toLowerCase()?.capitalize() == "John")
        println("Access denied")
    else println("Welcome")
}
