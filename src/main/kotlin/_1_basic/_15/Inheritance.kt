package _1_basic._15

open class Dog {
    open fun sayHello() {
        println("멍멍!")
    }
}

class Yorkshire : Dog() {
    override fun sayHello() {
        println("왈왈!")
    }
}


fun main() {
    val dog: Dog = Yorkshire()
    dog.sayHello() // 왈왈!

}