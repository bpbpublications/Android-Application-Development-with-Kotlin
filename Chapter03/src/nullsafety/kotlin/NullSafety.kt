package nullsafety.kotlin

import nullsafety.Recipe

fun main() {
    val data: String? = null // OK and can be null because it's marked with ?
    println(getCountForCharacter("Harahahadik", 'a'))

    /*var str: String = ""
    var str: String? = null


    var num: Int = 10
    var num: Int? = null

    var recipe: Recipe = Recipe("Burrito", listOf("Corn tortilla", "Cooked Rice", "Beans"))
    var recipe: Recipe? = null*/
}

fun getCountForCharacter(data: String?, characterToSearch: Char): Int {
    return data?.filter { it == characterToSearch }?.count() ?: 0
}

fun getLength(data: String?): Int {
    return data?.length ?: 0
}

fun some(data: String?, map: HashMap<Int, String>?) {
    data?.length // Gives you length if data is not null

    //data?.filter { } // execute filter function if data is not null

    data?.let { } // execute let function if data is not null. Similarly use apply, run, also etc.

    map?.get(0) // Try to get the data for the key from HashMap if Map is not null
}


