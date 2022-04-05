fun main() {
    var world = "Village"
    var playerName = "Man"
    var playerAge = "15"
    var playerLives = 5
    var playerMoney = 6.2
    var isSavedGame = false
    var playerRice = "Human"

    playerLives = SavedofGame(isSavedGame, playerLives)

    playerRice(playerRice)

    number()

    playerBasic(world, playerName, playerAge, playerLives, playerMoney)
}

fun SavedofGame(
    isSavedGame: Boolean,
    playerLives: Int
): Int {
    var playerLives1 = playerLives
    if (isSavedGame) {
        println("LoadGame...")
        println("StartGame..")
        playerLives1 = 2
        if (playerLives1 > 2) {
            println("Lives is good $playerLives1")
        } else {
            println("Lives is law $playerLives1")
        }
    } else {
        println("StartNewGame")
    }
    return playerLives1
}

fun number() {
    when (20) {
        in 1..5 -> println("OK")
        in 6..10 -> println("Okay")
        else -> println("NO")
    }
}

fun playerRice(playerRice: String) {
    when (playerRice) {
        "Human" -> println("Раса игрока Людина")
        "Ork" -> println("Раса игрока Орк")
        "Demon" -> println("Раса игрока Демон")
    }
}

fun playerBasic(
    world: String,
    playerName: String,
    playerAge: String,
    playerLives: Int,
    playerMoney: Double)
{
    println("Мир: $world")
    println("Игрок: $playerName")
    println("Возраст: $playerAge")
    println("Жизни: $playerLives")
    println("Деньги: $playerMoney")
}
