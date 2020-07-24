package higherOrderFunction

fun main() {
    currencyConverter(1_00_000F, gbp, usd, dirham, thaiBaht)
}

val gbp: (amount: Float) -> Float = { it * 0.010F }
val usd: (amount: Float) -> Float = { it * 0.014F }
val dirham: (amount: Float) -> Float = { it * 0.050F }
val thaiBaht: (amount: Float) -> Float = { it * 0.42F }

inline fun currencyConverter(
    baseAmountInr: Float, gbp: (Float) -> Float, usd: (Float) -> Float,
    noinline dirham: (Float) -> Float,noinline thaiBaht: (Float) -> Float
) {
    println("$baseAmountInr INR = ${gbp(baseAmountInr)} GBP")
    println("$baseAmountInr INR = ${usd(baseAmountInr)} USD")
    println("$baseAmountInr INR = ${dirham(baseAmountInr)} AED")
    println("$baseAmountInr INR = ${thaiBaht(baseAmountInr)} THB")
}