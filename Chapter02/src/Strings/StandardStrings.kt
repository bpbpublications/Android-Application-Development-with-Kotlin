package Strings

fun main() {
    val book = "Android application development with Kotlin"

    // Returns the last index of String and -1 is it's empty
    println(book.lastIndex)

    //Returns the range of indices, starts with 0
    println(book.indices)

    /* Easiest way to get the subsequence. Given position is inclusive and throws
    StringIndexOutOfBoundsException if any of the range value doesn't match */
    println(book.subSequence(3..15))


    /**
     * Returns the sub string before the first occurrence of given character or String.
     * Output : An
     */
    println(book.substringBefore("d"))

    /**
     * Returns the sub string before the last occurrence of given character or String.
     * Output : Android application
     */
    println(book.substringBeforeLast("d"))

    /**
     * Returns the sub string after the first occurrence of given character or String.
     * Output : roid application development with Kotlin
     */
    println(book.substringAfter("d"))


    /**
     * Returns the sub string after the last occurrence of given character or String.
     * Output : evelopment with Kotlin
     */
    println(book.substringAfterLast("d"))


    /**
     * The input given to function as [delimiter] is case sensitive. It also has additional
     * parameter [missingDelimiterValue] which returns the given String back as a result if the
     * [delimiter] is not found within the String. [missingDelimiterValue] is a default
     * arguments which defaults to original String if parameter value is not passed
     *
     * Output: Value not found
     */
    println(book.substringBefore(delimiter = "D", missingDelimiterValue = "Value not found"))

    //Convert any String to regular expression
    println("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$".toRegex())

    //Easily matches your input against given regular expression in just one line
    println("hello@email.com".matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$".toRegex()))

    /**
     * Splits the give String using the delimiter and occurences you have provided.
     */
    println("A ,, string, , ,  full,  of, comma".split(",", limit = 5))

    /**
     * Allows you to specify multiple delimiters as well
     */
    println("A ,, string. , .  full, . of, comma and dots".split(delimiters = *arrayOf(",", "."), limit = 5))


}