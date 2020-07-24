package generics.whyGenerics

fun main() {

    println("===== TOY =====")
    val toyBin = ToyBin()
    toyBin.put(Toy())
    toyBin.put(Toy())

    println(toyBin.take(1))

    println("===== Candle =====")
    val candleBin = CandleBin()
    candleBin.put(Candle())
    candleBin.put(Candle())

    println(candleBin.take(0))


    println("===== Generic Bin =====")
    val genericToyBin = Bin<Toy>()
    val genericCupBin = Bin<Cup>()
    val genericMedicineBin =
        Bin<Medicine>()

    genericToyBin.put(Toy())
    //genericCupBin.put(Cup()) // You can't add Toy in Cup bin.
    genericMedicineBin.put(Medicine())

    println(genericToyBin.take(0))
    println(genericMedicineBin.take(0))
}