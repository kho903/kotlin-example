package _4

fun main() {
    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Bye ")
    println(2.times("Bye ")) // 가능.

    val pair = "자바" to "오라클"
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "코틀린" onto "젯브레인스"
    println(myPair)

    val koo = Person("손석구")
    val yeon = Person("장도연")
    koo likes yeon
    println(koo.likedPeople.map { it.name } )
}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) {
        likedPeople.add(other)
    }
}
