package classes.nestedAndInner

class Outer {
    var outerNum = 10

    class Nested {
        var innerNum = 20

        fun doSomething() {
            //println("Outer num is $outerNum") Gives compilation error
            println("Inner num is $innerNum")
        }
    }

    inner class Inner {
        var innerNum = 20

        fun doSomething() {
            println("Outer num is $outerNum") // Allowed
            println("Inner num is $innerNum")
        }
    }
}

fun main() {
    val nested = Outer.Nested()
    nested.doSomething()

    val inner = Outer().Inner()
    inner.doSomething()
}