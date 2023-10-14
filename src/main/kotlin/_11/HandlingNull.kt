package _11

fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "문자열 길이: ${maybeString.length}"
    } else {
        return "빈 문자열이거나 null입니다."
    }
}

fun main() {
    println(describeString(null))
    println(describeString(""))
    println(describeString("String 입니다."))
}