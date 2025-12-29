package extensions

import utils.getPossiblePeriods

fun Long.isInvalidId(): Boolean {
    val s = this.toString()
    if (s.length % 2 != 0) return false
    val half = s.length / 2
    return s.take(half) == s.substring(half)
}

fun Long.isInvalidIdPart02(): Boolean {
    val s = toString()
    if (s.length < 2) return false

    return getPossiblePeriods(s.length)
        .any { period -> s.isRepeatedPattern(period) && s.length / period >= 2 }
}