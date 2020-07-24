package ExceptionHandling

import java.lang.ArithmeticException
import java.time.LocalDate
import java.util.*
import java.io.IOException
import java.io.FileNotFoundException
import com.sun.xml.internal.ws.streaming.XMLStreamReaderUtil.close
import jdk.nashorn.internal.runtime.ScriptingFunctions.readLine
import java.io.BufferedReader
import java.io.FileReader
import java.lang.StringBuilder


fun main() {
    try {
        val dob = GregorianCalendar(2019, 3, 11).time
        println(dob.age)
        println(isEligibleToVote(dob.age))
    } catch (e: Exception) {
        println(e.localizedMessage)
    }

    val result = try {
        10 / 0
    } catch (e: ArithmeticException) {
        null
    }
}

fun isEligibleToVote(age: Int): Boolean =
    if (age >= 18) true else throw IllegalArgumentException("Age can not be less than 18")

val Date.age: Int
    get() {
        val calendar = Calendar.getInstance()
        calendar.time = Date(time - Date().time)
        val age = 1970 - (calendar.get(Calendar.YEAR) + 1)
        return if (age > 1) age else throw Exception("Either you are just born or birth date is future dated")

    }


fun readFile(fileName: String): String? {
    return try {
        val fileReader = FileReader(fileName)

        val bufferedReader = BufferedReader(fileReader)
        var line: String? = null
        val string = StringBuilder()
        while ({ line = bufferedReader.readLine(); line }() != null) {
            string.append(line)
        }
        bufferedReader.close()
        string.toString()
    } catch (ex: FileNotFoundException) {
        null
    } catch (ex: IOException) {
        null
    }
}

fun readFiles(fileName: String) {

    val fileReader = FileReader(fileName)

    val bufferedReader = BufferedReader(fileReader)
    var line: String? = null
    val string = StringBuilder()
    while ({ line = bufferedReader.readLine(); line }() != null) {
        string.append(line)
    }
    bufferedReader.close()
    string.toString()
}