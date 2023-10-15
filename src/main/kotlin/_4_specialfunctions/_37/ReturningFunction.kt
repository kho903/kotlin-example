package _4_specialfunctions._37

/**
 * 함수를 반환하는 함수
 */
fun operation(): (Int) -> Int {
    return ::square
}

fun square(x: Int) = x * x

fun main() {
    val func = operation()
    println(func(2))
}