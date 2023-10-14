package _1_basic._10

fun main() {
    var neverNull: String = "이 변수는 null이 될 수 없습니다."

//    neverNull = null

    var nullable: String? = "이 변수는 null이 될 수 있습니다."

    nullable = null

    var inferredNonNull = "컴파일러 타입추론은 null-불가로 봅니다."

//    inferredNonNull = null

    fun strLength(notNull: String): Int {
        return notNull.length
    }

    strLength(neverNull)
//    strLength(nullable)
}