package extensions
import kotlin.math.abs

infix fun Int.distanceTo(other: Int): Long = abs(this.toLong() - other.toLong())
fun formulaUp(steps: Int, position: Int): Int   { return (position + steps + 1000) % 100 }
fun formulaDown(steps: Int, position: Int): Int { return (position - steps + 1000) % 100 }