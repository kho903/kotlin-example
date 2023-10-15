package _5_collections._42

val openIssues: MutableSet<String> =
    mutableSetOf("uniqueDesc1", "uniqueDesc2", "uniqueDesc3")

fun addIssue(uniqueDesc: String) : Boolean {
    return openIssues.add(uniqueDesc)
}

fun getStatusLog(isAdded: Boolean): String {
    return if (isAdded) "잘 남겼습니다." else "중복 이슈입니다."
}

fun main() {
    val aNewIssue: String = "uniqueDesc4"
    val anIssueAlreadyIn: String = "uniqueDesc2"

    val aNewIssueStat = getStatusLog(addIssue(aNewIssue))
    val anIssueAlreadyInStat = getStatusLog(addIssue(anIssueAlreadyIn))
    println("이슈 $aNewIssue $aNewIssueStat")
    println("이슈 $anIssueAlreadyIn $anIssueAlreadyInStat")
}
