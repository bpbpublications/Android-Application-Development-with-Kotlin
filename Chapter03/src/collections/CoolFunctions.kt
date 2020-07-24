package collections

fun main() {
    println("1234123412341234".chunked(4).joinToString("-"))
    //Prints 1234-1234-1234-1234

    val map = mapOf(
        1 to "January", 2 to "February", 3 to "March", 4 to "April", 5 to "May", 6 to "June",
        7 to "July", 8 to "August", 9 to "September", 10 to "October", 11 to "November", 12 to "December"
    )

    //Prints 7 as there are 7 more entries which has key greater than 5
    println(map.count { entry -> entry.key > 5 })


    println(listOf(10, 20, 30, 40, 50).all { it % 10 == 0 })
    println(emptyList<Int>().all { it % 10 == 0 })
}