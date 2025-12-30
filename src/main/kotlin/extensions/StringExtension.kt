package extensions

fun String.toSteps(): Int =
    this.dropWhile { !it.isDigit() }
        .takeWhile { it.isDigit() }
        .toIntOrNull() ?: 0

fun String.isRepeatedPattern(period: Int): Boolean =
    this == substring(0, period).repeat(length / period)


fun String.allTwoDigitCombinations(): List<String> {
    val pairs = mutableListOf<String>()
    for (i in this.indices) {
        for (j in i + 1 until this.length) {
            val pair = "${this[i]}${this[j]}"
            pairs.add(pair)
        }
    }
    return pairs
}