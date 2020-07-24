package functions

fun main() {
    val map = hashMapOf(
        1 to "Sunday",
        2 to "Monday",
        3 to "Tuesday",
        4 to "Wednesday",
        5 to "Thursday",
        6 to "Friday",
        7 to "Saturday"
    )

    val pair = "Java".to("Kotlin")

    val months = hashMapOf(
        1 mapTo "Jan",
        2 mapTo "Feb",
        3 mapTo "Mar",
        4 mapTo "Apr",
        5 mapTo "May",
        6 mapTo "Jun",
        7 mapTo "Jul",
        8 mapTo "Aug",
        9 mapTo "Sep",
        10 mapTo "Oct",
        11 mapTo "Nov",
        12 mapTo "Dec"
    )
}

infix fun <K, V> K.mapTo(value: V) = Pair(this, value)