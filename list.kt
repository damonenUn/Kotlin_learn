import kotlin.system.exitProcess

fun main () {
    println("Enter your names or names of your colleagues using comma (,) as separator ")
    val names = readLine().orEmpty()
    val namesArray = names.split(",")

    println("Enter your salaries or salaries of your colleagues using comma (,) as separator")
    val salaries = readLine().orEmpty()
    val salariesArray = salaries.split(",")

    validateLength(namesArray, 10, "Name")
    validateLength(salariesArray, 6, "Salary")

    printTable(namesArray, salariesArray)

    if (namesArray.size != salariesArray.size)
        println("Names list must be the same as salaries size")
        exitProcess(0)
}

/*
    1st - 14
    2nt - 9   23

  -----------------------------------------------------------------------------
  |     Oleksa     |                        4500                              |
  |     Oleh       |                        5000                              |
  |     Yura       |                        6000                              |
  -----------------------------------------------------------------------------

 */

fun validateLength(namesArray: List<String>, maxSize:Int, entity: String) {
    for(name in namesArray){
        if (name.length > maxSize) {
            println("$entity must be up to $maxSize characters")
            exitProcess(0 )
        }
    }
}

fun printTable(namesArray: List<String>, salariesArray: List<String>) {
    println("-".repeat(23))

    for(name in namesArray){
        val index = namesArray.indexOf(name)
        val salary = salariesArray[index]
        val f1 = (12 - name.length) / 2
        val f2 = 12 - name.length - f1
        val s1 = (8 - salary.length) / 2
        val s2 = 8 - salary.length - s1

//        println("|" + " ".repeat(f1) + name + " ".repeat(f2) + "|" + " ".repeat(s1) + salary + " ".repeat(s2) + "|")

        print("|")
        print(" ".repeat(f1))
        print(name)
        print(" ".repeat(f2))
        print("|")
        print(" ".repeat(s1))
        print(salary)
        print(" ".repeat(s2))
        println("|")

    }
    println("-".repeat(23))
}
