package _2_controlflow._18

fun main() {
    cases("Hello")      // 인사
    cases(1)            // 하나
    cases(0L)           // Long
    cases(MyClass())        // 문자열 아님
    cases("hello")      // 그 외
}

fun cases(obj: Any) {
    when (obj) {
        1 -> println("하나")
        "Hello" -> println("인사")
        is Long -> println("Long")
        !is String -> println("문자열 아님")
        else -> println("그 외")
    }
}

class MyClass