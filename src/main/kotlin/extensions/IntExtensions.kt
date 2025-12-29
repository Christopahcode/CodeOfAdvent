package extensions
import kotlin.math.abs

infix fun Int.distanceTo(other: Int): Long = abs(this.toLong() - other.toLong())
