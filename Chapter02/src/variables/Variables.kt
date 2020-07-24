package variables

fun main() {
    //val dob // Doesn't work. Have to provide either value or type

    val age = 30 // Works fine
    //age = 32 // This will not compile as val can not be changed

    val name: String //Allows declaration without value if type is specified.
    name = "Hardik" // Only works while assigning value first time
    //name = "Hardik Trivedi" // Refer to the principle where val can not be changed

    var address = "Ahemedabad, India"
    address = "London, UK" // var can be change anytime

    //var pinCode // Doesn't work. Have to provide either value or type

    var pinCode = "EC1N 8EB"
    //pinCode = 380058 // Will not work, as you can only change the value and not the type

}