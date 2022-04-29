fun main () {
    val user1 = user ("123456", "Rondiak", 35)
    val user2 = user ("123456", "Rondiak", 35)

    println(user1)
    println(user2)

//    println(user1 == user2)
//    println(user1.equals(user2))

//    println(user1.toString())
//    user@3b9a45b3 (address from kucha)

    println(user1.hashCode())
    println(user2.hashCode())

//    for (i in 0..5000000000) {
//        val a = user("123456", "Rondiak", 30)
//    }
}