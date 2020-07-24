package typeCasting

fun handleError(e: Exception) {
    when (e) {
        is NetworkUnavailableException -> println(e.message)/*Handle unavailable*/
        is MalformedUrlException -> println(e.message)/*Handle malformed url*/
        is UnauthorisedRequestException -> println(e.message)/*Handle invalid request*/
        is InvalidResponseException -> println(e.message)/*Handle invalid response*/
        else -> println(e.message) /*Handle generic*/
    }
}

class NetworkUnavailableException(override val message: String?) : Exception(message)
class MalformedUrlException(override val message: String?) : Exception(message)
class UnauthorisedRequestException(override val message: String?) : Exception(message)
class InvalidResponseException(override val message: String?) : Exception(message)


fun isNotANumber(num: Any): Boolean {
    return num !is Byte || num !is Short || num !is Int || num !is Long
            || num !is Float || num !is Double
}

fun smartCast(data: Any) {
    when (data) {
        is String -> println("It's a string and length is ${data.length}")
        is Number -> println("It's a number and some calculation can be performed")
        is Exception -> println("It's an exception and message is ${data.message}")
        is Boolean -> println("It's a boolean with value $data")
        else -> println("I don't recognise this type at the moment")
    }
}

var obj: Any? = null

fun main() {
    obj = "Hardik"

    if (obj is Number) {
        obj = 30
        // println(obj) Gives compile time error
    }
}