package generics.variance

fun main() {
    // Plastic bin collector can not collect from Tin bin
    // But RecyclerBinCollector can collect from Tin Bin

    // Creating a dumping yard with some random waste in it.
    val recycleBin = DumpingYard<RecycleableWaste>().apply {
        put(Plastic())
        put(Tin())
    }.also {
        println("Inside recycleBin")
        println(it.collectAll())
    }

    //val tinBin:BinCollector<Tin> = recycleBin Not possible because you might get instances of plastic

    val tinBin = DumpingYard<Tin>().apply {
        put(Tin())
        put(Tin())
    }

    //Possible
    //val tinBinCollector: BinCollector<Tin> = tinBin
    val tinBinCollector: BinCollector<RecycleableWaste> = tinBin
    println("Inside Tin Bin")
    println(tinBinCollector.collectAll())

    // Possible because Plastic is RecycleableWaste
    val plasticBin: LitterBin<Plastic> = recycleBin
    plasticBin.put(Plastic())
    plasticBin.put(Plastic())
}