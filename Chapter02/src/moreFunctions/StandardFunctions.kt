package moreFunctions

fun main() {
    val person = Person(age = 32, name = "Hardik", address = "London")

    with(person) {
        println(age)
        println(name)
        println(address)
        printIntroduction()
        name = "Hardik Trivedi"
        printIntroduction()
    }

    with(person) {
        println(age)
        println(name)
        println(address)
        printIntroduction()
        name = "Hardik Trivedi"
        printIntroduction()
    }

    person.run {
        println(age)
        println(name)
        println(address)
        printIntroduction()
        name = "Hardik Trivedi"
        printIntroduction()
    }

    person?.run {
        println(age)
        println(name)
        println(address)
        printIntroduction()
        name = "Hardik Trivedi"
        printIntroduction()
    }

    println("===========================")
    letExample()
}

// Do not uncomment the body
fun testJavaAndKotlinCode() {
    /*
    // A usual java code to start activity with intent having extras
    Intent intent = new Intent(this, AnotherActivity.class);
    intent.putExtra("NAME", <name>);
    intent.putExtra("AGE", <age>);
    intent.putExtra("ADDRESS", <address>);
    startActivity(intent);

    // Start activity with intent having extras using Kotlin
    val intent =Intent(this@CurrentActivity, AnotherActivity::class.java).apply{
        putExtra("NAME", <name>)
        putExtra("AGE", <age>)
        putExtra("ADDRESS", <address>)
    }
    startActivity(intent);*/
}

fun letExample() {
    var person: Person? = null
    var doubleAge = person?.let { it.age * 2 }
    println(doubleAge)

    person = Person(name = "Maanya", age = 5, address = "London")
    doubleAge = person?.let { it.age * 2 }
    println(doubleAge)
}

class Person(var name: String, var age: Int, var address: String) {
    fun printIntroduction() {
        println("I am $name with age $age. I live in $address. ")
    }
}




