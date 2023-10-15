package _2_controlflow._22

class Animal(val name: String)

class Zoo(val animals: List<Animal>) {

    operator fun iterator(): Iterator<Animal> {
        return animals.iterator()
    }
}

fun main() {
    val zoo = Zoo(listOf(Animal("얼룩말"), Animal("사자")))

    for (animal in zoo) {
        println("여기 ${animal.name} 있어요!")
    }
}