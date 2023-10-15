package _2_controlflow._21

fun eatACake() = println("케이크 먹기")
fun bakeACake() = println("케이크 굽기")

fun main() {
    var cakesEaten: Int = 0
    var cakesBaked = 0

    while (cakesEaten < 5) {
        eatACake()
        cakesEaten++;
    }

    do {
        bakeACake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)
}