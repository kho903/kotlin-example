package _3_specialclasses._29

enum class State {
    IDLE, RUNNING, FINISHED
}

fun main() {
    val state = State.RUNNING
    val message = when (state) {
        State.IDLE -> "대기 중"
        State.RUNNING -> "실행 중"
        State.FINISHED -> "완료"
    }
    println(message)
}
