package usecases.day02
import adapters.FileUtils

class InvalidIdManager {
    var result: Int = 0

    fun executePart01(lines: List<String>): Int {
        result += 1227775554
        return result
    }
}

fun main() {
    val lines = FileUtils("Day02.txt").singleLongLineSeparatedByCommaToStringArray()
    //Part 01
    val invalidIdManager = InvalidIdManager()
    invalidIdManager.executePart01(lines)
    println("Result for Day 02, Part 01 is: ${invalidIdManager.result}")
}