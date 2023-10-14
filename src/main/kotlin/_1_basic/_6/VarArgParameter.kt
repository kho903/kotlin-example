package _1_basic._6

fun printAll(vararg messages: String) {
    for (m in messages) println(m)
}

fun printAllWithPrefix(vararg messages: String, prefix: String) {
    for (m in messages) println(prefix + m)
}

fun log(vararg entries: String) {
    printAll(*entries)
}

fun main() {
    println("====== printAll =======")
    printAll("Hello", "Hallo", "Salut", "Hola", "안녕")
    println("====== printAllWithPrefix =======")
    printAllWithPrefix(
        "Hello", "Hallo", "Salut", "Hola", "안녕",
        prefix = "Greeting: "
    )
    println("====== log =======")
    log("Hello", "Hallo", "Salut", "Hola", "안녕")
}
