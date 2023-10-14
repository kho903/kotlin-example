package _1_basic._16

open class Tiger(val origin: String) {
    fun sayHello() {
        println("${origin}의 타이거 왈: 어흥!")
    }
}

class SiberianTiger: Tiger("시베리아")


fun main() {
    val tiger: Tiger = SiberianTiger()
    tiger.sayHello() // 시베리아의 타이거 왈: 어흥!
}