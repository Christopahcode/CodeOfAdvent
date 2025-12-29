package extensions

fun String.toSteps(): Int =
    this.dropWhile { !it.isDigit() }
        .takeWhile { it.isDigit() }
        .toIntOrNull() ?: 0

fun String.isRepeatedPattern(period: Int): Boolean =
    this == substring(0, period).repeat(length / period)