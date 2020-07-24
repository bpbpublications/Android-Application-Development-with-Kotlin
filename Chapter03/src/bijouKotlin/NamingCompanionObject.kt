package bijouKotlin

open class Super {
    open fun sayHello() {
        println("Hello")
    }
}

class Some {
    companion object Child : Super() {
        override fun sayHello() {
            super.sayHello()
            println("Hello from companion object")
        }
    }
}

fun main() {
    Some.Child.sayHello()
}