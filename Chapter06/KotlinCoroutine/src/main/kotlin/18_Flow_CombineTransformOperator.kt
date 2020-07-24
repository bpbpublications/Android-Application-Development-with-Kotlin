import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.combineTransform
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() = runBlocking {
    val timeTaken = measureTimeMillis {
        combine(getNumber(), getAlphabets(), getAlphabetsLower()) { one, A, a ->
            //println("$one $A $a")
            "$one $A $a"
        }.collect { result ->
            println("Final result $result")
        }
    }
    println("====== Total time to execute is $timeTaken ======")

    val timeTakenTransform = measureTimeMillis {
        combineTransform(getNumber(), getAlphabets(), getAlphabetsLower()) { one, A, a ->
            emit("$one $A $a")
        }.collect { result ->
            println("Final result $result")
        }
    }
    println("====== Total time to execute with transform is $timeTakenTransform ======")
}