package extensions
import kotlin.math.abs

infix fun Int.distanceTo(other: Int): Long = abs(this.toLong() - other.toLong())
fun Int.splitInHalfOrNull(): Pair<Int, Int>? {
    val str = this.toString()
    if (str.length % 2 != 0) return null
    val half = str.length / 2
    return str.take(half).toInt() to str.substring(half).toInt()
}