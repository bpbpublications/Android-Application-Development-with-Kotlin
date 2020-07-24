package delegatedProperty

import java.io.File
import kotlin.reflect.KProperty

fun main() {
    var fileData by FileStorageProperty("file.txt",WriteMode.APPEND)
    println(fileData)
    fileData = "This is a new file content" // We want this data to go into file
    println(fileData) // fileData should return value from file.

    fileData = "This is a updated new file content" // We want this data to go into file

    println(fileData) // fileData should return value from file.
}

enum class WriteMode {
    STANDARD, APPEND
}

class FileStorageProperty(private val fileName: String, private val mode: WriteMode = WriteMode.STANDARD) {
    init {
        with(File(fileName))
        {
            if (!exists()) {
                createNewFile()
            }
        }
    }

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return File(fileName).bufferedReader().use { it.readText() }
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        when (mode) {
            WriteMode.APPEND -> {
                File(fileName).appendText(value)
            }
            else -> {
                File(fileName).writeText(value)
            }
        }
    }
}