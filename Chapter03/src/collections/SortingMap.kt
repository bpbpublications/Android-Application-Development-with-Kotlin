package collections

fun main() {
    val map = mapOf(
        1 to "January", 12 to "December", 3 to "March", 4 to "April", 10 to "October", 6 to "June",
        2 to "February", 8 to "August", 7 to "July", 9 to "September", 5 to "May", 11 to "November"
    )
    // By default it will sort using keys and returns instance of TreeMap
    println(map.toSortedMap())
    println(map.toSortedMap(compareBy { map[it]?.length }))
}
/** Prints
{1=January, 2=February, 3=March, 4=April, 5=May, 6=June, 7=July, 8=August, 9=September, 10=October, 11=November, 12=December}
{5=May, 6=July, 3=April, 8=August, 1=October, 12=November, 9=September}
 */