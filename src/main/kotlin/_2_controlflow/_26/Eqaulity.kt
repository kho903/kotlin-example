package _2_controlflow._26

fun main() {
    val authors = setOf("셰익스피어", "헤밍웨이", "트웨인")
    val writers = setOf("트웨인", "셰익스피어", "헤밍웨이")

    println(authors == writers) // true
    println(authors === writers) // false
    println(authors === authors) // true
}