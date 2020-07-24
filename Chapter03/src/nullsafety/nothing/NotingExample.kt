package nullsafety.nothing


import kotlin.test.fail

data class APIResponse(val code: Int, val `data`: String?)

data class Person(val name: String?, val age: Int?, val address: String?)

fun main() {
    val response = APIResponse(200, "Success")

    // Can return null and data will be inferred as nullable type.
    val data = response.data

    // Can not return null and compile will infer nonNullData as non nullable property
    val nonNullData = response.data ?: fail("Data is not available in response")
}

fun processData(data: APIResponse?) {
    val nonNullableData = data?.data ?: fail("Server did not return anything")
    //fail("Server did not return anything")
    /*else{
        throw Exception("")
    }*/
    //data.data?:throw Error("")
    //fail("Data is in invalid state")
    //throw Exception("")
}