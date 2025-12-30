package usecases.day03
import adapters.FileUtils


class NumberAdderManager {
    fun executePart01(lines: List<String>): Int {
        return lines.size
    }
}


fun main() {
    val lines = FileUtils("Day03.txt").linesToStringArray()
    NumberAdderManager().executePart01(lines)
}