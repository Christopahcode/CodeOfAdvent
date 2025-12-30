package usecases.day03
import adapters.FileUtils
import extensions.allTwoDigitCombinations


class NumberAdderManager {
    fun executePart01(lines: List<String>): Int {
        val totalSum = lines.sumOf { line ->
            line.allTwoDigitCombinations().maxOf { it.toInt() }
        }
        return totalSum
    }
}

fun main() {
    val lines = FileUtils("Day03.txt").linesToStringArray()
    val result = NumberAdderManager().executePart01(lines)
    println(result)
}