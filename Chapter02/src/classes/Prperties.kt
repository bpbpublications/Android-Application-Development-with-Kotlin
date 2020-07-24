package classes

// Uncomment only one main function at a time.
/*
fun main() {
    val hatchBack = HatchBack(numberOfDoors = 2, colour = "Red")
    println("Doors ${hatchBack.numberOfDoors}")
    println("Speed ${hatchBack.speedLimit}")
    println("Colour ${hatchBack.colour}")

    println(hatchBack.isPremiumCar)// Prints true or false based on getter

    //Gives you compilation error because property is defined as val
    //hatchBack.isPremiumCar=false


    println(hatchBack.carName) // Prints Default Car
    hatchBack.carName = "Polo"
    println(hatchBack.carName) // Prints Polo
    hatchBack.carName = "P@&l" // Throws exception

    val person =Person("",1,"")
    person.age=20
}*/

fun main() {
    // Gives compilation error as StudentV1 class only offers secondary parameterised constructor.
    //val student = StudentV1()

    // Valid object creation
    val student = StudentV1(name = "Hardik", studentId = 1)

    val student1 = StudentV2(name = "Hardik")
    val student2 = StudentV2(name = "Hardik", studentId = 1)
    val student3 = StudentV2(name = "Hardik", studentId = 1, courseId = 10)
}

/*
fun main() {
    // Invokes implicit default constructor
    val person = Person1()
}*/
