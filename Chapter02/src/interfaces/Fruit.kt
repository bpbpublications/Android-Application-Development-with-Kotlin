package interfaces

enum class VITAMIN {
    A, C, D, E, K, B_ONE, B_TWO, B_SIX, THIAMINE, BIOTIN
}

interface Fruit {
    val name: String

    val whoAmI: String
        get() = "Food of God"

    fun getContainedVitamin(): List<VITAMIN>

    fun showBenifits() {
        println("I am low in fat, sodium, and calories and have no cholesterol")
    }
}