package controlFlow

import Strings.Ingredient
import java.util.*
import kotlin.collections.HashMap

fun main() {
    println(getCurrentMonthName())
}

fun evaluateSmartGrade(marks: Int): String {
    return when {
        marks >= 70 -> "Distinction"
        marks >= 60 -> "First class"
        marks >= 50 -> "Second class"
        marks >= 30 -> "Pass class"
        else -> "Fail"
    }
}

fun getCurrentMonthName(): String {
    return when (val month = Calendar.getInstance().get(Calendar.MONTH)) {
        0 -> "Jan"
        1 -> "Feb"
        2 -> "Mar"
        3 -> "Apr"
        4 -> "May"
        5 -> "Jun"
        6 -> "Jul"
        7 -> "Aug"
        8 -> "Sep"
        9 -> "Oct"
        10 -> "Nov"
        11 -> "Dec"
        else -> "Invalid number $month"
    }
}

fun getGradeRemarks(grade: String) = when (grade) {
    "A" -> "Excellent!"
    "B" -> "Good!"
    "C" -> "You need to work little bit more!"
    "D" -> "You need to do real hard work!"
    else -> "Invalid grade. Are you from Mars!"
}

fun whatIsThisType(temperature: Any) {
    when (temperature) {
        is Short, Int, Float, Double -> println("I can perform mathematical operations")
        is String -> println("I have series of characters")
        is Exception -> println("I am an exception, something is wrong")
        is List<*> -> println("I have collection of objects")
        is Map<*, *> -> println("I am holding some key value")
    }
}
