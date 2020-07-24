package Strings

fun main() {
    val book = "Android application development with Kotlin"
    val author = "Hardik Trivedi"

    println("The book $book is authored by $author and it's published by ${getPublisherName()}")


}

private fun getPublisherName() = "BPB Publications"