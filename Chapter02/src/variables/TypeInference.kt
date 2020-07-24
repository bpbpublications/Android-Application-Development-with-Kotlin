package variables

fun main(args: Array<String>) {
    val phoneNumber = 1234567891 // Takes Int as a type
    var isDataProcessed = false  // Becomes Boolean which can be either true or false
    val person = Person(
        name = "Hardik Trivedi", age = 31,
        address = Address(houseNumber = "7", streetName = "Lok kalyan marg", zipCode = "110001",
            province = "New Delhi", country = "India")
    )
}
data class Person(val name: String, val age: Int, val address: Address)
data class Address(val houseNumber: String, val streetName: String, val zipCode: String, val province: String,
                   val country: String)