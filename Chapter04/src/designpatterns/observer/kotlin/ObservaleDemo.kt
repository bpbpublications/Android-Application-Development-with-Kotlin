package designpatterns.observer.kotlin

import kotlin.properties.Delegates

class TextInput(valueObserver: (String, String) -> Unit) {
    var text: String by Delegates.observable("") { prop, old, new ->
        valueObserver.invoke(old, new)
    }
}

val valueObserver: (String, String) -> Unit =
    { oldText, newText -> println("Observer notified. Value changed from $oldText to $newText") }

fun main() {
    val textInput = TextInput(valueObserver)

    textInput.run {
        text = "Hello"
        text = "World"
    }
}