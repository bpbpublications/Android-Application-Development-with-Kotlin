package generics.variance

fun main() {
    // Possible
    val wasteList: List<RecycleableWaste> = mutableListOf<Tin>()

    // Not possible
    //val tinList: List<Tin> = mutableListOf<RecycleableWaste>()

    // With out it is possible because whatever you get from bin t it would be of type Tin and Tin is RecycleableWaste
    val recyleWasteBin: Bin<RecycleableWaste> = Bin<Tin>()
    recyleWasteBin.collect()

    val recycleTinBin: Bin2<Tin> = Bin2<RecycleableWaste>()
    recycleTinBin.put(Tin()) // Only adding Tin is possible
}