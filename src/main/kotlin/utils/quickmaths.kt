package utils

fun getPossiblePeriods(length: Int): Sequence<Int> = sequence {
    for (i in 1..length / 2) {
        if (length % i == 0) yield(i)
    }
}