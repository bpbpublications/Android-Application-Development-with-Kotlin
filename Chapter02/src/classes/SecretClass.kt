package classes

class SecretClass private constructor(val secretWord: String) {
    companion object {
        fun newInstance(secretWord: String) = SecretClass(secretWord)

    }
}

fun main() {
    // Gives compile time error
    //val obj = SecretClass("Kotlin")
    val secretObj = SecretClass.newInstance("Kotlin")
    println(secretObj.secretWord)
}