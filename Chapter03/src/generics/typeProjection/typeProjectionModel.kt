package generics.typeProjection

class RecipeBook<T> {
    private val items = mutableListOf<T>()

    fun put(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> = items
}