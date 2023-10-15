package _4_specialfunctions._38

/**
 * 람다 함수
 * 아래 모든 예제는 주어진 문자열을 대문자로 바꿈.
 * String -> String
 */
fun main() {
    val upperCase1: (String) -> String = { str: String -> str.uppercase() }
    val upperCase2: (String) -> String = { str -> str.uppercase() }
    val upperCase3 = { str: String -> str.uppercase() }
    // 둘 다 추론을 할 수는 없음.
//    val upperCase4 = { str -> str.upperCase() }
    val upperCase5: (String) -> String = { it.uppercase() }
    val upperCase6: (String) -> String = String::uppercase

    println(upperCase1("hello"))
    println(upperCase2("hello"))
    println(upperCase3("hello"))
    println(upperCase5("hello"))
    println(upperCase6("hello"))
}