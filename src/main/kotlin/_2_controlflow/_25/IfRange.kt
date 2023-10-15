package _2_controlflow._25

fun main() {

    val x = 2
    if (x in 1..5) {
        println("x는 1에서 5 사이의 수")
    }

    if (x !in 6..10) {
        println("x는 6에서 10 사이의 수가 아님")
    }
}