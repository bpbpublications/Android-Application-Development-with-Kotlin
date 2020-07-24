package higherOrderFunction

/*fun perform(first: Int, second: Int, func: (Int, Int) -> Int): Int {
    return func(first, second)
}*/

fun Int.perform(other: Int, func: (Int, Int) -> Int): Int {
    return func(this, other)
}

val add = { x: Int, y: Int -> x + y }
val subtract = { x: Int, y: Int -> x - y }

/*
fun main() {
    println(perform(10, 20, { x, y -> x + y }))
    println(perform(10, 20) { x, y -> x + y })

    println(perform(10, 20, { x, y -> x - y }))
    println(perform(10, 20) { x, y -> x + y })

    println(perform(first = 10, second = 20, func = add))
    println(perform(first = 10, second = 20, func = subtract))
}*/


fun main() {
    println(10.perform(20) { x, y -> x + y })
}