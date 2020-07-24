package generics.variance

interface RecycleableWaste

class Tin : RecycleableWaste
class Plastic : RecycleableWaste

class Bin<out T> {
    private val items = mutableListOf<T>()
    // put function will give compilation error.
    /*fun put(litter: T) {

    }*/
    fun collect(): T? {
        return items.lastOrNull()
    }
}

class Bin2<in T> {
    private val items = mutableListOf<T>()
    fun put(litter: T) {
        items.add(litter)
    }

    // collect function will give compilation error.
    /*fun collect(): T? {
        return items.lastOrNull()
    }*/
}

interface LitterBin<in T> {
    fun put(litter: T)
}

interface BinCollector<out T> {
    fun collect(): T?
    fun collectAll(): List<T?>
}

class DumpingYard<T> : LitterBin<T>, BinCollector<T> {
    private val items = mutableListOf<T>()
    override fun put(litter: T) {
        items.add(litter)
    }

    override fun collect(): T? {
        return items.lastOrNull()
    }

    override fun collectAll(): List<T?> {
        return items
    }
}