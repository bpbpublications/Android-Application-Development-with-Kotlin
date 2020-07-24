package generics.whyGenerics

class Toy
class Candle
class Cup
class Medicine

class ToyBin() {
    private val space = mutableListOf<Toy>()

    fun put(item: Toy) {
        space.add(item)
    }

    fun take(position: Int): Toy? {
        return space[position]
    }
}

class CandleBin() {
    private val space = mutableListOf<Candle>()

    fun put(item: Candle) {
        space.add(item)
    }

    fun take(position: Int): Candle? {
        return space[position]
    }
}

class Bin<ITEM>() {
    private val space = mutableListOf<ITEM>()

    fun put(item: ITEM) {
        space.add(item)
    }

    fun take(position: Int): ITEM? {
        return space[position]
    }
}
