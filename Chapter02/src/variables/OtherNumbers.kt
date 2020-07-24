package variables

val hexBytes = 0xF_42_40
val bytes = 0b1111_01000010_01000000

fun main() {
    println("Hexadecimal to decimal ${hexBytes.dec()}")
    println("Bytes to decimal ${bytes.dec()}")
}