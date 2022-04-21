fun main () {
    var picture = painting()

    var picture1 = painting()

    println(picture.paintings)
    println(picture1.paintings)

    picture1.paintings = 4
    picture1.leigth = 9
    picture1.weight = 12

    picture.paint()

}
