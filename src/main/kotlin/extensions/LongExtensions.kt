package extensions

fun Long.isInvalidId(): Boolean {
    val s = this.toString()
    if (s.length % 2 != 0) return false
    val half = s.length / 2
    return s.take(half) == s.substring(half)
}