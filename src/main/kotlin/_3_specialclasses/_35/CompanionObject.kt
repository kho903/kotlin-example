package _3_specialclasses._35

class BigBen {
    companion object {
        fun getBongs(nTimes: Int) {
            for (i in 1..nTimes) {
                print("Bong ")
            }
        }
    }
}

fun main() {
    BigBen.getBongs(12)
}