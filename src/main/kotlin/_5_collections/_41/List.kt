package _5_collections._41

val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)
val sudoers: List<Int> = systemUsers

fun addSystemUser(newUser: Int) {
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int> {
    return sudoers
}

fun main() {
    addSystemUser(4)
    println("전체 sudoers: ${getSysSudoers().size}")
    getSysSudoers().forEach {
        i -> println("이용자 ${i}에 대한 정보")
    }
}
