package collections

fun main() {
    val languages = listOf(
        "Java",
        "C++",
        "C#",
        "COBOL",
        "Python"
    )

    val newLanguages = listOf("Kotlin", "Go")
    val trendingLanguages = newLanguages + "Dart"
    println(trendingLanguages) // Prints [Kotlin, Go, Dart]

    val awesomeLanguages = languages + newLanguages
    println(awesomeLanguages) // Prints [Java, C++, C#, COBOL, Python, Kotlin, Go]

    val boringLanguages = awesomeLanguages - newLanguages - listOf("Java", "C++", "C#", "Python")
    println(boringLanguages) // Prints [COBOL]
}