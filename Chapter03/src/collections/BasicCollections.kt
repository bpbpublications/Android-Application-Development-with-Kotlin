package collections

fun main() {
    val immutableLanguages = listOf("Java", "C++", "C#", "COBOL", "Python")
    // Add is not available here
    //immutableLanguages.add("")
    immutableLanguages.toMutableList()// Returns mutable list as a new instance

    val mutableLanguages = mutableListOf("Java", "C++", "C#", "COBOL", "Python")
    mutableLanguages.add("Go") // You can modify this list
}