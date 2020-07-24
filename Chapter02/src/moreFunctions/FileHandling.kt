package moreFunctions

import java.io.File

fun main() {
    val fileName = "Kotlin.txt"

    //Writes the file with give text
    File(fileName)
        .writeText("This is sample text to demonstrate file handling")

    //Appends the data in file with give text
    File(fileName)
        .appendText("File opened in append mode and data will be written further")

    //Read the entire file returns the data as list of String which represents each line in file
    val fileDataAsList = File(fileName).readLines()
    println(fileDataAsList)

    //Read the entire file returns the data as complete text as a String
    val text = File(fileName).readText()
    println(text)

    //Read the entire file using buffered reader returns the data as complete text as a String
    val textFromStream = File(fileName)
        .inputStream()
        .bufferedReader()
        .use { it.readText() }

}