package collections

fun main() {
    val list = List(5) { "Item -> ${it.plus(1)}" }.also { println(it) }
    //list.add("Item 6")// Not possible, will give a compile time error

    val mutableList = MutableList(5) { "Item -> ${it.plus(1)}" }.also { println(it) }
    mutableList.add("Item 6") // Works!
}