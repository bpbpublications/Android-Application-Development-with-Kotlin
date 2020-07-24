package classes

class Person(val name: String, var age: Int, address: String) {
    init {
        println("Constructing person object with name $name. Age is $age and lives in $address")
    }

    fun printPrettyPerson() {
        /**
         * Only name is accessible in entire class.
         * Other params not marked as val are not visible in other areas of class
         */
        //"Person object with name $name. Age is $age and lives in $address"
    }
}

class Person1 {
    var name: String = ""
    var age: Int = 0
    var address: String = ""
}