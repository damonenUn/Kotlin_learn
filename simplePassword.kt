fun main() {
    var person: String
    var counter = 0

    while (true) {
        person = readLine()!!.toString()
        if (person != "Oleksa") {
            println("Fuck you leaser man")
            counter++
            if (counter == 5){
                break
            }
        } else {
            println("Наш батько вчив нас не соромитися наш хуїв")
            break
        }
    }
}
