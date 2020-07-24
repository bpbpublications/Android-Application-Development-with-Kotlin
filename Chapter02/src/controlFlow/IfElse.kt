package controlFlow

fun main() {
    val num = 10
    if (num.rem(2) == 0) {
        println("Number is even")
    } else {
        println("Number is odd")
    }

    val num1 = 10
    val num2 = 30
    val maxNumber = if (num1 > num2) num1 else num2

}

fun evaluateGrade(marks: Int): String {
    if (marks >= 70) {
        return   "Distinction"
    } else if (marks >= 60) {
        return "First class"
    } else if (marks >= 50) {
        return "Second class"
    } else if (marks >= 30) {
        return "Pass class"
    } else {
        return "Fail"
    }
}