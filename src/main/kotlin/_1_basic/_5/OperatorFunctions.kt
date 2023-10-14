package _1_basic._5

fun main() {
    operator fun Int.times(str: String) = str.repeat(this)
    println(2 * "하이 ")
    println(2.times("하이 "))

    operator fun String.get(range: IntRange) = substring(range)
    val str = "웃어라! 온 세상이 너와 함께 웃을 것이다."
    println(str[0..3])
}
