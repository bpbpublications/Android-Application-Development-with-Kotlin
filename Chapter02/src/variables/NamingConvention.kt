package variables

fun main() {
    //val 1num = 10 //Error. Not valid
    val num1 = 20 //Can contain number

    val email_address = "email@provider.com" // Valid name but _ are not recommended

    //val @ddress = "London" //Error. No special characters are allowed except underscores '_'

    val _classVariable = "Some value" // Valid

    val sOMEgibBerisH = false // Valid name but not recommended

    val selectedRecipe="Potato" // camelCase are perfect for naming a variable

    //Below declaration is valid only if you have to name a variable to meet some outside dependency
    val `val when var fun class`="Some value"
}