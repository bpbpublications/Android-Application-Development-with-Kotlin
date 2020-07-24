package variables

fun main() {
    val simpleString = "Android application development with Kotlin"
    val withNewLine = "\n\n\nA ready reckoner for your next Kotlin based Android application."
    val multiLine = """This book will help you to
        |build your Android application using Kotlin
        |as a programming language""".trimMargin()

    val multiLine1 = """This book will help you to
        build your Android application using Kotlin
        as a programming language"""

    println(simpleString)
    println(withNewLine)
    println(multiLine.length)
    println(multiLine1.length)
}