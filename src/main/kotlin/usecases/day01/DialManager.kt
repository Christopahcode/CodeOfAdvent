package usecases.day01

class SolveDay01(private val lines: List<String>)  {
    var position: Int = 50
    var rangeStart: Int = 0
    var rangeEnd: Int = 99


private fun goUp () {
    position = (position + steps + 1000) % 100
}

private fun goDown() {
    position = (position - steps + 1000) % 100
}

fun isAtZero() = position == 0






fun SolveDay01.isUp(charFromLine: String): Boolean =
    when (charFromLine) {
        "R" -> true
        "L" -> false
        else -> error("Not valid")
    }


}