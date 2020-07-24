package functions

fun String.isValidEmail(): Boolean {
    return this.isNotEmpty() && this.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$".toRegex())
}

fun main() {
    println("some_email@email.com".isValidEmail()) //Returns true
    println("hello".isValidEmail()) //Returns False

    println(listOf(1,2,3,4,5).lastIndex)
}


val <T> List<T>?.lastIndex
    get() = if (this == null) throw IndexOutOfBoundsException("List is null") else this.size - 1