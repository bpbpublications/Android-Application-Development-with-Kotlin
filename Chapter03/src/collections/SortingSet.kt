package collections

import java.util.*

fun main() {
    val set = setOf(
        1 to "Sunday", 7 to "Saturday", 5 to "Thursday", 3 to "Tuesday",
        4 to "Wednesday", 2 to "Monday", 6 to "Friday"
    )

    println(set.sortedBy { pair -> pair.first })
    println(set.toSortedSet(compareBy({ it.second }, { it.first })))
}
/** Prints
[(1, Sunday), (2, Monday), (3, Tuesday), (4, Wednesday), (5, Thursday), (6, Friday), (7, Saturday)]
[(6, Friday), (2, Monday), (7, Saturday), (1, Sunday), (5, Thursday), (3, Tuesday), (4, Wednesday)]
*/