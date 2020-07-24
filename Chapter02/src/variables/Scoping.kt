package variables

fun main() {
    val outerNumber = 2

    val function = {
        val innerNumber = 20
        println(innerNumber)
        // outerNumber is accessible here and anywhere in the class
        println(outerNumber)
    }

    for (count in 1..10) {
        // outerNumber is accessible here and anywhere in the class
        if (count % outerNumber == 0) {
            println("$count is an even number")
        } else {
            println("$count is an odd number")
        }
    }

    //println(count)// count is not accessible outside for loop and result into compiler error
    //println(innerNumber)// innerNumber is not accessible outside for loop and result into compiler error
}