fun main() {
    var person: String
    var counter = 0

    while (true) {
        person = readLine()!!.toString()
        if (person != "Oleksa") {
            println("Enter")
            counter++
            if (counter == 5){
                break
            }
        } else {
            println("Wrong")
            break
        }
    }
}
