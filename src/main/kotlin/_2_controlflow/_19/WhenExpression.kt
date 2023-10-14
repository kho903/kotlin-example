package _2_controlflow._19

fun main() {
    println(whenAssign("안녕"))   // 1
    println(whenAssign(3.4))     // 42
    println(whenAssign(1))       // 하나
    println(whenAssign(0L))      // false
    println(whenAssign(MyClass()))   // 42
}

fun whenAssign(obj: Any): Any {
    val result = when (obj) {
        1 -> "하나"
        "안녕" -> 1
        is Long -> false
        else -> 42
    }
    return result
}

class MyClass
