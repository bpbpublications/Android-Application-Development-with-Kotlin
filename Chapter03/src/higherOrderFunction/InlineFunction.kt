package higherOrderFunction

import kotlin.time.ExperimentalTime
import kotlin.time.measureTime

@ExperimentalTime
fun main() {
    val bots = listOf(
        "Optimus Prime", "Ratchet", "Fallen", "Bumblebee", "Megatron", "Starscream", "Ironhide",
        "Barricade", "Demolisher", "Bonecrusher", "Sentinel Prime"
    )
    val cepticons = listOf("Optimus Prime", "Roadbuster", "Ratchet", "Bumblebee", "Ironhide", "Sentinel Prime")

    val timeTakenWithoutInline = measureTime {
        println(bots.filterCepticons {
            cepticons.contains(it)
        })
    }

    val timeTakenWithInline = measureTime {
        println(bots.inlinedFilterCepticons {
            cepticons.contains(it)
        })
    }

    println(timeTakenWithoutInline.inNanoseconds)
    println(timeTakenWithInline.inNanoseconds)
}

private fun List<String>.filterCepticons(predicate: (String) -> Boolean): List<String> {
    val filteredList = mutableListOf<String>()
    for (item in this) {
        if (predicate(item)) {
            filteredList.add(item)
        }
    }
    return filteredList
}

private inline fun List<String>.inlinedFilterCepticons(predicate: (String) -> Boolean): List<String> {
    val filteredList = mutableListOf<String>()
    for (item in this) {
        if (predicate(item)) {
            filteredList.add(item)
        }
    }
    return filteredList
}