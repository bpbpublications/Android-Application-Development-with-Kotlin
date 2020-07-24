package designpatterns.singleton.kotlin

object Database {
    // Your properties
    var name = "Database"

    init {
        println("Creating database")
    }

    // Your function
    fun registerDataUpdateListener(listener: DataUpdateListener) {

    }
}

interface DataUpdateListener

fun main() {
    println(Database.name)
    println(Database.name)
}