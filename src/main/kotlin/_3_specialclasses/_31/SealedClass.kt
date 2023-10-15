package _3_specialclasses._31

sealed class Mammal(val name: String)

class Cat(val catName: String) : Mammal(catName)
class Human(val humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal) : String =
    when (mammal) {
        is Human ->
            "안녕하세요, ${mammal.name}님. 직업은 ${mammal.job}이시군요."
        is Cat ->
            "안녕, ${mammal.name}"
    }


fun main() {
    println(greetMammal(Cat("Snowy")))
    println(greetMammal(Human("Kim", "개발자")))
}