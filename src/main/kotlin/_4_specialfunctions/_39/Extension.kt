package _4_specialfunctions._39

data class Item(val name: String, val price: Int)

data class Order(val items: Collection<Item>)

fun Order.maxPricedItemValue(): Int = this.items.maxByOrNull { it.price }?.price ?: 0
fun Order.maxPricedItemName() = this.items.maxByOrNull { it.price }?.name ?: "NO_PRODUCTS"

val Order.commaDelimitedItemNames: String
    get() = items.map { it.name }.joinToString()

fun main() {
    val order = Order(listOf(
        Item("빵", 5000),
        Item("와인", 29000),
        Item("생수", 1500)))

    println("가방 비싼 식료품: ${order.maxPricedItemName()}")
    println("가방 비싼 가격: ${order.maxPricedItemValue()}")
    println("식료품: ${order.commaDelimitedItemNames}")
}
